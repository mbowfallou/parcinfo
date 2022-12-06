package isi.afagroupe.controller;

import isi.afagroupe.service.AppRoleService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/roles")
public class AppRoleController {

    //appel de la couche service
    private AppRoleService appRoleService;

    public AppRoleController(AppRoleService appRoleService){
        this.appRoleService = appRoleService;
    }

    @GetMapping
    public String home(){
        return "home";
    }
}
