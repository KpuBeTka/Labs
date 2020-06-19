import java.util.ArrayList;
import java.util.Scanner;

public class Cursa{
    int cursaID;
    String punctDeDestinatie, punctDePornire;

    Cursa(){
    }

    Cursa(String punctDeDestinatie, String punctDePornire, int cursaID){
        this.punctDeDestinatie = punctDeDestinatie;
        this.punctDePornire = punctDePornire;
        this.cursaID = cursaID;
    }

    void atribute(){
        System.out.println("Punctul de destinație: " + punctDeDestinatie + ";\nPunctul de pornire: " + punctDePornire + ";\nID-ul punctului: " + cursaID + ".\n");
    }
}

class Calatorie extends Cursa{
    double durataDeCalatorie;
    String denumireaCalatoriei;
    int numarulDePasageri;

    Calatorie(String punctDeDestinatie, String punctDePornire, int cursaID, double durataDeCalatoriei, String denumireaCalatoriei, int numarulDePasageri){
        super(punctDeDestinatie, punctDePornire, cursaID);
        this.durataDeCalatorie = durataDeCalatoriei;
        this.denumireaCalatoriei = denumireaCalatoriei;
        this.numarulDePasageri = numarulDePasageri;
    }

    void atribute(){
        super.atribute();
        System.out.println("Durata de calătorie: " + durataDeCalatorie + ";\nDenumirea călătoriei: " + denumireaCalatoriei + ";\nNumărul de pasageri: " + numarulDePasageri);
    }
}

class TestCalatorie{
    static Scanner in = new Scanner(System.in);

    static ArrayList<Calatorie> calatorie = new ArrayList<>();

    void diapazonDePasageri(int a, int b){
        if(a < b)
            for(Calatorie i: calatorie){
                if(i.numarulDePasageri > a && i.numarulDePasageri < b)
                    i.atribute();
            }
        else if(a > b)
            for(Calatorie i: calatorie){
                if(i.numarulDePasageri < a && i.numarulDePasageri > b)
                    i.atribute();
            }
        else
            System.out.println("Numerele sunt egale.");
    }



    public static void main(String[] args){
        System.out.print("Punctul de pornire: ");
        String punctulDePornire = in.nextLine();

        System.out.print("Punctul de destinație: ");
        String punctulDeDestinate = in.nextLine();

        System.out.print("ID-ul cursei: ");
        int cursaID = in.nextInt();

        System.out.print("Durata de călătorie: ");
        double durataDeCalatorie = in.nextDouble();

        System.out.print("Denumirea călătoriei: ");
        String denumireaCalatoriei = in.nextLine();

        System.out.print("Numărul de pasageri: ");
        int numarulDePasageri = in.nextInt();

        calatorie.add(new Calatorie(punctulDePornire, punctulDeDestinate, cursaID, durataDeCalatorie, denumireaCalatoriei, numarulDePasageri));
    }
}