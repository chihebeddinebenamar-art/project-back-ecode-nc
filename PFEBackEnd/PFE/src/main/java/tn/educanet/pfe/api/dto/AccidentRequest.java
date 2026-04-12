package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AccidentRequest {

	@NotNull
	private Long eleveId;
	@NotNull
	private LocalDate dateAccident;
	@NotBlank
	private String description;
	@NotBlank
	private String diagnostic;
	@NotBlank
	private String traitement;
	@NotBlank
	private String etat;
}
