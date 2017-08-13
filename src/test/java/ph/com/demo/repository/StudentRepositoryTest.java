package ph.com.demo.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import ph.com.demo.domain.Student;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@RunWith(MockitoJUnitRunner.class)
@SpringBootTest
public class StudentRepositoryTest {
    @InjectMocks
    private StudentRepository studentRepository;

    @Mock
    private JdbcTemplate jdbcTemplate;

    private Student student1;

    @Before
    public void setup() {
        student1 = new Student();
        student1.setName("Maven");
        student1.setId("3");
        student1.setGender("Female");
    }

    @Test
    public void test_findAll() {
        Mockito.when(jdbcTemplate.query(Mockito.anyString(), Mockito.any(RowMapper.class))).thenReturn(new ArrayList<>());

        List<Student> students = studentRepository.findAll();

        Assert.assertEquals(students.size(), 0);
    }

    @Test
    public void test_create() {

    }
}
