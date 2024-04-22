package com.example.networking;

import com.google.gson.annotations.SerializedName;

public class Mountain {
    private String name;
    private String location;
    @SerializedName("size")
    private int heightMeters;
    @SerializedName("cost")
    private int heightFeet;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getHeightMeters() {
        return heightMeters;
    }

    public void setHeightMeters(int heightMeters) {
        this.heightMeters = heightMeters;
    }

    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }



    public Mountain(String name, String location, int heightMeters, int heightFeet) {
        this.name = name;
        this.location = location;
        this.heightMeters = heightMeters;
        this.heightFeet = heightFeet;
    }
}
