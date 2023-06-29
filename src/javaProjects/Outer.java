package javaProjects;

public class Outer {
    int x = 1;

    public class Inner {
        int x = 2;

        public class InnerInner {
            int x = 3;
        }
    }

    public static void main(String[] args) {
        Outer a = new Outer();
        Inner b = a.new Inner();
        Inner.InnerInner c = b.new InnerInner();

        System.out.println(a.getClass() + ", x = " + a.x);
        System.out.println(b.getClass() + ", x = " + b.x);
        System.out.println(c.getClass() + ", x = " + c.x);
    }
}
