package com.techacademy;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class InputController {

    @GetMapping("/input")
    public String getInput(@RequestParam(value = "previous", required = false) String previous, Model model) {
     // previousパラメータをモデルに追加
        model.addAttribute("previous", previous);
        // input.htmlに画面遷移
        return "input";
    }
}
