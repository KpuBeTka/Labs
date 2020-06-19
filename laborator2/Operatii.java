package laborator2;
import java.util.Scanner;

public class Operatii{
    int a, b;

    void initializare(int a, int b){
        this.a = a;
        this.b = b;
    }

    int adunare(){
        return a + b;
    }

    int scadere(){
        return a - b;
    }

    int inmultire(){
        return a * b;
    }

    double impartire(){
        return a / b;
    }

    public static void main(String [] args){
        Scanner cin = new Scanner(System.in);
        Operatii ob1 = new Operatii();

        System.out.print("a = ");
        int a = cin.nextInt();
        System.out.println("b = ");
        int b = cin.nextInt();

        ob1.initializare(a, b);

        System.out.println("a + b = " + ob1.adunare());
        System.out.println("a - b = " + ob1.scadere());
        System.out.println("a * b = " + ob1.inmultire());
        System.out.println("a / b = " + ob1.impartire());

        cin.close();
    }
}