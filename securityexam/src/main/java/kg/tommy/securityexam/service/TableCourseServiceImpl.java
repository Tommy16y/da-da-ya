package kg.tommy.securityexam.service;

import kg.tommy.securityexam.entity.TableCourse;
import kg.tommy.securityexam.repository.TableCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TableCourseServiceImpl implements TableCourseService {
    @Autowired
    private TableCourseRepository tableCourseRepository;
    @Override
    public TableCourse create(TableCourse tableCourse) {
        return tableCourseRepository.save(tableCourse) ;
    }
}
