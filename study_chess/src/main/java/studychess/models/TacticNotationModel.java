package studychess.models;

import java.io.Serializable;
import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Data
@Getter
@Setter
@NoArgsConstructor
@Entity(name= "tactic_notation")
@Table(name = "tactic_notation")
public class TacticNotationModel implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tactic_id", nullable = false)
    private int tacticId;
    @Column(name = "sequence", nullable = false, length = 2)
    private int sequence;
    @Column(name = "movement", nullable = false, length = 10)
    private String movement;
}
