package laborator3;

class Cube{
    static String volFormula = "a^3";
    double a;

    Cube(double a){
        this.a = a;
    }

    void calcCube(boolean confirmSquare){
        double V = a * a * a;
        double A = 6 * (a * a);

        if(confirmSquare){
            System.out.println("V = " + V);
            System.out.println("A = " + A);
        } else
            System.out.println("V = " + V);
    }
}

class Piramide{
    static String volFormula = "1/3 * S * H";
    double a, b; //latura la baza piramidei si latura laterala

    Piramide(double a, double b){
        this.a = a;
        this.b = b;
    }

    void calcPiramide(boolean confirmSquare){
        double h = Math.sqrt(b*b - (a/2)*(a/2));
        double V = (a*a * h) / 3;

        double p = (a + b + b)/2;
        double A = (a*a) + 4*Math.sqrt(p*(p-a)*(p-b)*(p-b));

        if(confirmSquare){
            System.out.println("V = " + V);
            System.out.println("A = " + A);
        } else
            System.out.println("V = " + V);
        }
    }

class Demo{
    public static void main(String[] args){
        Cube c1 = new Cube(4);
        Piramide p1 = new Piramide(5, 3);

        System.out.println("===========================");
        System.out.println("Proprietatile cubului:");
        c1.calcCube(true);
        System.out.println("===========================");
        
        System.out.println("");

        System.out.println("===========================");
        System.out.println("Proprietatile piramidei:");
        p1.calcPiramide(true);
        System.out.println("===========================");
    }
}