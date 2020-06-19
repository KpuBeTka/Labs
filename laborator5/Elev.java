/*
Braga Petru P-1811 0 10
Busuioc Ciprian P-1722 5 9.5
Ceban Marian P-1633 10 9
Ceban Tudor P-1541 15 8.5
Ceban Vasile P-1431 20 8
Chihai Cristian P-1821 25 7.5
Chiper Andreea P-1987 30 7
Ciobanu Stanislav R-1245 35 6.5
*/

package laborator5;

import java.io.*;
import java.util.*;

class Elevi{
	String nume, prenume, grupa;
	int nrAbsente;
	double mediaGenerala;
	
	Elevi(){
	}
	
	Elevi(String nume, String prenume, String grupa, int nrAbsente, double mediaGenerala){
		this.nume = nume;
		this.prenume = prenume;
		this.grupa = grupa;
		this.nrAbsente = nrAbsente;
		this.mediaGenerala = mediaGenerala;
	}

	String getGrupa(){
		return grupa;
	}

	double getMedia(){
		return mediaGenerala;
	}

	int getAbsente(){
		return nrAbsente;
	}

	void getDataElevi(){
		System.out.println("====================");
		System.out.println("Numele: " + nume);
		System.out.println("Prenumele: " + prenume);
		System.out.println("Grupa: " +  grupa);
		System.out.println("Numarul de absente: " + nrAbsente);
		System.out.println("Media generala: " + mediaGenerala);
		System.out.println("====================");
	}
}

class Test_Elev{
	static ArrayList<Elevi> elevi = new ArrayList<Elevi>();
	static Scanner cin = new Scanner(System.in);

	static void citireConsole() throws IOException{
		try{
			System.out.print("Numarul de elevi? ");
			int nrElevi = cin.nextInt();

			for(int i = 0; i < nrElevi; i++){
				System.out.println("<<< Elevul nr. " + (i+1) + " >>>");

				System.out.print("Numele: ");
				String nume = cin.next();

				System.out.print("Prenumele: ");
				String prenume = cin.next();

				System.out.print("Grupa: ");
				String grupa = cin.next();

				System.out.print("Numarul de absente: ");
				int nrAbsente = cin.nextInt();

				System.out.print("Media generala: ");
				double mediaGenerala = cin.nextDouble();

				System.out.println("====================");

				elevi.add(new Elevi(nume, prenume, grupa, nrAbsente, mediaGenerala));
			}
		}catch( InputMismatchException ex1){
			System.out.println("Introduceti datele corect");
		}
	}

	static void inscriereFisier() throws IOException{
		FileWriter fw = new FileWriter("laborator5\\elevi.txt");

		for( Elevi i:elevi)
			fw.write(i.nume + " " + i.prenume + " " + i.grupa + " " + i.nrAbsente + " " + i.mediaGenerala + "\n");
		
		fw.close();
	}

	static void citireAfisareFisier(){
		try{
			Scanner filescan = new Scanner(new FileReader("laborator5\\elevi.txt"));

			System.out.println("<<< Lista elevilor >>>");

			try{
				while(filescan.hasNext()){
					String nume = filescan.next();
					String prenume = filescan.next();
					String grupa = filescan.next();
					int nrAbsente = Integer.parseInt(filescan.next());
					double mediaGenerala = Double.parseDouble(filescan.next());

					System.out.println(nume + " " + prenume + " " + grupa + " " + nrAbsente + " " + mediaGenerala);
					System.out.println("================");
				}
			}catch(InputMismatchException ex){
				System.out.println("Datele nu sunt introduse corect");
			}
		
			filescan.close();
		} catch(IOException ex1){
			System.out.println("Nu s-a gasit fisierul");
		}
	}

	static void elevGrupa(){
		boolean suntElevi = false;

		for(Elevi i: elevi)
			if(i.getGrupa().equals("P1431") || i.getGrupa().equals("P-1431") || i.getGrupa().equals("P 1431")){
				suntElevi = true;
			}

			if(suntElevi){
				for( Elevi i: elevi)
					if(i.getGrupa().equals("P1431") || i.getGrupa().equals("P-1431") || i.getGrupa().equals("P 1431"))
						i.getDataElevi();
			}else
				System.out.println("Nu s-au gasit elevi din grupa P-1431");
	}

	static void celMaiDesteptElev(){
		double maxMedia = 0;

		for( Elevi i: elevi)
			if(i.getMedia() > maxMedia)
				maxMedia = i.getMedia();
		
		for( Elevi i: elevi)
			if(i.getMedia() == maxMedia)
				i.getDataElevi();
	}

	static void celMaiExemplarElev(){
		int minAbsente = 120;

		for( Elevi i: elevi)
			if(i.getAbsente() < minAbsente)
				minAbsente = i.getAbsente();

		for( Elevi i: elevi)
			if(minAbsente == i.getAbsente())
				i.getDataElevi();
	}

	public static void main( String[ ] args) throws IOException{
		citireConsole();

		inscriereFisier();

		System.out.println("");

		citireAfisareFisier();

		System.out.println("");

		System.out.println("<<< Elevii din grupa P-1431 >>>");
		elevGrupa();

		System.out.println("");

		System.out.println("<<< Elevul cel mai destept >>>");
		celMaiDesteptElev();

		System.out.println("");

		System.out.println("<<< Elevul cel mai exemplar >>>");
		celMaiExemplarElev();
	
		cin.close();
	}
}