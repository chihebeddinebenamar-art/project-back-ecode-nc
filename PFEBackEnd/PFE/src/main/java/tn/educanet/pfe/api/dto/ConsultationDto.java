package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Consultation;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ConsultationDto {

	private Long id;
	private Long eleveId;
	private String eleveNomComplet;
	/** Affichage liste (scolarité). */
	private String classeNom;
	private String niveauNom;
	private LocalDate dateConsultation;
	private Double temperature;
	private boolean vomissement;
	private boolean diarrhee;
	private String rapport;
	private LocalDate prochaineConsultation;
	private String traitement;

	public static ConsultationDto from(Consultation c) {
		var e = c.getEleve();
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
		return new ConsultationDto(c.getId(), e.getId(), nom, cn, nn, c.getDateConsultation(), c.getTemperature(),
				c.isVomissement(), c.isDiarrhee(), c.getRapport(), c.getProchaineConsultation(), c.getTraitement());
	}
}
