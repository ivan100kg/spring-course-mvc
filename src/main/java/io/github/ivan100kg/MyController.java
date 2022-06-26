package io.github.ivan100kg;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/")
    public String showFirstView(){
        return "first-view";
    }

    @RequestMapping("/askDetails")
    public String askDetails() {
        return "ask-emp-details-view";
    }

    @RequestMapping("/showDetails")
    public String showDetails() {
        return "show-emp-details-view";
    }
}
