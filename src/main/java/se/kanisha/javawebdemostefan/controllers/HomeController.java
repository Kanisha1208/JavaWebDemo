package se.kanisha.javawebdemostefan.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import se.kanisha.javawebdemostefan.models.HockeyPlayerRepository;

import java.util.ArrayList;
import java.util.List;


@Controller
public class HomeController extends BaseController {
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;

    @GetMapping("/")
    public String home(Model model) {
       //Hämta saker from database- example en lista med hockeyplayers
        //List<String> players = new ArrayList<>();
//        players.add("Harry");
//        players.add("Zäta");
//        players.add("Stefan");
        //model.addAttribute("players", players);
        model.addAttribute("players", hockeyPlayerRepository.findAll());
        model.addAttribute("user", "Kanisha");

        return "home"; //namnet på HTML filen som ska visas

    }

    @GetMapping("/profile")
    public String profile(Model model) {
        String user = getLoggedInEmail();
        model.addAttribute("user", user);
        return "profile";

    }
}
