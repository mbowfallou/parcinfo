package isi.afagroupe.repository;

import isi.afagroupe.entities.AppRoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppRoleRepository extends JpaRepository<AppRoleEntity, Integer> {
    AppRoleEntity findByNom(String nom);
}
