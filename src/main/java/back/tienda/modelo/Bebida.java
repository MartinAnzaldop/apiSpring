package back.tienda.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bebidas")
public class Bebida {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(name = "nom_bebida", length = 60, nullable = false)
	private String nom_bebida;
	@Column(name = "categoria", length = 60, nullable = false)
	private String categoria;
	
	public Bebida() {
		
	}
	

	public Bebida(Long id, String nom_bebida, String categoria) {
		super();
		this.id = id;
		this.nom_bebida = nom_bebida;
		this.categoria = categoria;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom_bebida() {
		return nom_bebida;
	}

	public void setNom_bebida(String nom_bebida) {
		this.nom_bebida = nom_bebida;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

}
