package javaProjects.tv;

public abstract class PhilipsAmbilightTV extends PhilipsTV {

    protected PhilipsAmbilightTV(String id, int inch) {
        super(id, inch);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        ambilight();
    }

    @Override
    public void turnOff() {
        super.turnOff();
    }

    private void ambilight() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(activeStatus) {
                    try {
                        System.out.println("Background colors");
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }).start();

    }
}
