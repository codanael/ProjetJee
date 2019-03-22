package utilisateur;

import java.util.List;

import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.UtilisateurEntity;

@Stateful
public class UtilisateurImpl implements UtilisateurLocal {
	
	@PersistenceContext(unitName = "Utilisateur")
	private EntityManager em;
	UtilisateurEntity utilisateur;

	@Override
	public UtilisateurEntity addUtilisateur(String username, String password) {
		try {
			utilisateur = new UtilisateurEntity(username, password);
			em.persist(utilisateur);
			return utilisateur;
		} catch (RuntimeException e) {
			return null;
		}
	}

	@Override
	public UtilisateurEntity getUtilisateur(int id) {
		UtilisateurEntity u = em.find(UtilisateurEntity.class, id);
		if(u == null) throw new RuntimeException("Cet utilisateur n'existe pas");
		return u;
	}
	
	public UtilisateurEntity getUtilisateur() {
		
		try {
			return utilisateur;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UtilisateurEntity> getutilisateurs() {
		Query req = em.createQuery("select u from UtilisateurEntity u");
		return req.getResultList();
	}

	@Override
	public int getid() {
		return utilisateur.getId();
	}

	@Override
	public String getusername() {
		return utilisateur.getUsername();
	}

	@Override
	public String getpassword() {
		return utilisateur.getPassword();
	}

}
