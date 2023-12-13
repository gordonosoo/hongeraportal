package ke.co.safaricom.hongeraportal.user;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    public List<User> getUsers(){
        return List.of(
                new User(
                        1L,
                        "Mr",
                        "Gordon",
                        "Test",
                        "wuodosoo@gmail.com",
                        1L,
                        "BadAssPassword",
                        "23092023"
                )
        );
    }
}
