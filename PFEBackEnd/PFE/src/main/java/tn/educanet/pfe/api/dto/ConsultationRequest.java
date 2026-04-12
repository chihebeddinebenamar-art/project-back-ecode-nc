package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class ConsultationRequest {

	@NotNull
	private Long eleveId;
	@NotNull
	private LocalDate dateConsultation;
	@NotNull
	private Double temperature;
	private Boolean vomissement;
	private Boolean diarrhee;
	private String rapport;
	private LocalDate prochaineConsultation;
	@NotBlank
	private String traitement;
}
