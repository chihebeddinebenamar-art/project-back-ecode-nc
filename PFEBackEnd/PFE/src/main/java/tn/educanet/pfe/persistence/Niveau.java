package tn.educanet.pfe.persistence;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "niveau")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Niveau implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 120)
	private String nom;

	@Column(name = "annee_scolaire", length = 32)
	private String anneeScolaire;

	@OneToMany(mappedBy = "niveau", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Classe> classes = new ArrayList<>();
}
