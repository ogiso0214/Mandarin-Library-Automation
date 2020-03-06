package librarymanagement.Librarian;


import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class demo {

    @RequestMapping("/helloWorld")
    public String first() {
        return "helloWorld";
    }
}
