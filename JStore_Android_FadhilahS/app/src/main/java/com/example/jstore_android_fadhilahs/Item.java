package com.example.jstore_android_fadhilahs;

public class Item {
    private int id;
    private String name;
    private int price;
    private String category;
    private String status;
    private Supplier supplier;

    public Item(int id, String name, int price, String category, String status, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
        this.status = status;
        this.supplier = supplier;
    }

    /**
     * method getter untuk mendapatkan data
     * @return id
     */
    public int getId() {
        return id;
    }
    /**
     * method setter
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * method getter untuk mendapatkan data
     * @return name
     */
    public String getName() {
        return name;
    }
    /**
     * method setter
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * method getter untuk mendapatkan data
     * @return price
     */
    public int getPrice() {
        return price;
    }
    /**
     * method setter
     * @param price
     */
    public void setPrice(int price) {
        this.price = price;
    }
    /**
     * method getter untuk mendapatkan data
     * @return id
     */
    public String getCategory() {
        return category;
    }
    /**
     * method setter
     * @param category
     */
    public void setCategory(String category) {
        this.category = category;
    }
    /**
     * method getter untuk mendapatkan data
     * @return status
     */
    public String getStatus() {
        return status;
    }
    /**
     * method setter
     * @param status
     */
    public void setStatus(String status) {
        this.status = status;
    }
    /**
     * method getter untuk mendapatkan data
     * @return supplier
     */
    public Supplier getSupplier() {
        return supplier;
    }
    /**
     * method setter
     * @param supplier
     */
    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }


}