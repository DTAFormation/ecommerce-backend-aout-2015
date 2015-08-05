package dta.commerce.persistance;

public class Personne {
	
	/** 
	 * Attributs
	 */
	private Integer id;
	private String nom;
	private String prenom;
	private String login;
	private String password;
	
	
	/**
	 * Constructeurs
	 */
	public Personne(Integer id, String nom, String prenom, String login,
			String password) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.login = login;
		this.password = password;
	}
	public Personne(){
		
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