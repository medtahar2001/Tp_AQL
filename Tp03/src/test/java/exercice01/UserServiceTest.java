package exercice01;

import exercice01.Utilisateur;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    @Test
    public void testGetUserById() {
        UserRepository mockRepository = mock(UserRepository.class);
        Utilisateur us_test = new Utilisateur(1, "John Doe");
        when(mockRepository.findUserById(1)).thenReturn(us_test);
        UserService userService = new UserService(mockRepository);
        Utilisateur User = userService.getUserById(1);
        verify(mockRepository).findUserById(1);
        assertEquals(us_test, User);
    }
}