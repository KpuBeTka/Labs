package penzari_marc_individual;

//importarea bibliotecelor necesare
import java.io.*;
import java.util.*;

//initializarea clasei principale, unde se vor stoca datele despre abiturienti
public class Abiturienti{
    
    //atributele clasei Abiturienti
    int id, numarStrada, telefon;
    String nume, prenume, patronimic, strada, limbaMaterna, specialitatea;
    double notaConcurs;

    //constructorul clasei
    Abiturienti(int id, String nume, String prenume, String patronimic, String strada, int numarStrada, int telefon, String limbaMaterna, double notaConcurs, String specialitatea){
        this.id = id;
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
        this.strada = strada;
        this.numarStrada = numarStrada;
        this.telefon = telefon;
        this.limbaMaterna = limbaMaterna;
        this.notaConcurs = notaConcurs;
        this.specialitatea = specialitatea;
    }

    //metode cu un tip de return pentru a le folosi mai tarziu
    double getNota(){
        return notaConcurs;
    }

    String getSpecialitatea(){
        return specialitatea;
    }

    String getLimbaMaterna(){
        return limbaMaterna;
    }

    //metoda pentru afisarea atributelor clasei Abiturienti
    void getAllData(){
        System.out.println("ID: " + id);
        System.out.println("Numele: " + nume);
        System.out.println("Prenumele: " + prenume);
        System.out.println("Patronimicul: " + patronimic);
        System.out.println("Strada: " + strada + " " + numarStrada);
        System.out.println("Telefon: " + telefon);
        System.out.println("Limba materna: " + limbaMaterna);
        System.out.println("Nota de concurs: " + notaConcurs);
        System.out.println("Specialitatea: " + specialitatea);
    }
}

//clasa prinicipala unde si se vor efectua testele
class mainAbiturienti{

    //initializarea array-ului dinamic, unde se vor stoca obiectele
    static ArrayList<Abiturienti> abiturienti = new ArrayList<Abiturienti>();

    //initializarea scanner-ului pentru a citi datele de la tastatura
    static Scanner cin = new Scanner(System.in);

    //a fost folosit modificatorul de acces "static", pentru a le putea folosi in metode

    //metoda de citire din fisier
    static void citire() throws IOException{

        //initializarea scanner-ului pentru citire
        Scanner filescan = new Scanner(new FileReader("penzari_marc_individual\\Abiturienti.txt"));

        try{//tratarea exeptiilor

            while(filescan.hasNext()){
                String allData = filescan.nextLine(); //colectarea liniei intregi de date
                String[] arrayOfStrings = allData.split(", "); //impartirea acestei linii acolo, unde este virgula
                                                               //urmata de spatiu, si stocarea lor intr-un array
                
                //transcrierea valorilor din array-ul cu datele unei linii in variablie
                int ID = Integer.parseInt(arrayOfStrings[0]);
                String nume = arrayOfStrings[1];
                String prenume = arrayOfStrings[2];
                String patronimic = arrayOfStrings[3];
                String strada = arrayOfStrings[4];
                int numarStrada = Integer.parseInt(arrayOfStrings[5]);
                int telefon = Integer.parseInt(arrayOfStrings[6]);
                String limbaMaterna = arrayOfStrings[7];
                double notaConcurs = Double.parseDouble(arrayOfStrings[8]);
                String specialitatea = arrayOfStrings[9];

                //adaugarea variabilelor in ArrayList-ul "abiturienti", folosind variabilele de mai sus
                abiturienti.add(new Abiturienti(ID, nume, prenume, patronimic, strada, numarStrada, telefon, limbaMaterna, notaConcurs, specialitatea));
            }

        }catch(InputMismatchException ex){
            System.out.println("Datele nu sunt introduse corect.");
        }

        filescan.close(); //inchiderea scanner-ului
    }

