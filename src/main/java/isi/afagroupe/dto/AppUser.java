package isi.afagroupe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUser {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("prenom")
    @NotNull(message = "Le prenom ne peut pas etre nul !")
    private String prenom;
    @JsonProperty("nom")
    @NotNull(message = "Le nom ne peut pas etre nul !")
    private String nom;
    @JsonProperty("adresse")
    private String adresse;
    @JsonProperty("email")
    private String email;
    @JsonProperty("etat")
    private int etat;
}
