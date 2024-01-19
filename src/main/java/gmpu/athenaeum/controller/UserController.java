package gmpu.athenaeum.controller;

import gmpu.athenaeum.model.User;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import gmpu.athenaeum.repository.UserRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
@AllArgsConstructor
public class UserController {
    private final UserRepository userRepository;

}
