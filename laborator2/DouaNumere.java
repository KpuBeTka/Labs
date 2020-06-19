package laborator2;
import java.util.Scanner;

public class DouaNumere{
    public int a = 0;

    void setVal(final int a) {
        this.a = a;
    }

    void getVal() {
        System.out.println("a = " + a);
    }

    double getHalf() {
        return a / 2;
    }

    public static void main(final String[] args) {
        final Scanner cin = new Scanner(System.in);

        System.out.print("a = ");
        final int a = cin.nextInt();

        final DouaNumere ob1 = new DouaNumere();
        
        ob1.setVal(a);
        ob1.getVal();
        System.out.println("a/2 = " + ob1.getHalf());

        cin.close();
    }
}