package kg.tommy.securityexam.service;

import kg.tommy.securityexam.entity.Students;
import kg.tommy.securityexam.repository.StudentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentsServiceImpl implements StudentsService {
    @Autowired
    private StudentsRepository studentsRepository;
    @Override
    public List<Students> getAll() {
        return studentsRepository.findAll();
    }

    @Override
    public Students create(Students students) {
        return studentsRepository.save(students);
    }

    @Override
    public Students getById(Long id) {
        return studentsRepository.findById(id).orElse(null);
    }

    @Override
    public Students deleteById(Long id) {
        Students students =getById(id);
        if( students != null){
            studentsRepository.deleteById(id);
        }
        return students;
    }

    @Override
    public List<String> searchByName(String name) {
        return studentsRepository.findAllByNameContaining(name);
    }

}
