package tn.educanet.pfe.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ClasseRequest {

	@NotBlank
	private String nom;
	@NotNull
	private Long niveauId;
}
