package com.arturnmk.java;

import java.util.TimerTask;

public class InfoDispatcher extends TimerTask {


    private static String weather = "No data";

    public static String getWeather() {
        return weather;
    }

    public static void setWeather(String weather) {

        //TODO: run python script and read output
        InfoDispatcher.weather = weather;
    }

    @Override
    public void run() {

    }
}
