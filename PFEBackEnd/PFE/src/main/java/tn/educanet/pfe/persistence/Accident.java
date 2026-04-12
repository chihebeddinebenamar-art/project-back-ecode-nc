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
@Table(name = "accident")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Accident implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eleve_id", nullable = false)
	private Eleve eleve;

	@Column(name = "date_accident", nullable = false)
	private LocalDate dateAccident;

	/** Description de l’acte. */
	@Column(length = 2000)
	private String description;

	@Column(length = 2000)
	private String diagnostic;

	@Column(length = 2000)
	private String traitement;

	@Column(length = 500)
	private String etat;
}
