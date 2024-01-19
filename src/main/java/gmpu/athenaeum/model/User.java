package gmpu.athenaeum.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    @Id
    private Integer userId;
    private String userName;
    private String password;
}
