package ra.webmovieapplication.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/dashboard")
public class DashboardController {
//    @Autowired
//    private
    @GetMapping("")
    public String dashboard(){
        return "admin/index";
    }

    @GetMapping("/test")
    public String test(){
        return "admin/test";
    }



}