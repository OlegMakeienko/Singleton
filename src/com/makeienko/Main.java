package com.makeienko;

public class Main {

    public static void main(String[] args) {

        SingletonFabric fabric1 = SingletonFabric.getInstance();
        SingletonFabric fabric11 = SingletonFabric.getInstance();

        fabric1.setNameOfFabric("Fabric2");

        System.out.println(fabric1 + " name of fabric is " + fabric1.getNameOfFabric());
        System.out.println(fabric11 + " name of fabric is " + fabric11.getNameOfFabric());

        System.out.println("-----------------------------------------");

        }
}
