package kg.examtommy.exammm.repository;

import kg.examtommy.exammm.entity.TicketT;
import kg.examtommy.exammm.model.CinemaBrodway;
import kg.examtommy.exammm.model.Ticketon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketonRepository extends JpaRepository<TicketT,Long> {
}
