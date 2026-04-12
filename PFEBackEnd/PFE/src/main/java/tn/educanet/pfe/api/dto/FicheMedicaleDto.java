package tn.educanet.pfe.api.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FicheMedicaleDto {

	private EleveDto eleve;
	private List<VaccinationDto> vaccinations;
	private List<ConsultationDto> consultations;
	private List<AccidentDto> accidents;
	/** Allergies et maladies chroniques déclarées pour l’élève. */
	private List<MaladieEleveDto> maladies;
	/** Une photo de carnet numérique peut être associée (GET …/carnet-numerique/image). */
	private boolean carnetNumeriquePresent;
	/** Pour invalider le cache navigateur après remplacement de l’image (epoch ms). */
	private Long carnetNumeriqueVersion;
}
