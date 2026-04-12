package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Classe;
import tn.educanet.pfe.persistence.Niveau;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClasseDto {

	private Long id;
	private String nom;
	private Long niveauId;
	private String niveauNom;

	public static ClasseDto from(Classe c) {
		Niveau n = c.getNiveau();
		Long nid = n != null ? n.getId() : null;
		String nnom = n != null ? n.getNom() : null;
		return new ClasseDto(c.getId(), c.getNom(), nid, nnom);
	}
}
