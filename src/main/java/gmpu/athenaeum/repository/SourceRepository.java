package gmpu.athenaeum.repository;

import gmpu.athenaeum.constant.SourceType;
import gmpu.athenaeum.model.Source;
import org.springframework.data.r2dbc.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Repository
public interface SourceRepository extends ReactiveCrudRepository<Source, Integer> {
}