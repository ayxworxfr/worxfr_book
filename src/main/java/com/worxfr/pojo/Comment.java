package com.worxfr.pojo;

public class Comment {
    private Long id;

    private String content;

    private Long topicId;

    private Long userId;

    private Long parentId;

    private Integer allComment;

    private Integer promptComment;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
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