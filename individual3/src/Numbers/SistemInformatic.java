package Numbers;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemInformatic extends DatePersoana {

    static ArrayList<DatePersoana> datePersoane = new ArrayList<>();
    static Scanner in = new Scanner(System.in);
    static String file = "E:\\Admin\\Java\\individual3\\src\\files\\data.txt";

    static void showDate() throws IOException{

        getDate();

        System.out.println("\n===============================< LISTA DE PERSOANE >================================");

        for(DatePersoana i: datePersoane)
            System.out.println(i.getNume() + " " + i.getPrenume() + ", 0" + i.getTelefon());

        if(datePersoane.isEmpty()){
            System.out.println("Lista de persoane este goală.");
        }

        System.out.println("====================================================================================\n");

        meniu();
    }

    static void getDate() throws IOException {

        try{
            datePersoane.clear();

            Scanner filescan = new Scanner(new BufferedReader(new FileReader(file)));

            while(filescan.hasNextLine()){
                String[] line = filescan.nextLine().split(", ");

                datePersoane.add(new DatePersoana(line[0], line[1], Integer.parseInt(line[2])));
            }

            filescan.close();
        } catch (FileNotFoundException ex1){
            System.out.println("\nFișierul nu există.\n");
            meniu();
        } catch (NumberFormatException ex2){
            System.out.println("\nNumăr incorect în fișier.\n");
            meniu();
        }

    }

    static void setDate() throws IOException {

        try{
            getDate();

            System.out.println("\n=========================< INTRODUCEREA UNEI PERSOANE NOI >=========================");

            System.out.print("Numele: ");
            in.nextLine();
            String numele = in.nextLine();

            System.out.print("Prenumele: ");
            String prenumele = in.nextLine();

            System.out.print("Telefonul: ");
            int telefonul = in.nextInt();

            datePersoane.add(new DatePersoana(numele, prenumele, telefonul));

            FileWriter fw = new FileWriter(file);

            for(DatePersoana i: datePersoane){
                fw.write(i.getNume() + ", " + i.getPrenume() + ", 0" + i.getTelefon() + "\n");
            }

            fw.close();

            System.out.println("Persoana a fost adăugată în fișier.");

            System.out.println("====================================================================================\n");

            meniu();
        } catch (InputMismatchException ex1){
            System.out.println("\nDatele nu au fost introduse corect.\n");
            meniu();
        } catch (FileNotFoundException ex2){
            System.out.println("\nFișierul nu există.\n");
            meniu();
        }

    }

    static void deleteDate() throws IOException {
        System.out.println("\n=======================< ȘTERGEREA UNEI PERSOANE DIN LISTĂ >========================");

        getDate();

        int iterator = 1;
        System.out.println("Lista de persoane:");
        for(DatePersoana i: datePersoane){
            System.out.println(iterator++ + ". " + i.getNume() + " " + i.getPrenume() + ", 0" + i.getTelefon());
        }

        System.out.print("\nNumărul rândului, care va fi șters: ");
        int nr = in.nextInt();

        datePersoane.remove(nr-1);

        BufferedWriter fw = new BufferedWriter(new FileWriter(file));

        for(DatePersoana i: datePersoane){
            fw.write(i.getNume() + ", " + i.getPrenume() + ", 0" + i.getTelefon() + "\n");
        }

        fw.close();

        System.out.println("Persoana a fost ștearsă.");

        System.out.println("====================================================================================\n");

        meniu();
    }

    static void meniu() throws IOException {
        System.out.println("=====================================< MENIUL >=====================================");
        System.out.println("|  0. Terminarea programului.                                                      |");
        System.out.println("|  1. Afișarea listei de persoane.                                                 |");
        System.out.println("|  2. Adăugare în fișier unei persoane noi                                         |");
        System.out.println("|  3. Excluderea din fișier a unei persoane.                                       |");
        System.out.println("====================================================================================");

        System.out.print("Punctul dorit: ");
        int punctulAles = 0;
        try{
            punctulAles = in.nextInt();
        } catch (InputMismatchException ex) {
            System.out.println("Datele nu a fost introduse corect.");
        }

        switch (punctulAles) {
            case 0:
                System.exit(0);
                break;
            case 1:
                showDate();
                break;
            case 2:
                setDate();
                break;
            case 3:
                deleteDate();
                break;
            default:
                System.out.println("Introduceți un număr de la 0 până la 3.\n");
                meniu();
                break;
        }
    }

}
