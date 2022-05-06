package org.launchcode.studio7;

public abstract class BaseDisc {
    private String name;
    private String releaseDate;
    private double capacity;
    private String discType;
    private int minSpeed;
    private int maxSpeed;

    public BaseDisc(String name, String releaseDate, double capacity, String discType, int minSpeed, int maxSpeed) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.capacity = capacity;
        this.discType = discType;
        this.minSpeed = minSpeed;
        this.maxSpeed =maxSpeed;
    }

    public String getName() {
        return name;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getDiscType() {
        return discType;
    }

    public int getMinSpeed() {
        return minSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
}
