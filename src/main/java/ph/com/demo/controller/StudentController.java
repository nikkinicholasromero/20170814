package ph.com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import ph.com.demo.domain.Student;
import ph.com.demo.service.StudentService;

import java.util.List;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping(value = "", method = RequestMethod.GET)
    public List<Student> findAll() {
        return studentService.findAll();
    }
}
