package post;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.Post;

@Stateless
public class PostImpl implements PostLocal {
	
	@PersistenceContext(unitName = "Utilisateur")
	private EntityManager em;

	@Override
	public Post addPost(String titre, String contenu) {
		try {
			Post p = new Post(titre, contenu);
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

}
