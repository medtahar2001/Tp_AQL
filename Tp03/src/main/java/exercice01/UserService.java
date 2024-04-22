package exercice01;



public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Utilisateur getUserById(long id) {
        return userRepository.findUserById(id);
    }
}