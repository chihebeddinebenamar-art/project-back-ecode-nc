package tn.educanet.pfe.api;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import tn.educanet.pfe.api.dto.MaladieEleveListDto;
import tn.educanet.pfe.service.EleveMaladieService;

/**
 * Liste globale des allergies / maladies chroniques (tous élèves), avec filtres.
 */
@RestController
@RequestMapping("/api/maladies")
@RequiredArgsConstructor
public class MaladiesApiController {

	private final EleveMaladieService eleveMaladieService;

	@GetMapping
	public List<MaladieEleveListDto> lister(@RequestParam(required = false) Long niveauId,
			@RequestParam(required = false) Long classeId, @RequestParam(required = false) String q) {
		return eleveMaladieService.listerFiltres(niveauId, classeId, q);
	}
}
