package vn.hoidanit.laptopshop;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/")
    public String index() {
        return "Hello World from Spring Boot!";
    }

    @GetMapping("/user")
    public String userPage() {
        return "cái này cho user";
    }

    @GetMapping("/admin")
    public String adminPage() {
        return "cái này cho admin";
    }
}