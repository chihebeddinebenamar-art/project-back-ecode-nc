package tn.educanet.pfe.persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "eleve")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Eleve implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(length = 64, unique = true)
	private String matricule;

	@Column(nullable = false, length = 120)
	private String nom;

	@Column(nullable = false, length = 120)
	private String prenom;

	@Column(name = "date_naissance")
	private LocalDate dateNaissance;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "classe_id", nullable = false)
	private Classe classe;

	@OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Vaccination> vaccinations = new ArrayList<>();

	@OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Consultation> consultations = new ArrayList<>();

	@OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Accident> accidents = new ArrayList<>();

	@OneToMany(mappedBy = "eleve", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<EleveMaladie> maladies = new ArrayList<>();
}
