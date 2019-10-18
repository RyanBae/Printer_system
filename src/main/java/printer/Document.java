package printer;


public class Document {
    Integer page;
    String title, content, userNo;

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    @Override
    public String toString() {
        return "Document{" +
                "page=" + page +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", userNo='" + userNo + '\'' +
                '}';
    }
}
