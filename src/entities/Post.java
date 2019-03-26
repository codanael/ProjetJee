package entities;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Post {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	Calendar date;
	String titre;
	String contenu;
	@ManyToOne
	UtilisateurEntity utilisateur;
	public Post() {
		super();
	}

	public Post(String titre, String contenu, UtilisateurEntity utilisateur) {
		super();
		this.titre = titre;
		this.contenu = contenu;
		this.utilisateur = utilisateur;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Calendar getDate() {
		return date;
	}
	public void setDate(Calendar date) {
		this.date = date;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public UtilisateurEntity getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(UtilisateurEntity utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	
	

}
