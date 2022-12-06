package isi.afagroupe.service;

import isi.afagroupe.dto.AppRole;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
class AppRoleServiceTest {/*

    @Autowired
    private AppRoleService appRoleService;
    private AppRole role;

    @Test
    void createAppRole() {
        AppRole role = new AppRole();
        role.setNom("ROLE-SUPER-ADMIN");

        AppRole role_saved = appRoleService.createAppRole(role);

        Assertions.assertNotNull(role_saved);
    }

    @Test
    void getAppRoles() {
        Boolean empty = appRoleService.getAppRoles().isEmpty();

        Assertions.assertEquals(false, empty);
    }

    @Test
    void getAppRole() {
        role = new AppRole(1, "ROLE-SUPER-ADMIN");

        AppRole r_saved = appRoleService.getAppRole(1);

        Assertions.assertEquals(role.getNom(), r_saved.getNom());
    }

    @Test
    void getAppRoleByName() {

        AppRole r_saved = appRoleService.getAppRoleByName("ROLE-SUPER-ADMIN");

        Assertions.assertNotNull(r_saved.getNom());
    }

    @Test
    void updateAppRole() {
        role = new AppRole(2, "ROLE_ADMINS");

        AppRole r_updated = appRoleService.updateAppRole(1, role);

        Assertions.assertEquals(role.getNom(), r_updated.getNom());
    }

    @Test
    void deleteAppRole() {
        appRoleService.deleteAppRole(1);

        Assertions.assertTrue(true);
    }*/
}