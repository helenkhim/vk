package domain;

public class Post {
    private int idPost;
    private int AuthorPost;
    private String textPost;
    private String dataAndTime;
    private String UrlText;
    private int like;
    private int repost;
    private int view;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getAuthorPost() {
        return AuthorPost;
    }

    public void setAuthorPost(int authorPost) {
        AuthorPost = authorPost;
    }

    public String getTextPost() {
        return textPost;
    }

    public void setTextPost(String textPost) {
        this.textPost = textPost;
    }

    public String getDataAndTime() {
        return dataAndTime;
    }

    public void setDataAndTime(String dataAndTime) {
        this.dataAndTime = dataAndTime;
    }

    public String getUrlText() {
        return UrlText;
    }

    public void setUrlText(String urlText) {
        UrlText = urlText;
    }

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }
}