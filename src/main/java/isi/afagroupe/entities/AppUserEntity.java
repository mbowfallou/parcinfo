package isi.afagroupe.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(length = 70, nullable = false)
    private String prenom;
    @Column(length = 40, nullable = false)
    private String nom;
    @Column(length = 200, nullable = true)
    private String adresse;
    @Column(length = 250, nullable = true)
    private String email;
    @Column(nullable = true)
    private int etat;
    @ManyToMany(mappedBy = "appUserEntities", fetch = FetchType.LAZY)
    private List<AppRoleEntity> appRoleEntities;
}
