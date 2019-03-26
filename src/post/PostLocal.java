package post;

import javax.ejb.Local;

import entities.Post;
import entities.UtilisateurEntity;

@Local
public interface PostLocal {
	public Post addPost(String titre, String contenu, UtilisateurEntity utilisateur);
	public Post getPost(int id);

}
