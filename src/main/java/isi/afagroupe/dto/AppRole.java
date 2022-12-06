package isi.afagroupe.dto;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppRole {
    private Integer id;
    @NotNull(message = "Le nom ne peut pas etre nul !")
    private String nom;
}
