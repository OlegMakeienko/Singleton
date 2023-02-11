package com.makeienko;

public class Main {

    public static void main(String[] args) {

        Singleton_Fabric_1 fabric_1 = Singleton_Fabric_1.INSTANCE;
        Singleton_Fabric_1 fabric_11 = Singleton_Fabric_1.INSTANCE;

        fabric_1.setName_of_fabric("Fabric_2");

        System.out.println(fabric_1 + " name of fabric is " + fabric_1.getName_of_fabric());
        System.out.println(fabric_11 + " name of fabric is " + fabric_11.getName_of_fabric());

        System.out.println("-----------------------------------------");

        Singleton_Fabric_2 fabric_2 = Singleton_Fabric_2.getInstance();
        Singleton_Fabric_2 fabric_22 = Singleton_Fabric_2.getInstance();

        fabric_2.setCount_of_personal(205);

        System.out.println(fabric_2 + " count of personal is " + fabric_2.getCount_of_personal());
        System.out.println(fabric_22 + " count of personal is " + fabric_22.getCount_of_personal());

        System.out.println("-----------------------------------------");

        Singleton_Fabric_3 fabric_3 = Singleton_Fabric_3.INSTANCE;
        Singleton_Fabric_3 fabric_33 = Singleton_Fabric_3.INSTANCE;

        fabric_3.setCount_of_personal(303);

        System.out.println(Integer.toHexString(fabric_3.hashCode()) + " count of personal is " + fabric_3.getCount_of_personal());
        System.out.println(Integer.toHexString(fabric_33.hashCode()) + " count of personal is " + fabric_33.getCount_of_personal());
    }
}
