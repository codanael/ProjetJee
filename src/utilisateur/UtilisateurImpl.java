package utilisateur;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.UtilisateurEntity;

@Stateless
public class UtilisateurImpl implements UtilisateurLocal {
	
	@PersistenceContext(unitName = "Utilisateur")
	private EntityManager em;

	@Override
	public UtilisateurEntity addUtilisateur(String username, String password) {
		try {
			UtilisateurEntity u = new UtilisateurEntity(username, password);
			em.persist(u);
			return u;
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

	@SuppressWarnings("unchecked")
	@Override
	public List<UtilisateurEntity> getutilisateurs() {
		Query req = em.createQuery("select u from UtilisateurEntity u");
		return req.getResultList();
	}

	@Override
	public int getid(UtilisateurEntity u) {
		UtilisateurEntity uu = em.find(UtilisateurEntity.class, u);
		if(uu == null) throw new RuntimeException("Cet utilisateur n'existe pas");
		return uu.getId();
	}

	@Override
	public String getusername(UtilisateurEntity u) {
		UtilisateurEntity uu = em.find(UtilisateurEntity.class, u);
		if(uu == null) throw new RuntimeException("Cet utilisateur n'existe pas");
		return uu.getUsername();
	}

	@Override
	public String getpassword(UtilisateurEntity u) {
		UtilisateurEntity uu = em.find(UtilisateurEntity.class, u);
		if(uu == null) throw new RuntimeException("Cet utilisateur n'existe pas");
		return uu.getPassword();
	}

}
