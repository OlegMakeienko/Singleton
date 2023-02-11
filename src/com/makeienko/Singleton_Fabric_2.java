package com.makeienko;

public class Singleton_Fabric_2 {

    private static Singleton_Fabric_2 INSTANCE =
            new Singleton_Fabric_2(200, "Fabric_2");

    private String Name_of_fabric;
    private int count_of_personal;

    private Singleton_Fabric_2(int count_of_personal, String name_of_fabric) {
        this.count_of_personal = count_of_personal;
        Name_of_fabric = name_of_fabric;
    }

    public static Singleton_Fabric_2 getInstance() {
        if (INSTANCE == null) INSTANCE =
                new Singleton_Fabric_2(200, "Fabric_2");
        return INSTANCE;
    }

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
