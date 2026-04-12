package tn.educanet.pfe.api.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.EleveMaladie;
import tn.educanet.pfe.persistence.TypeMaladieEleve;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MaladieEleveDto {

	private Long id;
	private Long eleveId;
	private TypeMaladieEleve type;
	private String libelle;
	private String details;

	public static MaladieEleveDto from(EleveMaladie m) {
		return new MaladieEleveDto(m.getId(), m.getEleve().getId(), m.getType(), m.getLibelle(), m.getDetails());
	}
}
