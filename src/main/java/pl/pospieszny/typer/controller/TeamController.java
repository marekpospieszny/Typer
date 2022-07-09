package pl.pospieszny.typer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pl.pospieszny.typer.repository.TeamRepository;

@Controller
@RequestMapping("/teams")
public class TeamController {

    private TeamRepository teamRepository;

    public TeamController(TeamRepository teamRepository) {
        this.teamRepository = teamRepository;
    }

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("teams",teamRepository.findAll());
        return "team/list";
    }

}
