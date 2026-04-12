package tn.educanet.pfe.api.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class TypeVaccinRequest {

	@NotBlank
	private String nom;
	@Min(0)
	private int quantiteInitiale;
}
