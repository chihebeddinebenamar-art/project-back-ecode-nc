package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.EleveMaladie;
import tn.educanet.pfe.persistence.TypeMaladieEleve;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaladieEleveListDto {

	private Long id;
	private Long eleveId;
	private TypeMaladieEleve type;
	private String libelle;
	private String details;
	private String eleveNomComplet;
	private String classeNom;
	private String niveauNom;

	public static MaladieEleveListDto from(EleveMaladie m) {
		var e = m.getEleve();
		var cl = e.getClasse();
		var n = cl.getNiveau();
		String nom = e.getPrenom() + " " + e.getNom();
		return new MaladieEleveListDto(m.getId(), e.getId(), m.getType(), m.getLibelle(), m.getDetails(), nom,
				cl.getNom(), n.getNom());
	}
}
