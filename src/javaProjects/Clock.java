package javaProjects;

import java.time.LocalDateTime;

public class Clock implements Runnable{
    private Thread thread;
    String hour, minutes, seconds;

    public Clock() {
        thread = new Thread(this);
        thread.start();
    }

    @Override
    public void run() {
        try {
            while (true) {
                LocalDateTime today = LocalDateTime.now();
                hour = "" + today.getHour();
                minutes = String.format( "%02d",today.getMinute());
                seconds = String.format( "%02d",today.getSecond());
                System.out.println(hour + ":" + minutes + ":" + seconds );
                thread.sleep(1000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Clock clock = new Clock();
    }
}

