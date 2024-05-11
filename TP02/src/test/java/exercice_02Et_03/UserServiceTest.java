package exercice_02Et_03;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class UserServiceTest {
    @Mock
    private UtilisateurApi utilisateurApiMock;
    @Test
    public void testCreerUtilisateurEx2() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        // TODO : Configuration du comportement du mock, utiliser la directive « when » avec sa méthode « thenReturn »
       when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenReturn(true);
        // TODO : Création du service avec le mock
           UserService userService=new UserService(utilisateurApiMock);
        // TODO : Appel de la méthode à tester
      userService.creerUtilisateur(utilisateur);
        // TODO : Vérification de l'appel à l'API
       verify(utilisateurApiMock).creerUtilisateur(utilisateur);

    }
    @Test
    public void testCreerUtilisateur_Exce_exo31() throws ServiceException {
        // Config du comport du mock pour lever une exception ServiceException
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        when(utilisateurApiMock.creerUtilisateur(utilisateur)).thenThrow(new ServiceException("echec"));
        UserService userService = new UserService(utilisateurApiMock);
         userService.creerUtilisateur(utilisateur);

    }
    @Test
    public void testCreerUtilisateur_Validation_Err_exo32() throws ServiceException {
        // Configuration du comportement du mock pour lancer une exception ServiceException lors de la validation
        doThrow(new ServiceException("Erreur de validation")).when(utilisateurApiMock).creerUtilisateur(any(Utilisateur.class));

        UserService userService = new UserService(utilisateurApiMock);

        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        try {
            userService.creerUtilisateur(utilisateur);
        } catch (ServiceException e) {
            // Vérification que l'exception ValidationException est bien levée et que son message est correct
            assert e.getMessage() != null && e.getMessage().equals("Erreur de validation");
            // Vérification que la méthode creerUtilisateur n'a jamais été appelée
            verify(utilisateurApiMock, never()).creerUtilisateur(utilisateur);
        }
    }

    @Test
    public void testCreerUtilisateur_exo33() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");
        int idUtilisateur = 123;
        //  TODO: Configuration du mock pour renvoyer l'ID
        doAnswer(invocation -> {
            Utilisateur capturedUtilisateur = invocation.getArgument(0);
            capturedUtilisateur.setId(123); // Setting a fake ID
            return null;
        }).when(utilisateurApiMock).creerUtilisateur(utilisateur);
        // Création du service avec le mock
        UserService userService = new UserService(utilisateurApiMock);
        // Appel de la méthode à testi
        userService.creerUtilisateur(utilisateur);
        // TODO: Vérification de l'ID de l'utilisateur
        assert utilisateur.getId() == idUtilisateur;
    }

    @Test
    public void testCreerUtilisateur_exo34() throws ServiceException {
        // Création d'un nouvel utilisateur
        Utilisateur utilisateur = new Utilisateur("Jean", "Dupont", "jeandupont@email.com");

        // Capture des arguments passés à la méthode creerUtilisateur du mock
        ArgumentCaptor<Utilisateur> argumentCaptor = ArgumentCaptor.forClass(Utilisateur.class);

        // Mock the behavior of creerUtilisateur method to return true
        doNothing().when(utilisateurApiMock).creerUtilisateur(any(Utilisateur.class));

        // Appel de la méthode à tester
        UserService userService = new UserService(utilisateurApiMock);
        userService.creerUtilisateur(utilisateur);

        // Capture de l'argument
        verify(utilisateurApiMock).creerUtilisateur(argumentCaptor.capture());
        Utilisateur utilisateurCapture = argumentCaptor.getValue();

        //TODO : Vérification des arguments capturés, utiliser les getters de
        ////l’objet utilisateurCapture
        assert utilisateurCapture.getNom().equals(utilisateur.getNom());
        assert utilisateurCapture.getPrenom().equals(utilisateur.getPrenom());
        assert utilisateurCapture.getEmail().equals(utilisateur.getEmail());
    }

}