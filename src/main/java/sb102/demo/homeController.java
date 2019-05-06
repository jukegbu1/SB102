package sb102.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class homeController {
    @RequestMapping("/")
    public String homepage(Model model) {
        model.addAttribute("myvar", "Sy hello to the people.");
        return "hometemplate";
    }
}
