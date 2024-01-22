package madej.kamil.basicauth.service;

import lombok.AllArgsConstructor;
import madej.kamil.basicauth.model.User;
import madej.kamil.basicauth.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;


    private User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElseThrow(() -> new RuntimeException("User not found in db"));
    }
}
