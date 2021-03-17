package domain;

public class LikesInfo {
    private int like;                       //число пользователей, которым понравилась запись;
    private int userLikes;                  //наличие отметки «Мне нравится» от текущего пользователя
    private int canLike;                    //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private int canPublish;                 //информация о том, может ли текущий пользователь сделать репост записи

    public int getLike() {
        return like;
    }

    public void setLike(int like) {
        this.like = like;
    }

    public int getUserLikes() {
        return userLikes;
    }

    public void setUserLikes(int userLikes) {
        this.userLikes = userLikes;
    }

    public int getCanLike() {
        return canLike;
    }

    public void setCanLike(int canLike) {
        this.canLike = canLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}

