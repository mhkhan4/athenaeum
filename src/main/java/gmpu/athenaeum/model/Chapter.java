package gmpu.athenaeum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Chapter {
    @Id
    private Integer id;
    private String name;
    private Integer sourceId;
}

/*
Need another table called noteSource to have many to many relationship with note and source.
    note_id foreignKey;
    source_id foreignKey;
 */
