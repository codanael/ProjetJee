package utilisateur;
import java.util.List;

import javax.ejb.Local;

import entities.UtilisateurEntity;

@Local
public interface UtilisateurLocal {
	public UtilisateurEntity addUtilisateur(String username, String password);
	public UtilisateurEntity getUtilisateur(int id);
	public List<UtilisateurEntity> getutilisateurs();
	public int getid(UtilisateurEntity u);
	public String getusername(UtilisateurEntity u);
	public String getpassword(UtilisateurEntity u);
	
}
