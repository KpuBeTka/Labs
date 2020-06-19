package laborator5;

import java.io.*;
import java.util.*;

class Elev{
	String nume;
	double media;
	
	Elev(String nume, double media){
		this.nume = nume;
		this.media = media;
	}
}

class Scanner_File { //metoda va scrie datele in fisier
	static void scriere(ArrayList<Elev> x) throws IOException{
		FileWriter fw = new FileWriter("out.txt"); //transferul datelor în fisier
		
		//se parcurge lista analizind fiecare element din ea
		for(Elev i :x)
			fw.write(i.nume+" "+i.media+"\r\n"); //se salveaza in fisier detaliile fiecarui obiect
		
		fw.close(); //se inchide fluxul de iesire a datelor
	}
	
	static ArrayList<Elev> citire() throws IOException { //metoda va citi datele din fisier
		ArrayList<Elev> x = new ArrayList<Elev>();
		Scanner filescan = new Scanner(new FileReader("out.txt"));
		
		//atit timp cit mai sunt urmatoare date de citit
		while (filescan.hasNext()) {
			String n = filescan.next(); //se citeste din fisier numele
		
			double m = Double.parseDouble(filescan.next()); //se citeste din fisier virsta in format String si se converteste la double
			
			x.add(new Elev(n,m)); //se crează un obiect conform detaliilor citite din fisier si se adauga in lista
		}
		
		filescan.close(); //se inchide fluxul de citire
		
		return x; // returnam vectorul citit
	}
	
	public static void main (String []args) throws IOException{
		ArrayList<Elev> x = new ArrayList<Elev>(); //se creaza lista de elevi
		
		//se adauga elemente in lista
		x.add(new Elev("Mihai", 10)); 
		x.add(new Elev("Gabriela",9));
		x.add(new Elev("Laura", 8));
		
		scriere(x);// se transmite lista in fisier
		
		ArrayList <Elev> citire = new ArrayList<Elev>();
		
		citire = citire(); //citirea listei din fisier
		
		//se parcurge lista si se afiseaza datele la ecran
		for(Elev i :citire)
			System.out.println(i.nume + " " + i.media);
	}
}