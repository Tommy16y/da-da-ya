package kg.tommy.securityexam.repository;

import kg.tommy.securityexam.entity.TableCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableCourseRepository extends JpaRepository<TableCourse, Long> {

}
