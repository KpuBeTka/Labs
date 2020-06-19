package victor;

import java.io.*;
import java.util.*;

public class Microunde {
	String model, producator, culoare, taraOrigine, administrare;
	int puterea, garantie;
	double pret, greutatea;
	boolean areTimer, areIluminare;

	Microunde(){
	}

	Microunde(String model, String producator, String culoare, String taraOrigine, String administrare, int puterea, int garantie, double pret, double greutatea, boolean areTimer, boolean areIluminare){
		this.model = model;
		this.producator = producator;
		this.culoare = culoare;
		this.taraOrigine = taraOrigine;
		this.administrare = administrare;
		this.puterea = puterea;
		this.greutatea = greutatea;
		this.garantie = garantie;
		this.pret = pret;
		this.areTimer = areTimer;
		this.areIluminare = areIluminare;
	}

	//metoda va afisa toate atributele obiectului
	void getData(){
		System.out.println("Model: "+model+" , "+"Producator: "+producator+" , "+"Puterea: "+puterea+" , "+"Timer: "+areTimer+" , "+"Iluminare: "+areIluminare+" , "+"Culoarea: "+culoare+" , "+"Pret: "+pret+" , "+"Greutatea: "+greutatea+" , "+"Tara de Origine: "+taraOrigine+" , "+"Garatia: "+garantie+" , "+"Tipul de administrare: "+administrare);
	}
}

//un clas nou, in care se vor testa si se vor efectua functiile
class TestMicrounde{
	//un array dinamic si global, care poate fi utilizat de toate functiile de mai jos
	static ArrayList<Microunde> microunde = new ArrayList<Microunde>();
	//un scanner global, care poate fi utilizat de toate functiile de mai jos
	static Scanner cin = new Scanner(System.in);

	//Crearea unei noi inregistrari
	static void aprtNou() throws IOException{
		try {
			System.out.println("Ce numar de microunde doriti sa introduceti?: ");
			int n = cin.nextInt();

			for(int i=0;i<n;i++) {
				System.out.print("Introduceti modelul microundei ("+(i+1)+") : ");
				String model = cin.next();

				System.out.print("Introduceti numele producatorului ("+(i+1)+") : ");
				String producator = cin.next();

				System.out.print("Introduceti puterea microundei care va fi calculata in W ("+(i+1)+") : ");
				int puterea = cin.nextInt();

				System.out.print("Introduceti daca are timer sau nu (false , true) ("+(i+1)+") : ");
				boolean areTimer = cin.nextBoolean();

				System.out.print("Introduceti daca are iluminare sau nu (false , true) ("+(i+1)+") : ");
				boolean areIluminare = cin.nextBoolean();

				System.out.print("Introduceti culoarea microundei ("+(i+1)+") : ");
				String culoarea = cin.next();

				System.out.print("Introduceti pretul microundei ("+(i+1)+") : ");
				double pret = cin.nextDouble();

				System.out.print("Introduceti greutatea ("+(i+1)+") : ");
				double greutatea = cin.nextDouble();

				System.out.print("Introduceti tara de origine ("+(i+1)+") : ");
				String taraOrigine = cin.next();

				System.out.print("Introduceti garantia in luni ("+(i+1)+") : ");
				int garantie = cin.nextInt();

				System.out.print("Introduceti tipul de administrare(electronica sau mecanica) ("+(i+1)+") : ");
				String administrare = cin.next();

				System.out.println("=============================================================================================");
				
				//inscrierea datelor de mai sus in ArrayList-ul global de mai sus
				microunde.add(new Microunde(model, producator, culoarea, taraOrigine, administrare, puterea, garantie, pret, greutatea, areTimer, areIluminare)); //ADAUGAREA INREGISTRARII NOI IN VECTORUL CREAT
			}

			FileWriter fw = new FileWriter("victor\\Microunde.txt", true); //Scrierea in fisier fara a sterge datele anterioare

			for(Microunde e : microunde) {
				fw.write(e.model+" "+e.producator+" "+e.puterea+" "+e.areTimer+" "+e.areIluminare+" "+e.culoare+" "+e.pret+" "+e.greutatea+" "+e.taraOrigine+" "+e.garantie+" "+e.garantie+" "+e.administrare);
			}
			fw.close();
		}
		catch(InputMismatchException e){
				System.out.println("EROARE: "+e+" "+"(Tipul de date inregistrate nu este introdus conrect)");
				System.exit(0);
			}
	}

	static void citireFisier() {
		try {
			Scanner filescan = new Scanner(new FileReader("victor\\Microunde.txt"));

			while(filescan.hasNext()) {
				String model = filescan.next();
				String producator = filescan.next();
				String culoare = filescan.next();
				String taraOrigine = filescan.next();
				String administrare = filescan.next();
				int puterea = filescan.nextInt();
				int garantie = filescan.nextInt();
				double pret = filescan.nextDouble();
				double greutatea = filescan.nextDouble();
				boolean areTimer = filescan.nextBoolean();
				boolean areIluminare = filescan.nextBoolean();

				//inscrierea in ArrayList-ul global
				microunde.add(new Microunde(model, producator, culoare, taraOrigine, administrare, puterea, garantie, pret, greutatea, areTimer, areIluminare));
			}
			filescan.close();
		}
		catch (FileNotFoundException e) {
			System.out.println("Eroare! "+e+" "+"(!Fisierul nu a fost gasit!)");
			System.exit(0);
		}
	}

	//Afisarea tuturor microundelor inregistrare
	static void afisareFisier() {
		System.out.println("==================================   Microunde existente   ==================================");

		//parcurgerea ArrayList-ului global
		for(Microunde i : microunde)
			//afisarea atributelor obiectelor cu ajutorul metodei noi
			i.getData();
	}

	static void celMaiIeftinProdus(){
		//definirea variabile, care va contine pretul cel mai mic
		double pretMinim = 100000;

		//parcurgerea ArrayList-ului
		for(Microunde i: microunde)
			//daca pretul unui obiect este mai mic ca valoarea variabilei, ce contine pretul minim, acea variabila va prelua valoarea pretului obiectului
			if(i.pret < pretMinim)
				pretMinim = i.pret;
		
		System.out.println("\nMicrounda cu cel mai mic pret: \n");

		//parcurgerea ArrayList-ului
		for(Microunde i: microunde)
			//gasirea obiectului cu acel pret minim si afisarea atributelor lui
			if(i.pret == pretMinim)
				i.getData();
	}

	static void cuptoareDintroTara(){
		//citirea tarii microundei
		System.out.println("\nTara dorita: ");
		String tara = cin.next();

		//parcurgerea ArrayList-ului
		for(Microunde i: microunde){
			//daca tara din care este microunda este egala cu tara aleasa, se va afisa obiectul(atribuetele lui)
			//s-a folosit metoda "equals", pentru ca stringurile uneori se compara prin cur
			if(i.taraOrigine.equals(tara))
				i.getData();
			
			System.out.println("");
		}
			
	}

	public static void main(String[] args){
		citireFisier();

		afisareFisier();

		celMaiIeftinProdus();

		cuptoareDintroTara();
	}
}

