package domain;

public class RepostInfo {
    private int repost;                     //количество репостов
    private int userReposted;              //наличие репоста от текущего пользователя

    public int getRepost() {
        return repost;
    }

    public void setRepost(int repost) {
        this.repost = repost;
    }

    public int getUserReposted() {
        return userReposted;
    }

    public void setUserReposted(int userReposted) {
        this.userReposted = userReposted;
    }
}
