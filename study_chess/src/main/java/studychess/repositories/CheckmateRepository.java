package studychess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studychess.models.CheckmateModel;

@Repository
public interface CheckmateRepository extends JpaRepository<CheckmateModel, Long> {
}
