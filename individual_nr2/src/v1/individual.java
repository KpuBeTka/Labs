package v1;

import java.util.*;
import java.io.*;

//clasa, care va sta la baza tuturor claselor-copii
class Transport{
    //crearea scanerului
	static Scanner cin = new Scanner(System.in);

	//inițializarea variabilelor
	double vitezaMaxima, capacitateaDeBagaj, kilometraj;
	int capacitateaDePasageri;
	String tipDeCombustibil;

	//supraîncărcarea constructorului
	Transport(){

	}

	Transport(double vitezaMaxima){
		this.vitezaMaxima = vitezaMaxima;
	}

	Transport(double vitezaMaxima, double capacitateaDeBagaj){
		this.vitezaMaxima = vitezaMaxima;
		this.capacitateaDeBagaj = capacitateaDeBagaj;
	}

	Transport(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj){
		this.vitezaMaxima = vitezaMaxima;
		this.capacitateaDeBagaj = capacitateaDeBagaj;
		this.kilometraj = kilometraj;
	}

	Transport(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri) {
		this.vitezaMaxima = vitezaMaxima;
		this.capacitateaDeBagaj = capacitateaDeBagaj;
		this.kilometraj = kilometraj;
		this.capacitateaDePasageri = capacitateaDePasageri;
	}

	Transport(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil){
		this.vitezaMaxima = vitezaMaxima;
		this.capacitateaDeBagaj = capacitateaDeBagaj;
		this.kilometraj = kilometraj;
		this.capacitateaDePasageri = capacitateaDePasageri;
		this.tipDeCombustibil = tipDeCombustibil;
	}

    //funcțiile pentru atribuirea variabilelor
	void setVitezaMaxima(){
		System.out.println("Viteza maxima a transportului? ");

		try{
			vitezaMaxima = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Inscrieti datele corect.");
		}
	}

	void setCapacitateaDeBagaj(){
		System.out.println("Capacitatea de bagaj?: ");

		try{
			capacitateaDeBagaj = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Inscrieti datele corect.");
		}
	}

	void setKilometraj(){
		System.out.println("Kilometrajul? ");

		try{
			capacitateaDeBagaj = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Inscrieti datele corect.");
		}
	}

	void setTipDeCombustibil(){
		System.out.println("Tipul de combustibil: ");

		try{
			tipDeCombustibil = cin.next();
		} catch(InputMismatchException ex) {
			System.out.println("Inscrieti datele corect.");
		}
	}

	void setCapacitateaDePasageri(){
		System.out.println("Capactiatea de pasageri: ");

		try{
			capacitateaDeBagaj = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("Inscrieti datele corect.");
		}
	}

    //funcțiile pentru opținerea variabilelor
	double getVitezaMaxima(){
		return vitezaMaxima;
	}

	double getCapacitateaDeBagaj(){
		return capacitateaDeBagaj;
	}

	double getKilometraj(){
		return kilometraj;
	}

	String getTipDeCombustibil(){
		return tipDeCombustibil;
	}

	int getCapacitateaDePasageri(){
		return capacitateaDePasageri;
	}
}

//clasa cu transport acvatic de suprafață (corăbii)
class TransportAcvaticDeSuprafata extends Transport{
    //inițializarea variabilelor. Scannerul nu este inițializat, pentru că el deja este în clasa-părinte
	int nrDePunti;

	//supraîncărcarea constructorului
	TransportAcvaticDeSuprafata(){

	}

	TransportAcvaticDeSuprafata(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil, int nrDePunti){
		super(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil);
		this.nrDePunti = nrDePunti;
	}

	//funcțiile pentru atribuirea variabilelor
	void setNrDePunti(){
		System.out.println("Numarul de punti? ");

		try{
			nrDePunti = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}
	}

	//funcțiile pentru obținerea variabilelor
	int getNrDePunti(){
		return nrDePunti;
	}
}

//clasa cu transport acvatic de adâncime (submarine)
class TransportAcvaticDeAdancime extends TransportAcvaticDeSuprafata{
    //inițializarea variabilelor
	double volumulDeOxigen, adancimeaMaxima;

	//supraîncărcarea constructorului
	TransportAcvaticDeAdancime(){

	}

