package tn.educanet.pfe.api.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Vaccination;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VaccinationDto {

	private Long id;
	private Long eleveId;
	private String eleveNomComplet;
	/** Affichage liste (scolarité). */
	private String classeNom;
	private String niveauNom;
	private Long typeVaccinId;
	private String typeVaccinNom;
	private int dose;
	private LocalDate dateVaccination;
	private LocalDate datePrevue;
	private String numeroLot;

	public static VaccinationDto from(Vaccination v) {
		var e = v.getEleve();
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
		return new VaccinationDto(v.getId(), e.getId(), nom, cn, nn, v.getTypeVaccin().getId(),
				v.getTypeVaccin().getNom(), v.getDose(), v.getDateVaccination(), v.getDatePrevue(), v.getNumeroLot());
	}
}
