package gmpu.athenaeum.controller;

import gmpu.athenaeum.model.Subject;
import gmpu.athenaeum.repository.SubjectRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
@RequestMapping("/api/subject")
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class SubjectController {

    private final SubjectRepository subjectRepository;

    @GetMapping
    public Flux<Subject> getSubjects() {
        return subjectRepository.findAll();
    }

    @PostMapping
    public Mono<Subject> addSubject(@RequestBody Subject subject) {
        return subjectRepository.save(subject);
    }

    @DeleteMapping()
    public Mono<String> deleteSubject(@RequestParam int subjectId) {
        return subjectRepository.deleteById(subjectId)
                .then(Mono.just("Deleted subject with id " + subjectId + " successfully"));
    }

}
