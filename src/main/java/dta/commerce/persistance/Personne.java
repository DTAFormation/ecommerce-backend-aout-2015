package dta.commerce.persistance;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name="personne") 
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PERSONNE")
public class Personne {
	
	/** 
	 * Attributs
	 */
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	private boolean actif;
	
	private String nom;
	
	private String prenom;
	
	private String login;
	@JsonBackReference("PWD")
	private String password;
	
	
	
	
	/**
	 * Constructeurs
	 */

	
	/**
	 * Getters & setters
	 */
	public boolean getActif() {
		return actif;
	}
	
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
