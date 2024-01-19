package gmpu.athenaeum.model;

import gmpu.athenaeum.constant.Accessibility;
import gmpu.athenaeum.constant.SourceType;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDate;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Source {
    @Id
    private Integer sourceId;
    private SourceType sourceType;
    private String title;
    private String author;
    private String path;
    private Integer pageNumber;
    private LocalDate publishDate;
    private String description;
    private Accessibility accessibility;

    private Integer categoryId; //foreign key
}