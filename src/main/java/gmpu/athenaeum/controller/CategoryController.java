package gmpu.athenaeum.controller;

import gmpu.athenaeum.model.Category;
import gmpu.athenaeum.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/category")
@RequiredArgsConstructor
@CrossOrigin(origins = "http://localhost:4200")
public class CategoryController {
    private final CategoryRepository categoryRepository;

    @GetMapping("subject/{subjectId}")
    public Flux<Category> getCategoryBySubjectId(@PathVariable Integer subjectId) {
        return categoryRepository.findBySubjectId(subjectId);
    }

    @PostMapping
    public Mono<Category> addCategory(@RequestBody Category category) {
        return categoryRepository.save(category);
    }
}
