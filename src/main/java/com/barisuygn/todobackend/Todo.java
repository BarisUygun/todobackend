package com.barisuygn.todobackend;

public class Todo {
    private String id;
    private String title;
    private String description;
    private String dateCreated;

    public Todo(String i,String t,String d,String dd){
        this.id = i;
        this.title =t;
        this.description = d;
        this.dateCreated = dd;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getDescription(){
        return description;
    }
    public String getDateCreated(){
        return dateCreated;
    }

    public void setId(String Id){
        this.id = Id;
    }
    public void setTitle(String Title){
        this.title =Title;
    }
    public void setDescription(String Desc){
       this.description = Desc;
    }
    public void setDateCreated(String dCreate){
        this.dateCreated = dCreate;
    }
    
}
