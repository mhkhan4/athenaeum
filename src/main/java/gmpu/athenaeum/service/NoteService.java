package gmpu.athenaeum.service;

import gmpu.athenaeum.model.Note;
import gmpu.athenaeum.repository.NoteRepository;
import gmpu.athenaeum.repository.SourceRepository;
import gmpu.athenaeum.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@AllArgsConstructor
@Service
public class NoteService {
    private final NoteRepository noteRepository;
    private final UserRepository userRepository;
    private final SourceRepository sourceRepository;

    // Inject necessary repositories...

    public Mono<Note> createNote(Note note) {
        return validateAndSave(note);
    }

    private Mono<Note> validateAndSave(Note note) {
        return Mono.zip(
                        userRepository.findById(note.getUserId()).hasElement(),
                        sourceRepository.findById(note.getSourceId()).hasElement()
                )
                .flatMap(tuple -> {
                    boolean userExists = tuple.getT1();
                    boolean sourceExists = tuple.getT2();

                    if (!userExists || !sourceExists) {
                        return Mono.error(new IllegalArgumentException("Both User and Source must be specified to create a Note."));
                    }

                    // Set additional properties or perform other validation as needed
                    // For example:
                    return noteRepository.save(note);
                });
    }

}