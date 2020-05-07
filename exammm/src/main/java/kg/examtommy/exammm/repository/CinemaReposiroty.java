package kg.examtommy.exammm.repository;

import kg.examtommy.exammm.entity.Cinema;
import kg.examtommy.exammm.model.CinemaBrodway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CinemaReposiroty extends JpaRepository<Cinema,Long> {
}
