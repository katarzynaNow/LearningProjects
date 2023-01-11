package javaProjects.constructors;

public class B extends A{
    public B() {
        System.out.println("Constructor B()");
    }

    public B(boolean isSilent) {
        super(true);
        if (!isSilent) {
            System.out.println("Constructor B(" + isSilent + ")");
        }
    }


}
