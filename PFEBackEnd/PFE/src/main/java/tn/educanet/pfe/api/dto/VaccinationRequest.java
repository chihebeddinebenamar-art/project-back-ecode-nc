package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class VaccinationRequest {

	@NotNull
	private Long eleveId;
	@NotNull
	private Long typeVaccinId;
	/** Date à laquelle la vaccination a été réalisée. */
	@NotNull
	private LocalDate dateVaccination;
	/** Date prévue (optionnel). */
	private LocalDate datePrevue;
	/** Numéro de lot du flacon utilisé. */
	private String numeroLot;
}
