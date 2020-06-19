package laborator3;
import java.util.Scanner;

class Fructe{
    String producator;
    int pret;

    Fructe(String producator){
        pret = 42;
        this.producator = producator;
    }

    Fructe(String producator, int pret){
        this.producator = producator;
        this.pret = pret;
    }

    void afiseaza(){
        System.out.println("Producatorul - " + producator + ", pretul = " + pret);
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Fructe f1 = new Fructe("Linella");
        Fructe f2 = new Fructe("Linella", 15);

        f1.afiseaza();
        f2.afiseaza();

        in.close();
    }
}