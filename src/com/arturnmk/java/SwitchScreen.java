package com.arturnmk.java;

import java.util.TimerTask;

public class SwitchScreen extends TimerTask {
    private int screen=1; //starting screen

    public void run() {
        System.out.println("Switching screen! Current screen:"+screen);

        if (++screen>3) screen=1;


        switch (screen){
            case 1:
                System.out.println("time: ");
                //TODO: run python script to write string to LCD. Take time directly from Time library

                break;

            case 2:
                System.out.println("weather");
                //TODO: run python script to write string to LCD. Take weather from InfoDispatcher
                break;

            case 3:
                System.out.println("temps");
                //TODO: run python script to write string to LCD. Take weather from .sh script via python
                break;

        }

    }
}

