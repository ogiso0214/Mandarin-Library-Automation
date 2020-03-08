package librarymanagement.Librarian;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.text.AttributedString;

@Controller
@Component
public class demo {

    @RequestMapping("/hello")
    public String first(@RequestParam(defaultValue = "world") String
                                    Name, Model model) {
        model.addAttribute("message", "Hello, "+Name);
        return "resultPage";
    }
}
