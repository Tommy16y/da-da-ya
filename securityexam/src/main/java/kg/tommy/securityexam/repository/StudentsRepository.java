package kg.tommy.securityexam.repository;

import kg.tommy.securityexam.entity.Students;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface StudentsRepository extends JpaRepository<Students,Long > {
    List<String > findAllByNameContaining(String name);
}
