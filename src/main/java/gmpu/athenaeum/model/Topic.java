package gmpu.athenaeum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;


/*
Example: Definition
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Topic {
    @Id
    private Integer id;
    private String name;
    private Integer subCategoryId;
}
