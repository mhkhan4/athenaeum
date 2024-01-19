package gmpu.athenaeum.model;
import lombok.*;
import org.springframework.data.annotation.Id;


/*
Example: You can store elements in an array
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Note {
    @Id
    private Integer id;
    private String content;
    private Integer sourceId;
    private Integer userId;
}
