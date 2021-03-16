package domain;

public class CommentInfo {
    private int quantityComments;

    public int getQuantityComments() {
        return quantityComments;
    }

    public void setQuantityComments(int quantityComments) {
        this.quantityComments = quantityComments;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public int getDataAndTimeComment() {
        return dataAndTimeComment;
    }

    public void setDataAndTimeComment(int dataAndTimeComment) {
        this.dataAndTimeComment = dataAndTimeComment;
    }

    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    private String commentText;
    private int dataAndTimeComment;
    private int idAuthor;
}
