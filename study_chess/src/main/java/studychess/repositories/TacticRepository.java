package studychess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studychess.models.TacticModel;

@Repository
public interface TacticRepository extends JpaRepository<TacticModel, Long> {}
