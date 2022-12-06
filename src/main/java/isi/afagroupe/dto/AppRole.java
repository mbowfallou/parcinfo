package isi.afagroupe.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRole {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("nom")
    @NotNull(message = "Le nom ne peut pas etre nul !")
    private String nom;
}
