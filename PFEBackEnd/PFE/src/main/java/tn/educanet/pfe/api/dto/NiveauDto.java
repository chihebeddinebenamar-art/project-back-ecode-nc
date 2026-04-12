package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Niveau;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NiveauDto {

	private Long id;
	private String nom;
	private String anneeScolaire;

	public static NiveauDto from(Niveau n) {
		return new NiveauDto(n.getId(), n.getNom(), n.getAnneeScolaire());
	}
}
