package com.example.emailapplication.classes;

public class Photo {

    private Integer id;
    private String path;
    private Integer contact_id;

    public Photo(Integer id, String path, Integer contact_id)
    {
        this.id = id;
        this.path = path;
        this.contact_id = contact_id;
    }

    public Integer getContact_id()
    {
        return  contact_id;
    }

    public void setContact_id(Integer contact_id){
        this.contact_id = contact_id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
