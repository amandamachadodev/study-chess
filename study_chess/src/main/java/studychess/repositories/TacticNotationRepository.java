package studychess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studychess.models.TacticNotationModel;

@Repository
public interface TacticNotationRepository  extends JpaRepository<TacticNotationModel, Long> {}
