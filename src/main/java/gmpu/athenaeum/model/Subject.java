package gmpu.athenaeum.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

/*
Example: Computer Science
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Subject {
    @Id
    private Integer id;
    private String name;
}

