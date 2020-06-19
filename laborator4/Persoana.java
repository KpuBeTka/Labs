package laborator4;
import java.util.ArrayList;
import java.util.Scanner;

class Persoana{
    private String nume, prenume;
    private int virsta;

    Persoana(){
    }
    
    Persoana(String nume, String prenume, int virsta){
        this.nume = nume;
        this.prenume = prenume;
        this.virsta = virsta;
    }

    public String getNume(){
        return nume;
    }
    public String getPrenume(){
        return prenume;
    }
    public int getVirsta(){
        return virsta;
    }
    public void detalii(){
        System.out.println(nume + " " +prenume + " " + virsta);
    }
}

class mainPersoana{
    static int nr_minori = 0;
    static int nr_majori = 0;

    static int nrMinori(ArrayList<Persoana> p){
    for (Persoana i:p)
        if(i.getVirsta() < 18)
            nr_minori++;
    
    return nr_minori;
    }

    static int nrMajori(ArrayList<Persoana> p){
        for(Persoana i:p)
            if(i.getVirsta() >= 18)
                nr_majori++;

    return nr_majori;
    }

    public static void main(String [] args) {
        Scanner cin = new Scanner(System.in);

        System.out.println("Cate persoane are lista? ");
        
        int n = cin.nextInt();
    
        ArrayList <Persoana> persoane = new ArrayList<Persoana>();

            for (int i=0;i<n;i++) {
                System.out.println("Introduceti datele persoanei >>> "+(i+1));

                System.out.print("Nume: ");
                String nume = cin.next();

                System.out.print("Prenume: ");
                String prenume = cin.next();

                System.out.print("Varsta: ");
                int virsta = cin.nextInt();

                persoane.add(new Persoana(nume, prenume, virsta));
                cin.nextLine();
            }
        cin.close();

        System.out.println();
        System.out.println("<<< Persoanele din lista >>>");

        for (Persoana i:persoane)
            i.detalii();

        System.out.println("=============================================");
        int minori = nrMinori(persoane);
        System.out.println("Minori sunt " + minori + " persoane.");

        System.out.println("=============================================");
        int majori = nrMajori(persoane);
        System.out.println("Majori sunt " + majori + " persoane.");

        System.out.println("=============================================");
        if(minori > majori)
            System.out.println("Mai multi sunt minorii.");
        else if (majori > minori)
            System.out.println("Mai multi sunt majorii.");
        else if (majori == minori)
            System.out.println("Numarul de minori este egal cu numarul de majori.");
        System.out.println("=============================================");
    }
}