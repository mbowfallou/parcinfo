package isi.afagroupe.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    private Integer id;
    @NotNull(message = "Le prenom ne peut pas etre nul !")
    private String prenom;
    @NotNull(message = "Le nom ne peut pas etre nul !")
    private String nom;
    private String adresse;
    private String email;
    private int etat;
}
