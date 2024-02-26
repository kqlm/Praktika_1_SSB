package org.example;

public class photograf {
    private int ID;
    private String name;
    public photograf(int id, String name) {
        this.ID = id;
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