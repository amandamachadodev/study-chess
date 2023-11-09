package studychess.models;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name= "tactic")
@Table(name = "tactic")
public class TacticModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "type", nullable = false, length = 50)
    private String type;
    @Column(name = "description", nullable = false, length = 200)
    private String description;
}
