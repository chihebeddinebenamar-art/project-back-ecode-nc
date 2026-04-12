package tn.educanet.pfe.persistence;

import java.io.Serializable;
import java.time.Instant;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

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
@Table(name = "eleve_carnet_numerique")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EleveCarnetNumerique implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@OnDelete(action = OnDeleteAction.CASCADE)
	@JoinColumn(name = "eleve_id", nullable = false, unique = true)
	private Eleve eleve;

	/** Nom de fichier sur disque (pas le chemin complet). */
	@Column(name = "stored_filename", nullable = false, length = 255)
	private String storedFilename;

	@Column(name = "content_type", nullable = false, length = 100)
	private String contentType;

	@Column(name = "updated_at", nullable = false)
	private Instant updatedAt;
}
