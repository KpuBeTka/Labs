package laborator8;

interface Poligon {
	void getAria(int ... laturi);
}

class Dreptunghi implements Poligon {
	public void getAria(int ... laturi) {
		if (laturi.length==2)
			System.out.println("Aria dreptunghiului este " + (laturi[0] * laturi[1]));
	}
}

class Patrat implements Poligon {
	public void getAria(int ... laturi) {
		if (laturi.length==1) System.out.println("Aria patratului este " +
				(Math.pow(laturi[0], 2)));
	}
}

class Triunghi2 implements Poligon{
	public void getAria(int ...laturi){
		if(laturi.length == 3) {
			double p = (laturi[0] + laturi[1] + laturi[2])/2;
			System.out.println("Aria triunghiului este " + ( p*(p-laturi[0]) * (p-laturi[1]) * (p-laturi[2]) ) );
		}	
			
	}
}

class Main {
	public static void main(String[] args) {
		Dreptunghi r1 = new Dreptunghi ();
		r1.getAria(5, 6);
		Patrat p1 = new Patrat();
		p1.getAria(5);
		Triunghi2 t1 = new Triunghi2();
		t1.getAria(3, 4, 5);
	}
}

