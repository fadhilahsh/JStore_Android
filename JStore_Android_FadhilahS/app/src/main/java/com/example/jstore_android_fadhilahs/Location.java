package com.example.jstore_android_fadhilahs;

public class Location {
    private String province;
    private String description;
    private String city;

    public Location(String province, String description, String city) {
        this.province = province;
        this.description = description;
        this.city = city;
    }

    /**
     * method getter
     * @param province
     */

    public String getProvince() {
        return province;
    }
    /**
     * method setter
     * @param province
     */
    public void setProvince(String province) {
        this.province = province;
    }
    /**
     * method getter
     * @return  description
     */
    public String getDescription() {
        return description;
    }
    /**
     * method setter
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * method getter
     * @return city
     */
    public String getCity() {
        return city;
    }
    /**
     * method setter
     * @param city
     */
   public void setCity(String city) {
        this.city = city;
    }


}