package laborator2;
import java.util.Scanner;

public class Dog{
    Scanner cin = new Scanner(System.in);

    int varsta, inaltime, greutate;
    String nume, culoare, rasa, gen;
    boolean vaccinat;

    void setCaracteristici(){
        System.out.print("Numele: ");
        nume = cin.next();

        System.out.print("Rasa: ");
        rasa = cin.next();

        System.out.print("Culoarea: ");
        culoare = cin.next();

        System.out.print("Gen (masculin, feminin): ");
        gen = cin.next();

        System.out.print("Varsta: ");
        varsta = cin.nextInt();
        
        System.out.print("Inaltimea: ");
        inaltime = cin.nextInt();

        System.out.print("Greutatea: ");
        greutate = cin.nextInt();

        System.out.print("Este cainele vaccinat? (true/false): ");
        vaccinat = cin.nextBoolean();
    }

    void getCaracteristici(){
        System.out.print(nume + ", " + rasa + " de culoarea " + culoare +
        ". Are " + varsta + " de ani, inaltimea egala cu " + inaltime + " cm, si cantareste " + greutate + " kg." +
        " Este de gen " + gen);

        if(vaccinat){
            System.out.println(" si este vaccinat.");
        } else {
            System.out.println(", dar nu este vaccinat.");
        }
    }

    void getTalia(){
        if(inaltime > 65){
            System.out.println("Cainele are talie mare");
        } else if(inaltime > 50 && inaltime <= 65){
            System.out.println("Cainele are talie medie");
        } else if(inaltime > 35 && inaltime <= 50){
            System.out.println("Cainele are talie mica");
        } else {
            System.out.println("Cainele are talie pitica");
        }
    }

    public static void main(String[] args){
        Dog d1 = new Dog();
        /*Dog d2 = new Dog();
        Dog d3 = new Dog();
        Dog d4 = new Dog();
        Dog d5 = new Dog();
        Dog d6 = new Dog();
        Dog d7 = new Dog();
        Dog d8 = new Dog();
        Dog d9 = new Dog();
        Dog d10 = new Dog();*/

        d1.setCaracteristici();
        /*d2.setCaracteristici();
        d3.setCaracteristici();
        d4.setCaracteristici();
        d5.setCaracteristici();
        d6.setCaracteristici();
        d7.setCaracteristici();
        d8.setCaracteristici();
        d8.setCaracteristici();
        d9.setCaracteristici();
        d10.setCaracteristici();*/

        d1.getCaracteristici();
        /*d2.getCaracteristici();
        d3.getCaracteristici();
        d4.getCaracteristici();
        d5.getCaracteristici();
        d6.getCaracteristici();
        d7.getCaracteristici();
        d8.getCaracteristici();
        d9.getCaracteristici();
        d10.getCaracteristici();*/
    }
}