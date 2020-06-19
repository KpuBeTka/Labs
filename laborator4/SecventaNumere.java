package laborator4;
import java.util.ArrayList;
import java.util.Scanner;

class NumerePare{
    int numar;

    NumerePare(){
    }

    NumerePare(int numar){
        this.numar = numar;
    }

    void getNumar(){
        System.out.print(numar + " ");
    }
}

class NumereImpare{
    int numar;

    NumereImpare(){
    }

    NumereImpare(int numar){
        this.numar = numar;
    }

    void getNumar(){
        System.out.print(numar + " ");
    }
}

class mainSecventa{
    public static void main(String[] args){
        ArrayList<NumerePare> pare = new ArrayList<NumerePare>();
        ArrayList<NumereImpare> impare = new ArrayList<NumereImpare>();
        Scanner cin = new Scanner(System.in);

        System.out.print("Cate cifre va contine sirul? ");
        int n = cin.nextInt();
        int number = 0;

        System.out.println("Introduceti sirul de numere (fara 0):");

        for(int i = 0; i < n; i++){
            number = cin.nextInt();

            if(number == 0){
                System.out.println("Va rog sa introduceti numere diferite de 0");
            } else if (number % 2 == 0)
                pare.add(new NumerePare(number));
            else 
                impare.add(new NumereImpare(number));
        }

        System.out.println("");
        System.out.println("=================================");
        System.out.println("");

        System.out.println("Lista numerelor pare: ");
        for(NumerePare i:pare)
            i.getNumar();

        System.out.println("");
        System.out.println("");

        System.out.println("Lista numerelor impare: ");
        for(NumereImpare i:impare)
            i.getNumar();

        cin.close();
    }
}