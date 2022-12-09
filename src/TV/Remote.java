package TV;

public class Remote implements RemoteControl {

    private TV television;
    @Override
    public void pressRed() {
        television.powering();

    }

    @Override
    public void pressOne() {
        television.changeTelevisionProgram(1);
    }

    @Override
    public void pressTwo() {
        television.changeTelevisionProgram(2);
    }

    @Override
    public void pressThree() {
        television.changeTelevisionProgram(3);
    }

    @Override
    public void pairTv(TV television) {
        this.television = television;
    }
}
