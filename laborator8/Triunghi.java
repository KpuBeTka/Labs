package laborator8;

interface Figura{
	public static final double PI = 3.14;
	public double arie(int ... laturi);
	public double perimetru(int ... laturi);
}

class Triunghi {
	double a, b, c;
	
	Triunghi(double a, double b, double c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	boolean poateFiConstruit(int ... laturi) {
		if(((laturi[0] + laturi[1]) <= laturi[2] || (laturi[0]+laturi[2]) <= laturi[1] || (laturi[1]+laturi[2]) <= laturi[0]) || laturi[0] <= 0 && b <= 0 && laturi[2] <= 0)
			return false;
		else 
			return true;
	}
	
	void tip(int ... laturi) {
		if(poateFiConstruit())
			if(laturi[0] == laturi[1] && laturi[1] == laturi[2] && laturi[2] == laturi[0])
				System.out.println("Triunghiul este echilateral");
			else if(Math.pow(laturi[0], 2) + Math.pow(laturi[1], 2) == Math.pow(laturi[2], 2) || Math.pow(laturi[0], 2) + Math.pow(laturi[2], 2) == Math.pow(laturi[1], 2) || Math.pow(laturi[1], 2) + Math.pow(laturi[2], 2) == Math.pow(laturi[0], 2))
				System.out.println("Triunghiul este dreptunghic");
			else if(laturi[0] != laturi[1] && laturi[1] != laturi[2] && laturi[2] != laturi[0])
				System.out.println("Triunghiul este scalen");
			else
				System.out.println("Triunghiul este isoscel");
		else
			System.out.println("Triunghiul nu poate fi construit");
		}
	
	double perimetru(int ... laturi){
		return laturi[0] + laturi[1] + laturi[2];
	}

	double semiperimetru(int ... laturi) {
		return perimetru()/2;
	}
	
	double arie(int ... laturi) {
		if(poateFiConstruit())
			return semiperimetru() * (semiperimetru() - a) * (semiperimetru() - b) * (semiperimetru() - c);
		else
			return 0;
	}
}

class Dreptunghi implements Figura{
	double l, L;
	
}

class TestTriunghi{
	public static void main(String[] args) {
		Triunghi t1 = new Triunghi(1, 2, 3);
		Triunghi t2 = new Triunghi(3, 4, 5);
		Triunghi t3 = new Triunghi(7.3, 4, 1);
		
		t1.tip();
		System.out.println("Aria triunghiului = " + t1.arie() + "\n");
		
		t2.tip();
		System.out.println("Aria triunghiului = " + t2.arie() + "\n");
		
		t3.tip();
		System.out.println("Aria triunghiului = " + t3.arie() + "\n");
	}
}
