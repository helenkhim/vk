package domain;
public class Post {
    private int idPost;                     //индетификатор записи
    private int authorPost;                 //индетификатор автора записи
    private int ownerId;                    //индетификатор владельца стены, на которой размещена запись
    private int createdBy;                  //идентификатор администратора, который опубликовал запись
    private String textPost;                //текст записи
    private String dataAndTime;             //дата и врем записи
    private String urlText;                 //ссылка на статью
    private int view;                       //количество просмотров
    private int replyOwnerId;               //идентификатор владельца записи, в ответ на которую была оставлена текущая
    private int replyPostId;                //идентификатор записи, в ответ на которую была оставлена текущая
    private int friendsOnly;                //если запись была создана с опцией «Только для друзей»
    private int signerId;                   //идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    private int anPin;                      //информация о том, может ли текущий пользователь закрепить запись
    private int canDelete;                  //информация о том, может ли текущий пользователь удалить запись
    private int canEdit;                    //информация о том, может ли текущий пользователь редактировать запись
    private int isPinned;                   //информация о том, что запись закреплена
    private int markedAsAds;                //информация о том, содержит ли запись отметку "реклама"
    private int isFavorite;                 //true, если объект добавлен в закладки у текущего пользователя
    private int postponedId;                //идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
    private LikesInfo likesInfo;
    private CopyrightInfo copyrightInfo;
    private RepostInfo repostInfo;
    private CommentInfo commentInfo;
    private DonatInfo donatInfo;
    private GeoInfo geoInfo;

    public int getIdPost() {
        return idPost;
    }

    public void setIdPost(int idPost) {
        this.idPost = idPost;
    }

    public int getAuthorPost() {
        return authorPost;
    }

    public void setAuthorPost(int authorPost) {
        this.authorPost = authorPost;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
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
        return urlText;
    }

    public void setUrlText(String urlText) {
        this.urlText = urlText;
    }

    public int getView() {
        return view;
    }

    public void setView(int view) {
        this.view = view;
    }

    public int getReplyOwnerId() {
        return replyOwnerId;
    }

    public void setReplyOwnerId(int replyOwnerId) {
        this.replyOwnerId = replyOwnerId;
    }

    public int getReplyPostId() {
        return replyPostId;
    }

    public void setReplyPostId(int replyPostId) {
        this.replyPostId = replyPostId;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getAnPin() {
        return anPin;
    }

    public void setAnPin(int anPin) {
        this.anPin = anPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public int getIsFavorite() {
        return isFavorite;
    }

    public void setIsFavorite(int isFavorite) {
        this.isFavorite = isFavorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public CopyrightInfo getCopyrightInfo() {
        return copyrightInfo;
    }

    public void setCopyrightInfo(CopyrightInfo copyrightInfo) {
        this.copyrightInfo = copyrightInfo;
    }

    public RepostInfo getRepostInfo() {
        return repostInfo;
    }

    public void setRepostInfo(RepostInfo repostInfo) {
        this.repostInfo = repostInfo;
    }

    public CommentInfo getCommentInfo() {
        return commentInfo;
    }

    public void setCommentInfo(CommentInfo commentInfo) {
        this.commentInfo = commentInfo;
    }

    public DonatInfo getDonatInfo() {
        return donatInfo;
    }

    public void setDonatInfo(DonatInfo donatInfo) {
        this.donatInfo = donatInfo;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }
}

