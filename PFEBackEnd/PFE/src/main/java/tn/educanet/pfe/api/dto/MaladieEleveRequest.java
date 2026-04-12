package tn.educanet.pfe.api.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import tn.educanet.pfe.persistence.TypeMaladieEleve;

@Data
public class MaladieEleveRequest {

	@NotNull
	private TypeMaladieEleve type;

	@NotBlank
	@Size(max = 255)
	private String libelle;

	@Size(max = 2000)
	private String details;
}
