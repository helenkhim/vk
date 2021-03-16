package domain;

public class Post {
    private int idPost;                     //индетификатор записи
    private int AuthorPost;                 //индетификатор автора записи
    private int owner_id;                   //индетификатор владельца стены, на которой размещена запись
    private int created_by;                 //идентификатор администратора, который опубликовал запись
    private String textPost;                //текст записи
    private String dataAndTime;             //дата и врем записи
    private String UrlText;                 //ссылка на статью
    private int like;                       //число пользователей, которым понравилась запись;
    private int user_likes;                 //наличие отметки «Мне нравится» от текущего пользователя
    private int can_like;                   //информация о том, может ли текущий пользователь поставить отметку «Мне нравится»
    private int can_publish;                //информация о том, может ли текущий пользователь сделать репост записи
    private int repost;                     //количество репостов
    private int user_reposted;              //наличие репоста от текущего пользователя
    private int view;                       //количество просмотров
    private int reply_owner_id;             //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int reply_post_id;              //идентификатор записи, в ответ на которую была оставлена текущая
    private int friends_only;               //если запись была создана с опцией «Только для друзей»
    private String geo;                     //информация о местоположении
    private int signer_id;                  //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int an_pin;                     //информация о том, может ли текущий пользователь закрепить запись
    private int can_delete;                 //информация о том, может ли текущий пользователь удалить запись
    private int can_edit;                   //информация о том, может ли текущий пользователь редактировать запись
    private int is_pinned;                  //информация о том, что запись закреплена
    private int marked_as_ads;              //информация о том, содержит ли запись отметку "реклама"
    private int is_favorite;                //true, если объект добавлен в закладки у текущего пользователя
    private int is_donut;                   //запись доступна только платным подписчикам VK Donut
    private int paid_duration;              //время, в течение которого запись будет доступна только платным подписчикам VK Donut
    private boolean can_publish_free_copy;  //можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    private String edit_mode;               //информация о том, какие значения VK Donut можно изменить в записи
    private int postponed_id;               //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере

    public int getIdPost() {
        return idPost;
    }

    public int getOwner_id() {
        return owner_id;
    }

    public void setOwner_id(int owner_id) {
        this.owner_id = owner_id;
    }

    public int getCreated_by() {
        return created_by;
    }

    public void setCreated_by(int created_by) {
        this.created_by = created_by;
    }

    public int getUser_likes() {
        return user_likes;
    }

    public void setUser_likes(int user_likes) {
        this.user_likes = user_likes;
    }

    public int getCan_like() {
        return can_like;
    }

    public void setCan_like(int can_like) {
        this.can_like = can_like;
    }

    public int getCan_publish() {
        return can_publish;
    }

    public void setCan_publish(int can_publish) {
        this.can_publish = can_publish;
    }

    public int getUser_reposted() {
        return user_reposted;
    }

    public void setUser_reposted(int user_reposted) {
        this.user_reposted = user_reposted;
    }

    public int getReply_owner_id() {
        return reply_owner_id;
    }

    public void setReply_owner_id(int reply_owner_id) {
        this.reply_owner_id = reply_owner_id;
    }

    public int getReply_post_id() {
        return reply_post_id;
    }

    public void setReply_post_id(int reply_post_id) {
        this.reply_post_id = reply_post_id;
    }

    public int getFriends_only() {
        return friends_only;
    }

    public void setFriends_only(int friends_only) {
        this.friends_only = friends_only;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public int getSigner_id() {
        return signer_id;
    }

    public void setSigner_id(int signer_id) {
        this.signer_id = signer_id;
    }

    public int getAn_pin() {
        return an_pin;
    }

    public void setAn_pin(int an_pin) {
        this.an_pin = an_pin;
    }

    public int getCan_delete() {
        return can_delete;
    }

    public void setCan_delete(int can_delete) {
        this.can_delete = can_delete;
    }

    public int getCan_edit() {
        return can_edit;
    }

    public void setCan_edit(int can_edit) {
        this.can_edit = can_edit;
    }

    public int getIs_pinned() {
        return is_pinned;
    }

    public void setIs_pinned(int is_pinned) {
        this.is_pinned = is_pinned;
    }

    public int getMarked_as_ads() {
        return marked_as_ads;
    }

    public void setMarked_as_ads(int marked_as_ads) {
        this.marked_as_ads = marked_as_ads;
    }

    public int getIs_favorite() {
        return is_favorite;
    }

    public void setIs_favorite(int is_favorite) {
        this.is_favorite = is_favorite;
    }

    public int getIs_donut() {
        return is_donut;
    }

    public void setIs_donut(int is_donut) {
        this.is_donut = is_donut;
    }

    public int getPaid_duration() {
        return paid_duration;
    }

    public void setPaid_duration(int paid_duration) {
        this.paid_duration = paid_duration;
    }

    public boolean isCan_publish_free_copy() {
        return can_publish_free_copy;
    }

    public void setCan_publish_free_copy(boolean can_publish_free_copy) {
        this.can_publish_free_copy = can_publish_free_copy;
    }

    public String getEdit_mode() {
        return edit_mode;
    }

    public void setEdit_mode(String edit_mode) {
        this.edit_mode = edit_mode;
    }

    public int getPostponed_id() {
        return postponed_id;
    }

    public void setPostponed_id(int postponed_id) {
        this.postponed_id = postponed_id;
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