package com.example.myapplication.secondHomework;
//职务类，包含职务编号，职务名称
public class Post {
    String postNumber;
    String postName;

    public Post() {
    }

    public Post(String postNumber, String postName) {
        this.postNumber = postNumber;
        this.postName = postName;
    }

    public String getPostNumber() {
        return postNumber;
    }

    public void setPostNumber(String postNumber) {
        this.postNumber = postNumber;
    }

    public String getPostName() {
        return postName;
    }

    public void setPostName(String postName) {
        this.postName = postName;
    }
}
