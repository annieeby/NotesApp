package com.example.notesapp.models;

public class Note {

    //what must a note include? e.g. title, content, timestamp. these are the properties or fields that make a note a note

    private String title;
    private String content;
    private String timestamp;

    // alt + insert generate constructor

    public Note(String title, String content, String timestamp) {
        this.title = title;
        this.content = content;
        this.timestamp = timestamp;
    }

    // alt+enter to Generate empty constructor (deselect all)
    public Note() {
    }

    // alt+enter to Generate: Getter and Setter

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

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }


    // alt+insert to Generate: To String()
    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", timestamp='" + timestamp + '\'' +
                '}';
    }
}
