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


}
