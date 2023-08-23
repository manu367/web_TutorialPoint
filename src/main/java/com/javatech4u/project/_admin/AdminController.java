package com.javatech4u.project._admin;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {
    @GetMapping("/admin")
    public String admin(Model model) {
        model.addAttribute("active","admin");
        return "admin/admin";
    }
}
