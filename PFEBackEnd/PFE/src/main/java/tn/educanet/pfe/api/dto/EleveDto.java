package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Eleve;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EleveDto {

	private Long id;
	private String matricule;
	private String nom;
	private String prenom;
	private LocalDate dateNaissance;
	private Long classeId;
	private String classeNom;
	private Long niveauId;
	private String niveauNom;

	public static EleveDto from(Eleve e) {
		return new EleveDto(e.getId(), e.getMatricule(), e.getNom(), e.getPrenom(), e.getDateNaissance(),
				e.getClasse().getId(), e.getClasse().getNom(), e.getClasse().getNiveau().getId(),
				e.getClasse().getNiveau().getNom());
	}
}
