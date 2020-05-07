package kg.tommy.securityexam.controller;

import kg.tommy.securityexam.entity.TableCourse;
import kg.tommy.securityexam.repository.TableCourseRepository;
import kg.tommy.securityexam.service.TableCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/table")
public class TableCourseController {
    @Autowired
    private TableCourseService tableCourseService;
    @PostMapping
    public TableCourse create(@RequestBody TableCourse tableCourse){
        return tableCourseService.create(tableCourse);
    }
}
