package ke.co.safaricom.hongeraportal.service;

import ke.co.safaricom.hongeraportal.entity.User;
import ke.co.safaricom.hongeraportal.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
   private UserRepository userRepository;

   public UserService(UserRepository userRepository){
       super();
       this.userRepository = userRepository;
   }

   public User saveUser(User user){
       return userRepository.save(user);

   }
}
