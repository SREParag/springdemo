package com.sabre.dcn.controller;

import java.security.Principal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.security.core.Authentication;
import com.sabre.dcn.config.auth.domain.User;
import com.sabre.dcn.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import com.sabre.dcn.domain.OrgChart;
import org.springframework.stereotype.Service;
import java.util.*;
import java.text.SimpleDateFormat;
@Controller
@Service
public class HomeController {
    @Autowired
    private OrgChartService orgChartService;

    @RequestMapping(value = {"/home/index",})
    public String index(Model model, Principal principal) {
        if (principal != null) {
            Calendar cal = Calendar.getInstance();
            Date date = cal.getTime();
            long time = date.getTime();
            SimpleDateFormat dateFormatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            User loggedInUser = (User) ((Authentication) principal).getPrincipal();
            model.addAttribute("user", loggedInUser.getSgid());
            model.addAttribute("date", dateFormatter.format(time));
            return "home/index";
        } else {
            return "redirect:/login";
        }
    }

}
