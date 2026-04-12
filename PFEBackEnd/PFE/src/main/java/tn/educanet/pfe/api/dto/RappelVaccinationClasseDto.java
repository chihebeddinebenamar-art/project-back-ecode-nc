package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RappelVaccinationClasseDto {

	private Long id;
	private String nom;
	private Long niveauId;
	private String niveauNom;
}
