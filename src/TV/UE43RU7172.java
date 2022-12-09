package TV;

public class UE43RU7172 extends SamsungTV {
    private String id;
    private String hdmi1;
    private String hdmi2;
    private String usb1;
    private String usb2;


    public UE43RU7172(String id) {
        super(43);
    }

    public void setHdmi1(String hdmi1) {
        this.hdmi1 = hdmi1;
    }

    public void setHdmi2(String hdmi2) {
        this.hdmi2 = hdmi2;
    }

    public void setUsb1(String usb1) {
        this.usb1 = usb1;
    }

    public void setUsb2(String usb2) {
        this.usb2 = usb2;
    }
}
