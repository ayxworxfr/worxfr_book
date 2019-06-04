package com.worxfr.pojo;

public class Topic {
    private Long id;

    private String title;

    private Integer allComment;

    private Integer promptComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Integer getAllComment() {
        return allComment;
    }

    public void setAllComment(Integer allComment) {
        this.allComment = allComment;
    }

    public Integer getPromptComment() {
        return promptComment;
    }

    public void setPromptComment(Integer promptComment) {
        this.promptComment = promptComment;
    }
}