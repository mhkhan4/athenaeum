package gmpu.athenaeum.repository;

import gmpu.athenaeum.constant.SourceType;
import gmpu.athenaeum.model.Source;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface SourceRepository extends ReactiveCrudRepository<Source, Integer> {
    Flux<Source> findBySourceType(SourceType sourceType);
    Flux<Source> findByTitle(String title);
    Flux<Source> findByAuthor(String author);
}