package laborator3;

class Masina{
    double kilometrajPlecare, kilometrajSosire, litri;

    Masina(double kmStart, double kmStop, double litri){
        kilometrajPlecare = kmStart;
        kilometrajSosire = kmStop;
        this.litri = litri;
    }

    double consum(){
        return (kilometrajSosire - kilometrajPlecare) / litri;
    }

    public static void main(String[] args){
        Masina m1 = new Masina(100000, 100263, 23);

        System.out.println(m1.consum());
    }
}