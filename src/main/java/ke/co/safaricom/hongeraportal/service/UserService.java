package ke.co.safaricom.hongeraportal.service;

import jakarta.transaction.Transactional;
import ke.co.safaricom.hongeraportal.entity.User;
import ke.co.safaricom.hongeraportal.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
   private final UserRepository userRepository;

   public UserService(UserRepository userRepository){
       super();
       this.userRepository = userRepository;
   }
    @Transactional
   public User saveUser(User user){
       return userRepository.save(user);

   }
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long userId) {
        return userRepository.findById(userId).orElse(null);
    }


    @Transactional
    public void deleteUser(Long userId) {
        userRepository.deleteById(userId);
    }

}
