package gmpu.athenaeum.controller;

import gmpu.athenaeum.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import gmpu.athenaeum.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

    @PostMapping
    public Mono<User> addUser(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping
    public Flux<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/{userId}")
    public Mono<User> findUserById(@PathVariable Integer userId){
        return userRepository.findById(userId);
    }
}
