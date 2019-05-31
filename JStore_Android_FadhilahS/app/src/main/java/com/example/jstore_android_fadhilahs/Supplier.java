package com.example.jstore_android_fadhilahs;

public class Supplier {
    private int id;
    private String name;
    private String email;
    private String phoneNumber;
    private Location location;

    public Supplier (int id, String name, String email, String phoneNumber, Location location) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.location = location;
    }
    /**
     * method getter untuk mendapatkan data
     * @return id
     */
    public int getId(){
        return id;
    }
    /**
     * method getter untuk mendapatkan data
     * @return name
     */
    public String getName(){
        return name;
    }
    /**
     * method getter untuk mendapatkan data
     * @return email
     */
    public String getEmail(){
        return email;
    }
    /**
     * method getter untuk mendapatkan data
     * @return phoneNumber
     */
    public String getPhoneNumber(){
        return phoneNumber;
    }
    /**
     * method getter untuk mendapatkan data
     * @return location
     */
    public Location getLocation(){
        return location;
    }
    /**
     * method setter
     * @param id
     */
    public void setId(int id){
        this.id=id;
    }
    /**
     * method setter
     * @param name
     */

    public void setName(String name){
        this.name=name;
    }
    /**
     * method setter
     * @param email
     */
    public void setEmail(String email){
        this.email=email;
    }
    /**
     * method setter
     * @param phoneNumber
     */
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber=phoneNumber;
    }
    /**
     * method setter
     * @param location
     */
    public void setLocation(Location location){
        this.location=location;
    }

    public String toString()
    {
        return "= Location ===============================" +
                "\nName      : " + name +
                "\nEmail     : " + email +
                "\nTelephone : " + phoneNumber +
                "\nLocation  : " + location.getCity() + ", " + location.getProvince() +
                "\n==========================================";
    }
}