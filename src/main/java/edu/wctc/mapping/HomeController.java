package edu.wctc.mapping;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String showHomePage() {
        return "index";
    }

    @RequestMapping("/list")
    public String showList() {
        return "list";
    }

    @RequestMapping("/login")
    public String showLogin() {
        return "login";
    }

  @RequestMapping("/search")
    public String showSearch() {
        return "search2";
  }
  @RequestMapping("/detail")
    public String showDetail(){
        return "detail";
  }

}
