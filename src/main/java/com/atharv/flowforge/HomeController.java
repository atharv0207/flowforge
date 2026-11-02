package com.atharv.flowforge;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HomeController {
    @GetMapping("/")
    public String home(){
        return "Welcome to FLOWFORGE!";

    }
    
@GetMapping("/health")
public String health() {
    return "FLOWFORGE is running successfully!";
}

    
}
