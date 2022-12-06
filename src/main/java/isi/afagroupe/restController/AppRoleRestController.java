package isi.afagroupe.restController;

import isi.afagroupe.dto.AppRole;
import isi.afagroupe.service.AppRoleService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/approle")
public class AppRoleRestController {
    //appel de la couche service
    private AppRoleService appRoleService;

    public AppRoleRestController(AppRoleService appRoleService){
        this.appRoleService = appRoleService;
    }

    @GetMapping
    public List<AppRole> getAppRoles(){
        return appRoleService.getAppRoles();
    }

    @GetMapping("/{id}")
    public AppRole getAppRole(@PathVariable("id") int id){
        return appRoleService.getAppRole(id);
    }

    @GetMapping("/{nom}")
    public AppRole getAppRoleByName(@PathVariable("nom") String nom){
        return appRoleService.getAppRoleByName(nom);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public AppRole createAppRole(@Valid @RequestBody AppRole role){
        return appRoleService.createAppRole(role);
    }

    @PutMapping("/{id}")
    public AppRole updateRole(@PathVariable("id") int id, @Valid @RequestBody AppRole role){
        return appRoleService.updateAppRole(id, role);
    }

    @DeleteMapping("/{id}")
    public void deleteAppRole(@PathVariable("id") int id){
        appRoleService.deleteAppRole(id);
        return;
    }
}
