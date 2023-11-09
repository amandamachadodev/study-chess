package studychess.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import studychess.models.OpeningModel;

import java.io.Serializable;

@Repository
public interface OpeningRepository extends JpaRepository<OpeningModel, Long> {}
