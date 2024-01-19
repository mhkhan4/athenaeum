package gmpu.athenaeum.controller;


import gmpu.athenaeum.constant.SourceType;
import gmpu.athenaeum.model.Source;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import gmpu.athenaeum.repository.SourceRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/source")
@AllArgsConstructor
@Slf4j
public class SourceController {

    private final SourceRepository sourceRepository;


}
