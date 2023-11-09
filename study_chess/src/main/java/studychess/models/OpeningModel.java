package studychess.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name= "opening")
@Table(name = "opening")
public class OpeningModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false, length = 50)
    private String name;
    @Column(name = "type", nullable = false, length = 50)
    private String type;
    @Column(name = "description", nullable = false, length = 200)
    private String description;
}
