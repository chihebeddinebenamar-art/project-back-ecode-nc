package tn.educanet.pfe.dto;

import jakarta.validation.constraints.NotBlank;

public record NiveauRequest(@NotBlank String nom, String anneeScolaire) {
}
