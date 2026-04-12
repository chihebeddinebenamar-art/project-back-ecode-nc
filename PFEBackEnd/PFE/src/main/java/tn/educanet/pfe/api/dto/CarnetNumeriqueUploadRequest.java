package tn.educanet.pfe.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class CarnetNumeriqueUploadRequest {

	/**
	 * Image encodée en base64, avec ou sans préfixe {@code data:image/...;base64,}.
	 */
	@NotBlank
	private String image;
}