    //metoda de inscriere a unei linii noi
    static void inscriere() throws IOException{
        System.out.println("<<< Inscrierea unei persoane noi >>>");

        try{
            //colectarea datelor
            System.out.println("Introduceti datele persoanei:");
            
            System.out.print("ID: ");
            int ID = Integer.parseInt(cin.nextLine());

            System.out.print("Numele: ");
            String nume = cin.nextLine();

            System.out.print("Prenumele: ");
            String prenume = cin.nextLine();

            System.out.print("Patronimicul: ");
            String patronimic = cin.nextLine();

            System.out.print("Strada: ");
            String strada = cin.nextLine();

            System.out.print("Blocul: ");
            int numarStrada = Integer.parseInt(cin.nextLine());;

            System.out.print("Telefon: ");
            int telefon = Integer.parseInt(cin.nextLine());;

            System.out.print("Limba materna: ");
            String limbaMaterna = cin.nextLine();

            System.out.print("Nota de concurs: ");
            double notaConcurs = Double.parseDouble(cin.nextLine());

            if(!(notaConcurs > 1 && notaConcurs <= 10)){
                System.out.println("Nota poate fi mai mare ca 1 si mai mica ca 10");

                System.out.print("Introduceti nota de concurs inca o data: ");
                notaConcurs = Double.parseDouble(cin.nextLine());
            }

            System.out.print("Specialitatea: ");
            String specialitatea = cin.nextLine();

            //deschiderea fisierului, pentru a nu sterge datele precedente, s-a folosit "true"
            FileWriter fw = new FileWriter("penzari_marc_individual\\Abiturienti.txt", true);

            //inscrierea datelor
            fw.write("\n" + Integer.toString(ID) + ", " + nume + ", " + prenume + ", " + patronimic + ", " + strada + ", " + Integer.toString(numarStrada) + ", " + Integer.toString(telefon) + ", " + limbaMaterna + ", " + Double.toString(notaConcurs) + ", " + specialitatea);

            //adaugarea acestei noi linii in ArrayList-ul "abiturienti"
            abiturienti.add(new Abiturienti(ID, nume, prenume, patronimic, strada, numarStrada, telefon, limbaMaterna, notaConcurs, specialitatea));
            
            fw.close(); //inchiderea fisierului
        }catch(NumberFormatException ex){
            System.out.println("Introduceti datele corect.");
        }
            
    }

    //metoda pentru afisarea listei de abiturienti
    static void afisareAll(){
        System.out.println("");

        //verificarea daca sunt abiturienti in lista
        if(abiturienti.size() != 0){
            System.out.println("<<< Lista tuturor abiturientilor >>>");

            //afisarea listei
            for(Abiturienti i: abiturienti){
                i.getAllData();
                System.out.println("========================");
            }
        } else 
            System.out.println("Nu sunt abiturienti. ");
    }

    //metoda pentru afisarea abiturientilor cu nota de concurs mai mica ca 7
    static void afisare7(){
        System.out.println("");
        System.out.println("<<< Lista abiturientilor cu nota mai mica de cat 7 >>>");
    
        boolean suntAbiturienti = false; //variabila va lua valori in dependenta de faptul ca sunt sau nu abiturienti potriviti

        //parcurgerea listei si cautarea abiturientilor cu nota de concurs mai mica ca 7
        for(Abiturienti i: abiturienti)
            //daca s-au gasit, variabila va lua valoarea "true"
            if(i.getNota() < 7.0)
                suntAbiturienti = true;

        //daca s-au gasit abiturienti, se va parcurge lista
        if(suntAbiturienti){
            for(Abiturienti i: abiturienti){
                if(i.getNota() < 7.0){
                    //afisarea numai abiturientii cu nota de concurs mai mica ca 7
                    i.getAllData();
                    System.out.println("========================");
                }
            }
        } else
            System.out.println("Nu s-au gasit abiturienti cu nota de concurs mai mica de cat 7");
    }

    //metoda pentru afisarea studentilor in dependeta de specialitatea aleasa
    static void afisareSpecialitate(){
        System.out.println("");
        System.out.println("<<< Lista abiturientilor cu specialitatea dorita >>>");

        //colectarea denumirii specialitatii
        System.out.print("Alegeti o specialitate: ");
        String specialitate = cin.nextLine();

        boolean suntAbiturienti = false; //variabila va lua valori in dependenta de faptul ca sunt sau nu abiturienti potriviti

        //parcurgerea listei pentru identificarea daca sunt studenti potriviti cu specialitatea aleasa
        for(Abiturienti i: abiturienti)
            if(i.getSpecialitatea().equals(specialitate))
                suntAbiturienti = true; 

        //parcurgerea listei daca sunt studenti portriviti
        if(suntAbiturienti){
            System.out.println("<<< Lista abiturientilor cu specialitatea \"" + specialitate + "\" >>>");

            for(Abiturienti i: abiturienti){
                if(i.getSpecialitatea().equals(specialitate)){
                    //afisarea studentilor numai cu specialitatea aleasa
                    i.getAllData();
                    System.out.println("========================");
                }
            }
        } else 
        System.out.println("Nu s-au gasit abiturienti cu specialitatea \"" + specialitate + "\".");
    }

