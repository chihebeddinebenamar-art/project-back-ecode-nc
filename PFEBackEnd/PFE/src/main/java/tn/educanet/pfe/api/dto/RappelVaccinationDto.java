package tn.educanet.pfe.api.dto;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tn.educanet.pfe.persistence.Classe;
import tn.educanet.pfe.persistence.RappelVaccination;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RappelVaccinationDto {

	private Long id;
	private LocalDate datePrevue;
	private Long typeVaccinId;
	private String typeVaccinNom;
	private List<RappelVaccinationClasseDto> classes;
	private String remarque;

	public static RappelVaccinationDto from(RappelVaccination r) {
		List<RappelVaccinationClasseDto> cls = r.getClasses().stream()
				.sorted(Comparator.comparing(Classe::getNom, Comparator.nullsLast(String::compareToIgnoreCase)))
				.map(c -> {
					Long nid = null;
					String nn = null;
					if (c.getNiveau() != null) {
						nid = c.getNiveau().getId();
						nn = c.getNiveau().getNom();
					}
					return new RappelVaccinationClasseDto(c.getId(), c.getNom(), nid, nn);
				}).toList();
		return new RappelVaccinationDto(r.getId(), r.getDatePrevue(), r.getTypeVaccin().getId(), r.getTypeVaccin().getNom(),
				cls, r.getRemarque());
	}
}
