package org.example;

public class client {
    private int ID;
    private String name;
    public client(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public int getId() {
        return ID;
    }

    public void setId(int ID) {
        this.ID = ID;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}