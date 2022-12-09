package TV;

public class PhilipsTV implements TV {

    private String id;
    protected boolean activeStatus = false;
    private int currentProgram = 3;
    private int cale;

    protected PhilipsTV(String id, int inch) {
        this.id = id;
        this.cale = inch;
    }

    public String getId() {
        return id;
    }

    public void turnOn() {
        activeStatus = true;
        emission();
        System.out.println("Welcome!");
    }

    @Override
    public void turnOff() {
        activeStatus = false;
        System.out.println("Darkness");
    }

    @Override
    public void powering() {
        if (activeStatus) {
            turnOff();
        } else {
            turnOn();
        }
    }

    @Override
    public void changeTelevisionProgram(int number) {
        if(activeStatus) {
            currentProgram = number;
        }
    }

    private void emission() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (activeStatus) {
                    try {
                        System.out.println("Program: " + currentProgram);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();
    }
}
