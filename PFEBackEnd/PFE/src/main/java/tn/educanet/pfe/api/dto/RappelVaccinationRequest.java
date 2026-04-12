package tn.educanet.pfe.api.dto;

import java.time.LocalDate;
import java.util.List;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RappelVaccinationRequest {

	@NotNull
	private LocalDate datePrevue;

	@NotNull
	private Long typeVaccinId;

	@NotEmpty
	private List<Long> classeIds;

	@Size(max = 2000)
	private String remarque;
}
