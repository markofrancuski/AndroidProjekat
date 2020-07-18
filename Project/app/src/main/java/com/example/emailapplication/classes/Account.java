package com.example.emailapplication.classes;

import java.util.ArrayList;

public class Account {

    private Integer id;

    private String smtp;
    private String imap;
    private String username;
    private String password;

    private ArrayList<Integer> messages;


    public Account(Integer id, String smtp, String imap,String username, String password, ArrayList<Integer> messages ){
        this.id = id;
        this.smtp = smtp;
        this.imap = imap;
        this.username = username ;
        this.password = password ;
        this.messages = messages;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSmtp() {
        return smtp;
    }

    public void setSmtp(String smtp) {
        this.smtp = smtp;
    }

    public String getImap() {
        return imap;
    }

    public void setImap(String imap) {
        this.imap = imap;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public ArrayList<Integer> getMessages() {
        return messages;
    }

    public void setMessages(ArrayList<Integer> messages) {
        this.messages = messages;
    }
}
