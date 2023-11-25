package gmpu.athenaeum.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table("user")
public class User {
    @Id
    @Column("userId")
    private Integer userId;
    @Column("userName")
    private String userName;
    @Column("password")
    private String password;
}
