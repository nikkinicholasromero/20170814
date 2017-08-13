package ph.com.demo.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import ph.com.demo.domain.Student;
import ph.com.demo.repository.StudentRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StudentServiceTest {
    @InjectMocks
    private StudentService studentService;

    @Mock
    private StudentRepository studentRepository;

    @Before
    public void setUp() {

    }

    @Test
    public void testService() {
        Mockito.when(studentRepository.findAll()).thenReturn(new ArrayList<>());

        List<Student> students = studentService.findAll();

        Assert.assertEquals(students.size(), 0);
    }

}
