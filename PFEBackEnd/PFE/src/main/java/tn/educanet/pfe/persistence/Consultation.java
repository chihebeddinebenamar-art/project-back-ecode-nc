package tn.educanet.pfe.persistence;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "consultation")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Consultation implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eleve_id", nullable = false)
	private Eleve eleve;

	@Column(name = "date_consultation", nullable = false)
	private LocalDate dateConsultation;

	/** Température (ex. 37,5 °C). */
	@Column(name = "temperature")
	private Double temperature;

	@Column(name = "vomissement", nullable = false)
	private boolean vomissement;

	@Column(name = "diarrhee", nullable = false)
	private boolean diarrhee;

	@Column(name = "rapport", length = 2000)
	private String rapport;

	@Column(name = "prochaine_consultation")
	private LocalDate prochaineConsultation;

	/** Soins / médicaments prescrits (obligatoire en saisie). Colonne SQL historique {@code note}. */
	@Column(name = "note", length = 2000)
	private String traitement;
}
