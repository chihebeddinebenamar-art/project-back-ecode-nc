package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.TypeVaccin;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TypeVaccinDto {

	private Long id;
	private String nom;
	private int quantiteTotale;

	public static TypeVaccinDto from(TypeVaccin t) {
		return new TypeVaccinDto(t.getId(), t.getNom(), t.getQuantiteTotale());
	}
}
