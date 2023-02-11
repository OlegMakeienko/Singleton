package com.makeienko;

public enum Singleton_Fabric_3 {
    INSTANCE;

    private String Name_of_fabric = "Fabric 3";
    private int count_of_personal = 300;

    public int getCount_of_personal() {
        return count_of_personal;
    }

    public void setCount_of_personal(int count_of_personal) {
        this.count_of_personal = count_of_personal;
    }

    public String getName_of_fabric() {
        return Name_of_fabric;
    }

    public void setName_of_fabric(String name_of_fabric) {
        Name_of_fabric = name_of_fabric;
    }
}
