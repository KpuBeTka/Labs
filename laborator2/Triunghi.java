package laborator2;
import java.util.Scanner;

public class Triunghi{
    int a, b, c;

    void setVal(){
        Scanner cin = new Scanner(System.in);

        System.out.print("a = ");
        this.a = cin.nextInt();

        System.out.print("b = ");
        this.b = cin.nextInt();

        System.out.print("c = ");
        this.c = cin.nextInt();

        cin.close();
    }

    double getArea(){
        int p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    void getType(){
        if(a == b && b == c && c == a){
            System.out.print("Triunghiul este echilateral");
        } else if(a == b && b != c && a != c ||
                  b == c && b != a && c != a ||
                  c == a && c != b && a != b){
                    System.out.print("Triunghiul este isoscel");
                } else if(a*a == (b*b + c*c) ||
                          b*b == (a*a + c*c) ||
                          c*c == (a*a + b*b)){
                            System.out.print("Triunghiul este dreptunghic");
                        } else {
                            System.out.print("Triunghiul este scalen");
                        }
    }

    int getPerimeter(){
        return a + b + c;
    }

    double getSemiPerimeter(){
        return (a + b + c) / 2;
    }

    public static void main(String[] args){
        Scanner cin = new Scanner(System.in);

        Triunghi t1 = new Triunghi();

        System.out.println("=======================");

        t1.setVal();
        
        System.out.println("");

        t1.getType();
        
        System.out.println(", aria este egala cu " + t1.getArea() + ", perimetrul cu " + t1.getPerimeter()+
        ", iar semiperimetrul cu " + t1.getSemiPerimeter() + ".");

        System.out.println("=======================");

        cin.close();
    }
}