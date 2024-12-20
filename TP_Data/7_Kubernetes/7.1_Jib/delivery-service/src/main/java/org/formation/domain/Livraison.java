package org.formation.domain;

import java.time.Instant;

import org.formation.web.LivraisonViews;

import com.fasterxml.jackson.annotation.JsonView;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Livraison {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonView(LivraisonViews.Base.class)
	public long id;

	@JsonView(LivraisonViews.Base.class)
	public String noCommande;
	
	@OneToOne
	@JsonView(LivraisonViews.Complet.class)
	public Livreur livreur;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	@JsonView(LivraisonViews.Base.class)
	public Status status;
	
	@JsonView(LivraisonViews.Base.class)
	public Instant creationDate;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livraison other = (Livraison) obj;
		if (id != other.id)
			return false;
		return true;
	}

	
	


}
