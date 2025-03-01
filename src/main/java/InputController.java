import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ResourceBundle;

@Controller
public class InputController {

    private ResourceBundle messages = ResourceBundle.getBundle("messages");

    @GetMapping("/input")
    public String getInput(Model model) {
        model.addAttribute("inputScreen", messages.getString("input_screen"));
        model.addAttribute("inputValue", messages.getString("input_value"));
        model.addAttribute("send", messages.getString("send"));
        return "input";
    }
}

