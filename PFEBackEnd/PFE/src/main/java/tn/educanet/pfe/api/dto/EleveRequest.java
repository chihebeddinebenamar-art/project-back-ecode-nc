package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class EleveRequest {

	private String matricule;
	@NotBlank
	private String nom;
	@NotBlank
	private String prenom;
	private LocalDate dateNaissance;
	@NotNull
	private Long classeId;
}
