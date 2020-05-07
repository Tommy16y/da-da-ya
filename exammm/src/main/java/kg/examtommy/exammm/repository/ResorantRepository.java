package kg.examtommy.exammm.repository;

import kg.examtommy.exammm.entity.Restorant;
import kg.examtommy.exammm.model.RestorantNavat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResorantRepository extends JpaRepository<Restorant,Long> {
}
