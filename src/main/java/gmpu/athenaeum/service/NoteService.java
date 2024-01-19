package gmpu.athenaeum.service;

import gmpu.athenaeum.model.Category;
import gmpu.athenaeum.model.Note;
import gmpu.athenaeum.model.Source;
import gmpu.athenaeum.model.User;
import gmpu.athenaeum.repository.*;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Objects;

@Service
@RequiredArgsConstructor
public class NoteService {
//
//    private NoteRepository noteRepository;
//    private SourceRepository sourceRepository;
//    private UserRepository userRepository;
//    private CategoryRepository categoryRepository;
//    private SubCategoryRepository subCategoryRepository;
//
//    public Mono<Note> createNote(Note note) {
//        Mono<Boolean> sourceExists = checkExists(note.getSourceId(), sourceRepository);
//        Mono<Boolean> userExists = checkExists(note.getUserId(), userRepository);
//        Mono<Boolean> categoriesExist = checkCategoriesExist(note.getCategoryIds());
//        Mono<Boolean> subCategoriesExist = checkSubCategoriesExist(note.getSubCategoryIds());
//
//        return Mono.when(sourceExists, userExists, categoriesExist, subCategoriesExist)
//                .then(noteRepository.save(note));
//    }
//
//    private Mono<Boolean> checkExists(Integer id, ReactiveCrudRepository<?, Integer> repository) {
//        return Mono.justOrEmpty(id)
//                .flatMap(repository::existsById)
//                .switchIfEmpty(Mono.error(new IllegalArgumentException("Entity not found for the given id: " + id)));
//    }
//
//    private Mono<Boolean> checkCategoriesExist(List<Integer> categoryIds) {
//        return Flux.fromIterable(categoryIds)
//                .flatMap(categoryRepository::existsById)
//                .all(Boolean::booleanValue)
//                .switchIfEmpty(Mono.error(new IllegalArgumentException("One or more categories not available")));
//    }
//
//    private Mono<Boolean> checkSubCategoriesExist(List<Integer> subCategoryIds) {
//        return Flux.fromIterable(subCategoryIds)
//                .flatMap(subCategoryRepository::existsById)
//                .all(Boolean::booleanValue)
//                .switchIfEmpty(Mono.error(new IllegalArgumentException("One or more subcategories not available")));
//    }



}
