package isi.afagroupe.repository;

import isi.afagroupe.entities.AppUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AppUserRepository extends JpaRepository<AppUserEntity, Integer> {
    AppUserEntity findByEmail(String Email);
    List<AppUserEntity> findByNom(String nom);
    List<AppUserEntity> findByPrenom(String prenom);
    List<AppUserEntity> findByEtat(int etat);
}
