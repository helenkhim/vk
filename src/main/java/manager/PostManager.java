package manager;
import domain.Post;

public class PostManager {
    private Post[] posts;

    public Post[] getPosts() {
        return posts;
    }

    public Post[] search(int ownerId, String domain, String query, int ownersOnly, int count, int offset) {
        return null;
    }

    public void delete(int ownerId, int postId) {
        return;
    }
}