package tn.educanet.pfe.persistence;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "rappel_vaccination")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RappelVaccination implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "date_prevue", nullable = false)
	private LocalDate datePrevue;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "type_vaccin_id", nullable = false)
	private TypeVaccin typeVaccin;

	@Column(length = 2000)
	private String remarque;

	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "rappel_vaccination_classe", joinColumns = @JoinColumn(name = "rappel_id"), inverseJoinColumns = @JoinColumn(name = "classe_id"))
	private Set<Classe> classes = new HashSet<>();
}
