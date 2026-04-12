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
@Table(name = "vaccination")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Vaccination implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eleve_id", nullable = false)
	private Eleve eleve;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "type_vaccin_id", nullable = false)
	private TypeVaccin typeVaccin;

	@Column(nullable = false)
	private int dose;

	/** Date à laquelle la vaccination a été réalisée. */
	@Column(name = "date_vaccination", nullable = false)
	private LocalDate dateVaccination;

	/** Date prévue (calendrier vaccinal / rappel). */
	@Column(name = "date_prevue")
	private LocalDate datePrevue;

	/** Numéro de lot du flacon utilisé pour cette administration. */
	@Column(name = "numero_lot", length = 128)
	private String numeroLot;
}
