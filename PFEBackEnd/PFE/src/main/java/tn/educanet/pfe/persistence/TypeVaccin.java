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
@Table(name = "type_vaccin")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class TypeVaccin implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false, length = 200)
	private String nom;

	@Column(name = "quantite_totale", nullable = false)
	private int quantiteTotale;

	@OneToMany(mappedBy = "typeVaccin", cascade = CascadeType.ALL)
	private List<Vaccination> vaccinations = new ArrayList<>();
}
