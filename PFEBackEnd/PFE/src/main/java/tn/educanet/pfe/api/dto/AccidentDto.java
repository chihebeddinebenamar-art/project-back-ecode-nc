package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Accident;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AccidentDto {

	private Long id;
	private Long eleveId;
	private String eleveNomComplet;
	/** Affichage liste (scolarité). */
	private String classeNom;
	private String niveauNom;
	private LocalDate dateAccident;
	private String description;
	private String diagnostic;
	private String traitement;
	private String etat;

	public static AccidentDto from(Accident a) {
		var e = a.getEleve();
		String nom = e.getPrenom() + " " + e.getNom();
		String cn = null;
		String nn = null;
		var cl = e.getClasse();
		if (cl != null) {
			cn = cl.getNom();
			if (cl.getNiveau() != null) {
				nn = cl.getNiveau().getNom();
			}
		}
		return new AccidentDto(a.getId(), e.getId(), nom, cn, nn, a.getDateAccident(), a.getDescription(),
				a.getDiagnostic(), a.getTraitement(), a.getEtat());
	}
}