	TransportAcvaticDeAdancime(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil, int nrDePunti, double volumulDeOxigen, double adancimeaMaxima) {
		super(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil, nrDePunti);
		this.volumulDeOxigen = volumulDeOxigen;
		this.adancimeaMaxima = adancimeaMaxima;
	}

	//funcțiile pentru setarea variabilelor
	void setVolumulDeOxigen(){
		System.out.println("Volumul de oxigen: ");

		try{
			volumulDeOxigen = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}
	}

	void setAdancimeaMaxima(){
		System.out.println("Adancimea maxima: ");

		try{
			adancimeaMaxima = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Introduecti datele corect.");
		}
	}

    //funcțiile pentru obținerea variabilelor
	double getVolumulDeOxigen(){
		return volumulDeOxigen;
	}

	double getAdancimeaMaxima(){
		return adancimeaMaxima;
	}
}

//clasa cu transport terestru (mașini, trenuri, etc.)
class TransportTerestru extends Transport{
    //inițializarea variabilelor
	int nrDeRoti;

	//supraîncărcarea constructorului
	TransportTerestru(){

	}

	TransportTerestru(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil, int nrDeRoti){
		super(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil);
		this.nrDeRoti = nrDeRoti;
	}

	//funcția pentru setarea variabilelor
	void setNrDeRoti(){
		System.out.println("Numarul de roti? ");

		try{
			nrDeRoti = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect");
		}
	}

	//funcția pentru obținerea variabilelor
	int getNrDeRoti(){
		return nrDeRoti;
	}
}

//clasa cu transport feroviar
class Tren extends TransportTerestru{
    //inițializarea variabilelor
	int nrDeVagoane;

	//supraîncărcarea constructorului
	Tren(){

	}

	Tren(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil, int nrDeRoti, int nrDeVagoane){
		super(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil, nrDeRoti);
		this.nrDeVagoane = nrDeVagoane;
	}

	//funcția pentru setarea varibilelor
	void setNrDeVagoane() {
		System.out.println("Numarul de vagoane? ");

		try {
			nrDeVagoane = cin.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("Introduceti date corect.");
		}
	}

	//funcția pentru obținerea variabilelor
	int getNrDeVagoane() {
		return nrDeVagoane;
	}
}

//clasa, ce conține datele despre cursele corăbiilor
class Cursa extends TransportAcvaticDeSuprafata{
    //inițializarea variabilei, ce conține lista de orase a cursei
	ArrayList<String> orase;

	//supraîncărcarea constructorului
	Cursa(){

	}

	Cursa(double vitezaMaxima, double capacitateaDeBagaj, double kilometraj, int capacitateaDePasageri, String tipDeCombustibil, int nrDePunti, ArrayList<String> orase) {
		super(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil, nrDePunti);
		this.orase = orase;
	}

	//funcția pentru setarea orașelor
	void setOrase(){
		System.out.print("Numarul de orase care vor fi vizitate? ");
		int nrDeOrase = cin.nextInt();

		for(int i = 0; i < nrDeOrase; i++){
			System.out.println("Orasul: ");
			orase.add(cin.nextLine());
		}
	}

	//funcția pentru obținerea orașelor
	void afisazaOrase(){
		for(String i : orase){
			System.out.println(i);
		}
	}
}

//clasa, ce conține datele despre pasageri
class Pasageri{
    //inițializarea scannerului, clasa nu are părinți, care îl au inițializat
	Scanner cin = new Scanner(System.in);

	//inițializarea variabilelor, care conțin datele despre pasageri
	String numelePrenumele;
	double volumulDeBagaj;
	int nivelulDeConfort, varsta;

	//supraîncărcarea constructorului
	Pasageri(){

	}

	Pasageri(String numelePrenume, double volumulDeBagaj, int nivelulDeConfort, int varsta){
		this.numelePrenumele = numelePrenume;
		this.volumulDeBagaj = volumulDeBagaj;
		this.nivelulDeConfort = nivelulDeConfort;
		this.varsta = varsta;
	}

	//funțiile pentru setarea varibilelor
	void setNumelePrenumele(){
		System.out.print("Numele si Prenumele: ");

		try{
			numelePrenumele = cin.nextLine();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}
	}

