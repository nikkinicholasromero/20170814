package ph.com.demo.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;

/**
 * Created by nikkinicholas on 8/13/17.
 */
public class StudentTest {
    @InjectMocks
    private Student student;

    @Before
    public void setup() {
        student = new Student();
    }

    @Test
    public void test() {
        student.setId("1");
        student.setName("Leslie Anne Sayin");
        student.setGender("Female");

        Assert.assertEquals("1", student.getId());
        Assert.assertEquals("Leslie Anne Sayin", student.getName());
        Assert.assertEquals("Female", student.getGender());
    }
}
