package com.arturnmk.java;

public class InfoDispatcher {


    private static String weather ="No data";

    public static String getWeather() {
        return weather;
    }

    public static void setWeather(String weather) {

        //TODO: run python script and read output
        InfoDispatcher.weather = weather;
    }

}
