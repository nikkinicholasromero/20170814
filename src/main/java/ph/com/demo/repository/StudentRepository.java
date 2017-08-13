package ph.com.demo.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import ph.com.demo.domain.Student;

import java.util.List;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@Repository
public class StudentRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> findAll() {
        return jdbcTemplate.query("select * from student", (rs, rowNum) -> {
            Student student = new Student();
            student.setId(rs.getString("id"));
            student.setName(rs.getString("name"));
            student.setGender(rs.getString("gender"));
            return student;
        });
    }

    public void addStudent(Student student) {

    }
}