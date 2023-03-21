package googledrive.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "View_table")
@Data
public class View {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

    private String name;
    private Float size;
    private String path;
    private String type;
    private Boolean isIndexed;
    private Boolean isUploaded;
    private String url;
}
