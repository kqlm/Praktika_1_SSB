package org.example;

public class photosalonnn {
    private int ID;
    private client client_id;
    private photograf photograf_id;
    public int getId() {
        return ID;
    }
    public void setId(int ID) {
        this.ID = ID;
    }

    public client getClient_id() {
        return client_id;
    }

    public void setClient_id(client id_client) {
        this.client_id = client_id;
    }

    public photograf getPhotograf_id(){
        return photograf_id;
    }
    public void setPhotograf_id(photograf photograf_id){
        this.photograf_id = photograf_id;
    }

}