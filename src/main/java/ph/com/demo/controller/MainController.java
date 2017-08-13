package ph.com.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by nikkinicholas on 8/13/17.
 */
@RestController
public class MainController {
    @Value("${greetings}")
    private String greetings;

    @RequestMapping("")
    public String main() {
        return greetings;
    }
}
