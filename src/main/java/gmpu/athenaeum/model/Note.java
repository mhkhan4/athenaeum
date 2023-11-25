package gmpu.athenaeum.model;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("note")
public class Note {
    @Id
    private Integer noteId;
    private String topic;
    private String category;
    private String noteInDetails;
    private Integer sourceId;
    private Integer userId;
}
