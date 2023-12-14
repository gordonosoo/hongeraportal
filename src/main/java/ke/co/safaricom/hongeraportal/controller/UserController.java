package ke.co.safaricom.hongeraportal.controller;

import ke.co.safaricom.hongeraportal.entity.User;
import ke.co.safaricom.hongeraportal.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
public class UserController {
    private final UserService userService;

    public UserController(UserService userService){
        super();
        this.userService = userService;
    }

    @PostMapping("/add")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/users")
    public List <User> getAllUsers(){
        return userService.getAllUsers();
    }
    @GetMapping("/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id);
        return ResponseEntity.ok(user);
    }


    @DeleteMapping("/delete/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return ResponseEntity.ok("User deleted successfully");
    }


}
