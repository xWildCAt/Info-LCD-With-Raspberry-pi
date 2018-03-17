package com.arturnmk.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.TimeZone;
import java.util.TimerTask;

public class SwitchScreen extends TimerTask {
    private int screen=1; //starting screen

    public void run() {
        if (++screen>3) screen=1;
        //System.out.println("Switching screen! Current screen:"+screen);

        switch (screen){
            case 1:
		PyWrite.write(InfoDispatcher.getWeather());
                //TODO: run python script to write string to LCD. Take time directly from Time library

                break;

            case 2:
                System.out.println("weather: "+InfoDispatcher.getWeather());
                //TODO: run python script to write string to LCD. Take weather from InfoDispatcher
                break;

            case 3:
                System.out.println("temps");
                //TODO: run python script to write string to LCD. Take weather from .sh script via python
                break;

        }

    }
}