    //metoda pentru afisarea studentilor cu nota de concurs mai mare ca 9
    static void afisare9(){
        System.out.println("");

        boolean suntAbiturienti = false;//variabila va lua valori in dependenta de faptul ca sunt sau nu abiturienti potriviti

        //parcurgerea listei pentru identificarea daca sunt studenti potriviti cu specialitatea aleasa
        for(Abiturienti i: abiturienti)
            if(i.getNota() > 9.0)
                suntAbiturienti = true;

        System.out.println("<<< Lista abiturientilor cu nota mai mare de cat 9 >>>");

        //daca sunt abiturienti, se va parcurge lista
        if(suntAbiturienti){
            for(Abiturienti i: abiturienti){
                if(i.getNota() > 9.0){
                    //afisarea numai studentilor, cu nota de concurs mai mare ca 9
                    i.getAllData();
                    System.out.println("========================");
                }
            }
        } else
            System.out.println("Nu s-au gasit abiturienti cu nota mai mare c 9");
    }

    //metoda de afisare a studentilor cu o nota de concurs anumita
    static void afisareNota(){
        System.out.println("");
        System.out.println("<<< Lista abiturientilor care au o nota de concurs anumita >>>");

        //colectarea notei de comparatie
        System.out.print("Nota doria? ");
        double nota = cin.nextDouble();

        if(!(nota > 1 && nota <= 10)){
            System.out.println("Nota poate fi mai mare ca 1 si mai mica ca 10");

            System.out.print("Introduceti nota de concurs inca o data: ");
            nota = cin.nextDouble();
        }

        boolean suntAbiturienti = false;//variabila va lua valori in dependenta de faptul ca sunt sau nu abiturienti potriviti

        //parcurgerea listei pentru identificarea daca sunt studenti potriviti cu specialitatea aleasa
        for(Abiturienti i: abiturienti)
            if(nota == i.getNota())
                suntAbiturienti = true;         
        
        //daca sunt abiturienti potriviti, se va parcurge lista
        if(suntAbiturienti){
            for(Abiturienti i: abiturienti){
                if(i.getNota() == nota){
                    //afisarea studentilor numai nu nota de concurs portivita 
                    i.getAllData();
                    System.out.println("========================");
                }
            }
        } else 
            System.out.println("Nu s-au gasit abiturienti cu nota de concurs " + nota + ".");

        cin.close();
    }

    //metoda care afiseaza abiturientii cu specialitatea "informatica" si limba materna "romana"
    static void afisareInfoMaterna(){
        boolean suntAbiturienti = false;//variabila va lua valori in dependenta de faptul ca sunt sau nu abiturienti potriviti

        //parcurgerea listei pentru identificarea daca sunt studenti potriviti cu specialitatea aleasa
        for(Abiturienti i: abiturienti)
            if(i.getSpecialitatea().equals("informatica") && i.getLimbaMaterna().equals("romana"))
                suntAbiturienti = true;         
        
        System.out.println("<<< Lista tuturor abiturientilor cu specialitatea informatica si limba materna romana >>>");

        //se va parcurge lista daca sunt abiturienti potriviti
        if(suntAbiturienti){
            for(Abiturienti i: abiturienti){
                if(i.getSpecialitatea().equals("informatica") && i.getLimbaMaterna().equals("romana")){
                    //afisarea abiturientilor ce se potrivesc conditiilor
                    System.out.println("========================");
                    i.getAllData();
                }
            }
        } else 
            System.out.println("Nu sunt abiturienti cu specialitatea informatica si limba materna romana");
    }

    public static void main(String[] args) throws IOException, InterruptedException {
        //folosirea si testarea metodelor
        citire();

        inscriere();

        afisareAll();

        afisare7();

        afisareSpecialitate();

        afisare9();

        afisareNota();
    
        afisareInfoMaterna();

        cin.close();//inchiderea scanner-ului de citire de la tastatura
    }  
}