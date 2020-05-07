package kg.tommy.securityexam.service;

import kg.tommy.securityexam.entity.Students;

import java.util.List;

public interface StudentsService {
    List<Students> getAll();
    Students create(Students students);
    Students getById(Long id);
    Students deleteById(Long id);

    List<String> searchByName(String name);
}
