package com.example.reservationsystem;

public class Services {
    private String name;
    private String description;
    //private int imageResourceId;

    //Creating an Array from which the List Array Adapter chooses data to show into the
    //activity_Options activity

    public static final Services[] option = {
            new Services("PNR Search" , "Check current Ticket Status") ,
            new Services("Search By Station" , "Check Which train will arrive here") ,
            new Services("By Train Name" , "Locate Live Train Status") ,
            new Services("Seat Availability" , "For checking available seats") ,
            new Services("Customer Settings" , "For ease of customer")
    };

    //Initialing Services with the names and their description
    private Services(String name , String description){
        this.name = name;
        this.description = description;
        //this.imageResourceId = imageResourceId;
    }

    public String getDescription(){
        return description;
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
