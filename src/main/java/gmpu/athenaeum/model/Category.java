package gmpu.athenaeum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/*
Example: Data Structures
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Category {
    @Id
    private Integer id;
    private String name;
    private Integer subjectId;
}


