package dta.commerce.persistance;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name="adresse") 
public class Adresse {

	/** 
	 * Attributs
	 */
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private Integer numero;
	private String rue;
	private String ville;
	private User user;
	

	/**
	 * Constructeurs
	 */
	public Adresse() {
	}

	public Adresse(Integer numero, String rue, String ville) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
	}


	/**
	 * Getters & setters
	 */
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
}

