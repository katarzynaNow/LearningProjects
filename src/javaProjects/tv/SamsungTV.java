package javaProjects.tv;

public class SamsungTV implements TV {

    private boolean activeStatus = false;
    private int tvChannel = 1;

    private int inch;

    protected SamsungTV(int inch) {
        this.inch = inch;
    }

    @Override
    public void turnOn() {
        activeStatus = true;
        System.out.println("SAMSUNG TV");
        display();
    }

    @Override
    public void turnOff() {
        System.out.println("DARKNESS ANIMATION");
        activeStatus = false;
    }

    @Override
    public void powering() {
        if(activeStatus) {
            turnOff();
        } else {
            turnOn();
        }
    }

    @Override
    public void changeTelevisionProgram(int number) {
        if (activeStatus) {
            tvChannel = number;
        }
    }

    private void display() {
        new Thread(new Runnable(){
            @Override
            public void run() {
                while(activeStatus){

                    try {
                        System.out.println("Display channel: " + tvChannel);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
