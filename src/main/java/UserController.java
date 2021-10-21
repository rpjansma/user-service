import com.example.trainingproject.model.UserEntity;
import com.example.trainingproject.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserRepository repository;

    @GetMapping("/users")
    public List<UserEntity> getAllUsers() {
        return repository.findAll();
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
