package utilisateur;
import java.util.List;

import javax.ejb.Local;

import entities.UtilisateurEntity;

@Local
public interface UtilisateurLocal {
	public UtilisateurEntity addUtilisateur(String username, String password);
	public UtilisateurEntity getUtilisateur(int id);
	public List<UtilisateurEntity> getutilisateurs();
	int getid();
	String getusername();
	String getpassword();
	
}
