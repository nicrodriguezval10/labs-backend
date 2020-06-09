package co.edu.unal.software_engineering.labs.service;

import co.edu.unal.software_engineering.labs.model.User;
import co.edu.unal.software_engineering.labs.pojo.RegisterUserPOJO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertEquals;

@RunWith( MockitoJUnitRunner.class)
public class UserServiceTest {
    @InjectMocks
    private UserService userService;

    public UserServiceTest() {
    }

    @Test
    public void isRightUserTest() {
        RegisterUserPOJO pojo = new RegisterUserPOJO();
        pojo.setUsername("student");
        pojo.setPassword("11a22b33c");
        pojo.setNames("Nicolás");
        pojo.setSurnames("Rodríguez");
        Boolean user = userService.isRightUser(pojo);
        boolean expected = true;
        assertEquals(expected, user);
    }
}
