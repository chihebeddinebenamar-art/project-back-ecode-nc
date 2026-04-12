package tn.educanet.pfe.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class NiveauRequest {

	@NotBlank
	private String nom;
	private String anneeScolaire;
}