	void setVolumulDeBagaj(){
		System.out.print("Volumul de bagaj (kg): ");

		try{
			volumulDeBagaj = cin.nextDouble();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}
	}

	void setNivelulDeConfort(){
		System.out.print("Nivelul de confort (0 ca cel mai important): ");

		try{
			nivelulDeConfort = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}

		if(nivelulDeConfort < 0 || nivelulDeConfort > 4){
			System.out.println("Nivelul de confort poate fi numai in diapazonul 0-4, inclusiv. Introduceti nivelul inca o data.");
			setNivelulDeConfort();
		}
	}

	void setVarsta(){
		System.out.print("Varsta: ");

		try{
			varsta = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("Introduceti datele corect.");
		}
	}

	//funcțiile pentru obținerea variablilelor
	String getNumelePrenumele(){
		return numelePrenumele;
	}

	double getVolumulDeBagaj(){
		return volumulDeBagaj;
	}

	int getNivelulDeConfort(){
		return nivelulDeConfort;
	}

	int getVarsta(){
		return varsta;
	}

	void getAll(){
		System.out.println(numelePrenumele + " " + volumulDeBagaj + " " + nivelulDeConfort + " " + varsta);
	}
}

//clasa care va îmbina clasele despre curse și pasageri
class CursePasageri extends Cursa{

    //includerea clasei cu pasageri în clasa cu curse
	class CursePasageri2 extends Pasageri{

	}
}

//clasa main, în care se vor efectua exercițiile
class Main extends CursePasageri{
    //lista, ce conține cursele corăbiilor
	static ArrayList<Cursa> curse = new ArrayList<Cursa>();
	//lista, ce conține pasagerii
	static ArrayList<Pasageri> pasageri = new ArrayList<Pasageri>();

	//funcția, ce citește cursele din fișierul cu curse și le adaugă în listă
	static void getCurse() throws IOException{
	    //inițializarea scannerului pentru citire
		Scanner filescan = new Scanner(new FileReader("E:\\Admin\\Java\\individual_nr2\\src\\v1\\Curse.txt"));

		ArrayList<String> orase = new ArrayList<>();

		//citirea curselor
		while(filescan.hasNext()){
			//citirea liniei cu curse
			String allData = filescan.nextLine();
			//împărțirea liniei acolo, unde sunt virgule, și încsrierea datelor într-un tablou
			String[] arrayOfStrings = allData.split(", ");

			//transcrierea datelor din tablou în variabile aparte
			double vitezaMaxima = Double.parseDouble(arrayOfStrings[0]);
			double capacitateaDeBagaj = Double.parseDouble(arrayOfStrings[1]);
			double kilometraj = Double.parseDouble(arrayOfStrings[2]);
			int capacitateaDePasageri = Integer.parseInt(arrayOfStrings[3]);
			String tipDeCombustibil = arrayOfStrings[4];
			int nrDePunti = Integer.parseInt(arrayOfStrings[5]);

			//transcrierea listei de orașe într-un tablou
			for(int i = 6; i < arrayOfStrings.length; i++){
				orase.add(arrayOfStrings[i]);
			}

			//înscrierea datelor despre cursă în ArrayList-ul cu curse
			curse.add(new Cursa(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil, nrDePunti, orase));
		}

		for(Cursa i: curse){
			System.out.print(i.vitezaMaxima + " hm/h, " + i.capacitateaDeBagaj + " kg, " + i.kilometraj + " km, " + i.capacitateaDePasageri + " de oameni, " + i.tipDeCombustibil + ", "+ i.nrDePunti + " punti");
			for(String j: orase){
				System.out.print(", " + j);
			}
		}

		System.out.println(".\n");

		meniu();
	}

