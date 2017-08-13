package ph.com.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ph.com.demo.domain.Student;
import ph.com.demo.repository.StudentRepository;

import java.util.List;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@Service
public class StudentService {
    @Autowired
    private StudentRepository studentRepository;

    public List<Student> findAll() {
        return studentRepository.findAll();
    }
}
