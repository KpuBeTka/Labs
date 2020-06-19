package laborator5;

import java.util.*;
import java.io.*; 

class Pacienti{
    int cnp;
    String nume, diagnoza, salon, medic;

    Pacienti(){
    }

    Pacienti(int cnp, String nume, String diagnoza, String salon, String medic){
        this.cnp = cnp;
        this.nume = nume;
        this.diagnoza = diagnoza;
        this.salon = salon;
        this.medic = medic;
    }

    void getLista(){
        System.out.println("=========================");
        System.out.println("CNP: " + cnp);
        System.out.println("Numele: " + nume);
        System.out.println("Diagnoza: " + diagnoza);
        System.out.println("Salonul: " + salon);
        System.out.println("Medicul: " + medic);
        System.out.println("=========================");
    }

    String getSalon(){
        return salon;
    }

    String getDiagnoza(){
        return diagnoza;
    }

    int getCNP(){
        return cnp;
    }
}

class MainPacienti{
    static ArrayList<Pacienti> pacienti = new ArrayList<Pacienti>();
    static Scanner cin = new Scanner(System.in);

    static void citireConsole() throws IOException{
        FileWriter fw = new FileWriter("laborator5\\pacienti.txt");

        try{
            System.out.print("Numarul de pacienti? ");
            int nrPacineti = cin.nextInt();

            for(int i = 0; i < nrPacineti; i++){
                System.out.println("<<< Pacientul nr. " + (i+1) + " >>>");

                System.out.print("CNP: ");
                int cnp = cin.nextInt();

                System.out.print("Numele: ");
                String nume = cin.next();

                System.out.print("Diagnoza: ");
                String diagnoza = cin.next();

                System.out.print("Salonul: ");
                String salon = cin.next();

                System.out.print("Medicul: ");
                String medic = cin.next();

                System.out.println("====================");

                fw.write(cnp + " " + nume + " " + diagnoza + " " + salon + " " + medic + "\n");
                
            }
        }catch(InputMismatchException ex1){
           System.out.println("Introduceti datele corect");
        }

        fw.close();
    }

    static void citireFisier(){
        try{
			Scanner filescan = new Scanner(new FileReader("laborator5\\pacienti.txt"));

			System.out.println("<<< Lista pacientilor >>>");

			try{
				while(filescan.hasNext()){
					int cnp = Integer.parseInt(filescan.next());
					String nume = filescan.next();
					String diagnoza = filescan.next();
					String salon = filescan.next();
					String medic = filescan.next();

					pacienti.add(new Pacienti(cnp, nume, diagnoza, salon, medic));
				}
			}catch(InputMismatchException ex){
				System.out.println("Datele nu sunt introduse corect");
			}
		
			filescan.close();
		}catch(IOException ex){
			System.out.println("Nu s-a gasit fisierul");
		}
    }

    static void afisarePacienti(){
        for(Pacienti i: pacienti)
            i.getLista();
    }

    static void afisareSalon(){
        System.out.println("<<< Pacienti dintr-un salon anumit >>>");

        try{
            System.out.print("Salonul: ");
            String salon = cin.next();

            
            boolean suntPacienti = false;

            for(Pacienti i: pacienti)
                if(i.getSalon().equals(salon)){
                    suntPacienti = true;
                }

            if(suntPacienti){
                for(Pacienti i: pacienti)
                    if(i.getSalon().equals(salon))
                        i.getLista();
            }else
                System.out.println("Nu s-au gasit pacienti din salonul " + salon + ".");
        }catch(InputMismatchException ex){
            System.out.println("Introduceti datele corect.");
        }
    }

    static void afisareDiagnoza(){
        System.out.println("<<< Pacienti cu o diagnoza anumita >>>");

        try{
            System.out.print("Diagnoza: ");
            String diagnoza = cin.next();

            
            boolean suntPacienti = false;

            for(Pacienti i: pacienti)
                if(i.getDiagnoza().equals(diagnoza)){
                    suntPacienti = true;
                }

            if(suntPacienti){
                for(Pacienti i: pacienti)
                    if(i.getDiagnoza().equals(diagnoza))
                        i.getLista();
            }else
                System.out.println("Nu s-au gasit pacienti cu diagnoza " + diagnoza + ".");
        }catch(InputMismatchException ex){
            System.out.println("Introduceti datele corect.");
        }
    }

    static void afisareCNP(){
        System.out.println("<<< Pacienti cu un CNP anumit >>>");

        try{
            System.out.print("CNP-ul: ");
            int cnp = cin.nextInt();

            
            boolean suntPacienti = false;

            for(Pacienti i: pacienti)
                if(i.getCNP() == cnp){
                    suntPacienti = true;
                }

            if(suntPacienti){
                for(Pacienti i: pacienti)
                    if(i.getCNP() == cnp)
                        i.getLista();
            }else
                System.out.println("Nu s-au gasit pacienti cu CNP-ul " + cnp + ".");
        }catch(InputMismatchException ex){
            System.out.println("Introduceti datele corect.");
        }
    }

    public static void main(String[] args) throws IOException{
        citireConsole();

        citireFisier();

        afisarePacienti();

        afisareSalon();
        
        afisareDiagnoza();

        afisareCNP();
    } 
}