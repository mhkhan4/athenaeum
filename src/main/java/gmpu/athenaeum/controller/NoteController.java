package gmpu.athenaeum.controller;

import gmpu.athenaeum.model.Note;
import gmpu.athenaeum.repository.NoteRepository;
import gmpu.athenaeum.service.NoteService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/notes")
@AllArgsConstructor
public class NoteController {

    private final NoteRepository noteRepository;
    private final NoteService noteService;

    @GetMapping("/user/{userId}")
    public Flux<Note> getNotesByUserId(@PathVariable Integer userId) {
        return noteRepository.findByUserId(userId);
    }

    @GetMapping("/source/{sourceId}")
    public Flux<Note> getNotesBySourceId(@PathVariable Integer sourceId) {
        return noteRepository.findBySourceId(sourceId);
    }

    @GetMapping()
    public Flux<Note> getAllTheNotes(){
        return noteRepository.findAll();
    }

    @GetMapping("/{noteId}")
    public Mono<Note> getNoteById(@PathVariable Integer noteId){
        return noteRepository.findById(noteId);
    }

    @PostMapping
    public Mono<Note> addNote(@RequestBody Note note){
        return noteService.createNote(note);
    }

    @DeleteMapping("/{noteId}")
    public Mono<Void> deleteNote(@PathVariable Integer noteId){
        return noteRepository.deleteById(noteId);
    }
}
