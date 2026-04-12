package tn.educanet.pfe.persistence;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
@Table(name = "eleve_maladie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EleveMaladie implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "eleve_id", nullable = false)
	private Eleve eleve;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 32)
	private TypeMaladieEleve type;

	@Column(nullable = false, length = 255)
	private String libelle;

	@Column(length = 2000)
	private String details;
}
