package gmpu.athenaeum.repository;
import gmpu.athenaeum.model.Note;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.UUID;

@Repository
public interface NoteRepository extends ReactiveCrudRepository<Note, Integer> {
}

