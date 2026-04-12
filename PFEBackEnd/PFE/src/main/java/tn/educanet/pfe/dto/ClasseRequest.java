package tn.educanet.pfe.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record ClasseRequest(@NotBlank String nom, @NotNull Long niveauId) {
}
