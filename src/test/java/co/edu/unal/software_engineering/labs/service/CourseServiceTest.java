package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.pojo.CoursePOJO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(MockitoJUnitRunner.class)
public class CourseServiceTest {

    @InjectMocks
    private CourseService courseService;

    public CourseServiceTest() {

    }

    @Test
    public void isRightCoursePOJOTest() {
        CoursePOJO pojo = new CoursePOJO( );
        pojo.setCourseName(" ");
        pojo.setDurationHours(250);
        Boolean course = courseService.isRightCoursePOJO(pojo);
        Boolean expected = false;

        assertNotNull(course);
        assertEquals(expected, course);
    }
}