package javaProjects.constructors;

public class A {

    public A() {
        System.out.println("Constructor A()");
    }

    public A(boolean isSilent) {
        if (!isSilent) {
            System.out.println("Constructor A(" + isSilent + ")");
        }
    }








}
