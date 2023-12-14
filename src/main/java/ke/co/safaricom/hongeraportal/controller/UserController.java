package ke.co.safaricom.hongeraportal.controller;

import ke.co.safaricom.hongeraportal.entity.User;
import ke.co.safaricom.hongeraportal.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private UserService userService;

    public UserController(UserService userService){
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }


}
