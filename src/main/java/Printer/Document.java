package Printer;

import java.util.ArrayList;

public class Document {
    Integer page;
    String title, content;

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

    @Override
    public String toString() {
        return "Document{" +
                "page=" + page +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
