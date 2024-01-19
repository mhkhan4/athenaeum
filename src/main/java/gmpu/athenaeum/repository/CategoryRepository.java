package gmpu.athenaeum.repository;

import gmpu.athenaeum.model.Category;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface CategoryRepository extends ReactiveCrudRepository<Category, Integer> {

    Flux<Category> findBySubjectId(Integer subjectId);

}
