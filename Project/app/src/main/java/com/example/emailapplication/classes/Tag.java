package com.example.emailapplication.classes;

import java.util.List;

public class Tag {

    private Integer id;
    private String name;

    private List<Integer> messages_id;

    public Tag(Integer id, String name, List<Integer> messages_id){
        this.id = id;
        this.name = name;
        this.messages_id = messages_id;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<Integer> getMessages_id() {
        return messages_id;
    }
    public void setMessages_id(List<Integer> messages_id) {
        this.messages_id = messages_id;
    }
    public void addMessage(Integer messaage_id){
        this.messages_id.add(messaage_id);
    }
}
