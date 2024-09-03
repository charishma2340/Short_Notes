package com.example.shortnotes;

public class Note {
    private String title;
    private String content;
    private String password;

    public Note() {

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // Constructor with privacy password
    public Note(String title, String content, String password){
        this.title = title;
        this.content = content;
        this.password = password;
    }

    // View note with privacy password
    public String viewNote(String passwordAttempt) {
        if (passwordAttempt.equals(this.password)) {
            return this.content;
        } else {
            return "Incorrect password. Access denied.";
        }
    }

    // Delete note with privacy password
    public String deleteNote(String passwordAttempt) {
        if (passwordAttempt.equals(this.password)) {
            this.content = "";
            return "Note deleted successfully.";
        } else {
            return "Incorrect password. Deletion denied.";
        }
    }
}