	//funcția, ce crează o cursă nouă și o adaugă în fișier și în ArrayList
	static void creareaUneiCurseNoi() throws IOException, InputMismatchException{
	    //citirea datelor despre cursă
		System.out.print("Viteza maxima a corabiei: ");
		double vitezaMaxima = cin.nextDouble();

		System.out.print("Capacitatea de bagaj: ");
		double capacitateaDeBagaj = cin.nextDouble();

		System.out.print("Kilometrajul cursei: ");
		double kilometraj = cin.nextDouble();

		System.out.print("Capacitatea de pasageri: ");
		int capacitateaDePasageri = cin.nextInt();

		System.out.print("Tip de combustibil folosit: ");
		String tipDeCombustibil = cin.next();

		System.out.print("Numarul de punti: ");
		int nrDePunti = cin.nextInt();

		cin.nextLine();
		System.out.print("Orasele, care vor fi vizitate (delimitati prin virgula + spatiu. Exepmlu: Chisinau, Balti): ");
		String oraseString = cin.nextLine();

		//împărțierea orașelor și înscrierea lor într-un tablou
		String[] oraseArray = oraseString.split(", ");
		//inițializarea ArrayList-ului cu orașe
		ArrayList<String> orase = new ArrayList<>(Arrays.asList(oraseArray));

		//inițializarea FileWrite-ului, care va înscrierea datelor în fișier
		BufferedWriter fw = new BufferedWriter(new FileWriter("E:\\Admin\\Java\\individual_nr2\\src\\v1\\Curse.txt", true));

		//înscrierea tuturor datelor, în afară de orașe în fișier
		fw.write("\n" + vitezaMaxima + ", " + capacitateaDeBagaj + ", " + kilometraj + ", " + capacitateaDePasageri + ", " + tipDeCombustibil + ", " + nrDePunti);

		//înscrierea orașelor în fișier
		for(String i: orase){
			fw.write(", " + i);
		}

		//înscrierea datelor și în ArrayList-ul cu curse
		curse.add(new Cursa(vitezaMaxima, capacitateaDeBagaj, kilometraj, capacitateaDePasageri, tipDeCombustibil, nrDePunti, orase));

		fw.close();

		meniu();
	}

	//funția, ce citește pasagerii din fișierul cu pasageri și le adaugă în listă
	static void getPasageri() throws IOException{
	    //inițializarea scannerului, ce va citi datele din fișier
		Scanner filescan = new Scanner(new FileReader("E:\\Admin\\Java\\individual_nr2\\src\\v1\\Pasageri.txt"));

		//citirea pasagerilor
		while(filescan.hasNext()){
			//citirea liniei cu pasager
			String allData = filescan.nextLine();
			//împărțirea liniei acolo, unde sunt virgule, și încsrierea datelor într-un tablou
			String[] arrayOfStrings = allData.split(", ");

			//transcrierea datelor din tablou în variabile aparte
			String numePrenume = arrayOfStrings[0];
			double volumulDeBagaj = Double.parseDouble(arrayOfStrings[1]);
			int nivelulDeConfort = Integer.parseInt(arrayOfStrings[2]);
			int varsta = Integer.parseInt(arrayOfStrings[3]);

			//înscrierea datelor despre pasageri în ArrayList-ul cu pasageri
			pasageri.add(new Pasageri(numePrenume, volumulDeBagaj, nivelulDeConfort, varsta));
		}

		for(Pasageri i: pasageri){
			System.out.println(i.numelePrenumele + ", " + i.volumulDeBagaj + " kg, nivelul de confort: " + i.nivelulDeConfort + ", " + i.varsta + " de ani.");
		}

		System.out.println("");

		filescan.close();

		meniu();
	}

