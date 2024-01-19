package gmpu.athenaeum.repository;

import gmpu.athenaeum.model.SubCategory;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;

public interface SubCategoryRepository extends ReactiveCrudRepository<SubCategory, Integer> {
}
