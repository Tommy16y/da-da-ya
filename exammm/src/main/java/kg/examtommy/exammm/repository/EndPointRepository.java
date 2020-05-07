package kg.examtommy.exammm.repository;

import kg.examtommy.exammm.entity.EndPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EndPointRepository extends JpaRepository<EndPoint,Long> {

}
