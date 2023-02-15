package com.makeienko;

public class SingletonFabric {
    private static SingletonFabric INSTANCE = null;

    private String nameOfFabric;
    private int countOfPersonal;

    private SingletonFabric(int countOfPersonal, String nameOfFabric1) {
        this.countOfPersonal = countOfPersonal;
        this.nameOfFabric = nameOfFabric1;
    }

    public static SingletonFabric getInstance() {
        synchronized (SingletonFabric.class) {
            if (INSTANCE == null) { INSTANCE =
                    new SingletonFabric(200, "Fabric2");
            }
        }
        return INSTANCE;
    }

    public int getCountOfPersonal() {
        return countOfPersonal;
    }

    public void setCountOfPersonal(int countOfPersonal) {
        this.countOfPersonal = countOfPersonal;
    }

    public String getNameOfFabric() {
        return nameOfFabric;
    }

    public void setNameOfFabric(String nameOfFabric) {
        this.nameOfFabric = nameOfFabric;
    }
}
