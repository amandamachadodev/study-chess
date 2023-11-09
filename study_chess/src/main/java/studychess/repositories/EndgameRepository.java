package studychess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studychess.models.EndgameModel;

@Repository
public interface EndgameRepository extends JpaRepository<EndgameModel, Long> {
}
