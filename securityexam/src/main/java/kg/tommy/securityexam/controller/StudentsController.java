package kg.tommy.securityexam.controller;

import kg.tommy.securityexam.entity.Students;
import kg.tommy.securityexam.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/students")
public class StudentsController {
    @Autowired
    private StudentsService studentsService;

    @GetMapping
    public List<Students> getAll() {
        return studentsService.getAll();
    }

    @GetMapping("/{id}")
    public Students getById(@PathVariable Long id) {
        return studentsService.getById(id);

    }

    @PostMapping
    public Students create(@RequestBody Students students) {
        return studentsService.create(students);
    }

    @DeleteMapping
    public Students deleteById(@RequestParam(name = "id") Long id) {
        return studentsService.deleteById(id);
    }

    @GetMapping("/name")
    public List<String> searchByName(@RequestHeader String name) {
        return studentsService.searchByName(name);
    }
}
