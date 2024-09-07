package ra.webmovieapplication.controller.user;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ra.webmovieapplication.service.admin.IFilmService;

@Controller
@RequestMapping("")
@RequiredArgsConstructor
public class HomeController {
    private final IFilmService filmService;

    @GetMapping("/home")
    public String home(Model model){
        return "user/index";
    }


}
