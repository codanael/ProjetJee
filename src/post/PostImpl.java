package post;

import java.util.Calendar;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import entities.Post;
import entities.UtilisateurEntity;

@Stateless
public class PostImpl implements PostLocal {
	
	@PersistenceContext(unitName = "Utilisateur")
	private EntityManager em;

	@Override
	public Post addPost(String titre, String contenu, UtilisateurEntity utilisateur) {
		try {
			Post p = new Post(titre, contenu, utilisateur);
			p.setDate(Calendar.getInstance());
			em.persist(p);
			return p;
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public Post getPost(int id) {
		Post p = em.find(Post.class, id);
		if(p == null) throw new RuntimeException("Ce post n'existe pas");
		return p;

	}

	@Override
	public List<Post> getPosts() {
		Query req = em.createQuery("select p from Post p");
		return req.getResultList();
	}

}
