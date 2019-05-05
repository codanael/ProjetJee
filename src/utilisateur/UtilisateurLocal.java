package utilisateur;
import java.util.List;

import javax.ejb.Local;

import entities.UtilisateurEntity;

@Local
public interface UtilisateurLocal {
	
	public UtilisateurEntity logout();
	
	
	public UtilisateurEntity login(String username, String password);
	
	/**
	 * Creation d'un utilisateur
	 * @param username : nom d'utilisateur
	 * @param password : mot de passe
	 * @return : un objet UtilisateurEntity
	 */
	public UtilisateurEntity addUtilisateur(String username, String password);
	/**
	 * Affichage d'un utilisateur à partir de la base de données avec un id en entree 
	 * @param id
	 * @return : un objet UtilisateurEntity
	 */
	public UtilisateurEntity getUtilisateur(int id);
	
	public UtilisateurEntity getUtilisateur();
	/**
	 * Liste tous les utilisateurs dans la base de données
	 * @return : une liste d'UtilisateurEntity
	 */
	public List<UtilisateurEntity> getutilisateurs();
	/**
	 * Donne l'id de l'utilisateur de la session
	 * @return : id
	 */
	int getid();
	/**
	 * Donne le nom d'utilisateur de l'utilisateur de la session
	 * @return : username
	 */
	String getusername();
	/**
	 * Donne le mot de passe de l'utilisateur de la session
	 * @return password
	 */
	String getpassword();
	/**
	 * Change le nom d'utilisateur de l'utilisateur de la session
	 * @param username
	 */
	void setusername(String username);
	/**
	 * Change le mot de passe de l'utilisateur de la session
	 * @param password
	 */
	void setpassword(String password);
	
}
