package post;

import javax.ejb.Local;

import entities.Post;

@Local
public interface PostLocal {
	public Post addPost(String titre, String contenu);
	public Post getPost(int id);

}
