package domain;

public class CommentInfo {
    private int quantityComments;   //количетсво комментариев
    private String commentText;     //текст комментария
    private int dataAndTimeComment; //дата и время комментария
    private int idAuthor;           //идетификатор автора комментария
    private int can_post;           //информация о том, может ли текущий пользователь комментировать запись
    private int groups_can_post;    //информация о том, могут ли сообщества комментировать запись
    private boolean can_close;      //может ли текущий пользователь закрыть комментарии к записи
    private boolean can_open;       //может ли текущий пользователь открыть комментарии к записи

    public int getCan_post() {
        return can_post;
    }

    public void setCan_post(int can_post) {
        this.can_post = can_post;
    }

    public int getGroups_can_post() {
        return groups_can_post;
    }

    public void setGroups_can_post(int groups_can_post) {
        this.groups_can_post = groups_can_post;
    }

    public boolean isCan_close() {
        return can_close;
    }

    public void setCan_close(boolean can_close) {
        this.can_close = can_close;
    }

    public boolean isCan_open() {
        return can_open;
    }

    public void setCan_open(boolean can_open) {
        this.can_open = can_open;
    }

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
}
