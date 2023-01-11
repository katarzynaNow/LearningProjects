package javaProjects.constructors;

public class C extends B{
    public C() {
        System.out.println("Constructor C()");
    }

    public C(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Constructor C(" + isSilent + ")");
        }
    }




}