	//funcța, ce adaugă un pasager nou în fișier și ArrayList-ul cu pasageri
	static void adaugareaUnuiPasager() throws IOException, InputMismatchException{
	    //citirea datelor despre pasager
		cin.nextLine();
		System.out.print("Numele si prenumele: ");
		String numelePrenumele = cin.nextLine();

		System.out.print("Cantitatea de bagaj: ");
		double cantitateaDeBagaj = cin.nextDouble();

		System.out.print("Nivelul de confort (de la 0 la 4, inclusiv. 0 ca cel mai important): ");
		int nivelulDeConfort = cin.nextInt();

		//verificarea dacă nivelul de confort este corect
		if(nivelulDeConfort < 0 || nivelulDeConfort > 4){
			System.out.println("Nivelul este cuprin intre 0 si 4, inclusiv. 0 ca cel mai important. Itroduceti-l inca o data: ");

			try{
				nivelulDeConfort = cin.nextInt();
			} catch(InputMismatchException ex){
				System.out.println("Introduceti datele corect.");
			}
		}

		System.out.print("Varsta: ");
		int varsta = cin.nextInt();

		//inițializarea scannerului
		FileWriter fileWriter = new FileWriter("E:\\Admin\\Java\\individual_nr2\\src\\v1\\Pasageri.txt", true);

		BufferedWriter fw = new BufferedWriter(new FileWriter("E:\\Admin\\Java\\individual_nr2\\src\\v1\\Pasageri.txt", true));

		//înscrierea datelor în fișierul cu pasageri
		fw.write("\n" + numelePrenumele + ", " + cantitateaDeBagaj + ", " + nivelulDeConfort + ", " + varsta);

		fw.close();

		meniu();
	}

	//funcția, ce calculează cantitatea totală de bagaj a tuturor pasagerilor
	static void cantitateaTotalaDeBagaj() throws IOException{
	    //inițializarea variabilei, conține cantiatea totală de bagaj
		double cantitateaTotalaDeBagaj = 0;

		//parcurgerea listei cu pasageri și incrementarea cantității bagajului, cantitatea de bagaj a pasagerului, la care s-a ajuns
		for(Pasageri i: pasageri){
			cantitateaTotalaDeBagaj += i.getVolumulDeBagaj();
		}

		//afișarea cantității totale de bagaj găsite
		System.out.println("Cantitatea totala de bagaj este egala cu " + cantitateaTotalaDeBagaj);

		meniu();
	}

	//funția, ce afișează toți pasagerii dintr-un diapazon de vârstă anumită
	static void afisareDiapazonVarsta() throws IOException, InputMismatchException{
	    //citirea primului număr din diapazon
		System.out.print("Varsta 1: ");
		int varsta1 = cin.nextInt();

		//citirea celui de al doilea număr din diapazon
		System.out.print("Varsta 2: ");
		int varsta2 = cin.nextInt();

		//parcurgerea listei
		for(Pasageri i: pasageri){
		    //găsirea și afișarea persoanelor din diapazonul ales
			if((i.varsta < varsta1 && i.varsta > varsta2) || (i.varsta > varsta1 && i.varsta < varsta2)){
				i.getAll();
			}
			//afișarea erorii, dacă vârstele sunt egale
			else if(varsta1 == varsta2){
				System.out.println("Varstele trebuie sa fie diferita.");
			}
		}

		meniu();
	}

	//funția meniului
	static void meniu() throws IOException{
	    //afișarea meniului
		System.out.println("-======================= MENIU =======================-");
		System.out.println("1. Afisarea tuturor curselor;");
		System.out.println("2. Crearea unei noi curse;");
		System.out.println("3. Afisarea pasagerilor;");
		System.out.println("4. Adaugarea unui pasager nou;");
		System.out.println("5. Afisarea cantitatii totale de bagaj;");
		System.out.println("6. Afisarea pasagerilor dintr-un diapazon de varsta;");
		System.out.println("-=====================================================-");
		System.out.print("Punctul dorit: ");

		//inițializarea variabilei, ce va conține numărul din meniul ales
		int punctDinMeniu = 0;

		//citirea punctului din meniu
		try{
			punctDinMeniu = cin.nextInt();
		} catch(InputMismatchException ex){
			System.out.println("\nNumarul ales trebuie sa fie unul intreg, cuprins intre 1 si 4, inclusiv.\n");
		}

		//aplicarea funțiilor, în dependență de punctul din meniu ales
		switch(punctDinMeniu) {
			case 1:
				getCurse();
			case 2:
				creareaUneiCurseNoi();
			case 3:
				getPasageri();
			case 4:
				adaugareaUnuiPasager();
			case 5:
				cantitateaTotalaDeBagaj();
			case 6:
				afisareDiapazonVarsta();
			default:
				System.out.println("Numarul trebuie sa fie egal cu unul din meniu.");
				meniu();
		}
	}

	//funcția main și funcția meniului
	public static void main(String [] args) throws  IOException{
		meniu();
		cin.close();
	}
}