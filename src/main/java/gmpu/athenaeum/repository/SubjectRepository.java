package gmpu.athenaeum.repository;

import gmpu.athenaeum.model.Subject;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubjectRepository extends ReactiveCrudRepository<Subject, Integer> {}
