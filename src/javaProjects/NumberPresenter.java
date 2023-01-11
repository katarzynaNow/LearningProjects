package javaProjects;

public class NumberPresenter {
        public static void main(String[] args) {

            int i = 123;

            showInt(i);
            showIntAsBinary(i);
            showIntAsOctal(i);
            showIntAsHex(i);
        }

        public static void showInt(int i) {
            System.out.print("Dec: ");
            System.out.printf("%32s%n", i);
            System.out.println("--------------------------------------------");
        }

        public static void showIntAsBinary(int i) {
            System.out.print("Bin: ");
            System.out.printf("%32s%n",Integer.toBinaryString(i));
        }

        public static void showIntAsOctal(int i) {
            System.out.print("Oct: ");
            System.out.printf("%32s%n",Integer.toOctalString(i));
        }

        public static void showIntAsHex(int i) {
            System.out.print("Hex: ");
            System.out.printf("%32s%n", Integer.toHexString(i));
        }
    }

