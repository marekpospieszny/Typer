package pl.pospieszny.typer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String controlPanel() {
        return "controlPanel";
    }
}
