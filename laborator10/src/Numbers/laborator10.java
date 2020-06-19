package Numbers;

import java.util.ArrayList;

abstract class Poligon {

    void afisare(){
        System.out.println("Clasa Poligon.");
    }

    abstract void detalii();

    abstract double perimetru();

}

class Patrat extends Poligon{

    double latura;

    Patrat(double latura){
        this.latura = latura;
    }

    void afisare(){
        System.out.println("Clasa Patrat.");
    }

    @Override
    void detalii() {
        System.out.println("Pătratul este un poligon cu patru laturi egale și toate unghiurile egale cu 90 de grade.");
    }

    @Override
    double perimetru() {
        return 4*latura;
    }


}

class Dreptunghi extends Poligon{

    double latura1, latura2;

    Dreptunghi(double latura1, double latura2){
        this.latura1 = latura1;
        this.latura2 = latura2;
    }

    void afisare(){
        System.out.println("Clasa Dreptunghi.");
    }

    @Override
    void detalii() {
        System.out.println("Dreptunghiul este un poligon, care are 2 perechi de laturi egale și totate unghiurile egale cu 90 de grade.");
    }

    @Override
    double perimetru() {
        return 2*latura1 + 2*latura1;
    }
}

class Cerc extends Poligon{

    double raza;

    Cerc(double raza){
        this.raza = raza;
    }

    void afisare(){
        System.out.println("Clasa Cerc.");
    }

    @Override
    void detalii() {
        System.out.println("Cercul este o mulțime de puncte, egal depărtate de centru cu o anumită valoare, numită rază.");
    }

    @Override
    double perimetru() {
        return 2*3.14*raza;
    }
}

class TestPoligon{

    static ArrayList<Poligon> poligons = new ArrayList<>();

    public static void main(String[] args){
        Patrat patrat = new Patrat(5);
        Dreptunghi dreptunghi = new Dreptunghi(5, 7);
        Cerc cerc = new Cerc(3);

        patrat.afisare();
        patrat.detalii();
        System.out.println("Perimetrul pătratului este " + patrat.perimetru() + " de cm.");
        System.out.println("============================================================\n");

        dreptunghi.afisare();
        dreptunghi.detalii();
        System.out.println("Perimetrul dreptunghiului este " + dreptunghi.perimetru() + " de cm.");
        System.out.println("============================================================\n");

        cerc.afisare();
        cerc.detalii();
        System.out.println("Perimentrul cercului este " + cerc.perimetru() + " de cm.");
        System.out.println("============================================================\n");

        System.out.println("\n-===< LISTA >===-\n");

        poligons.add(new Patrat(10));
        poligons.add(new Dreptunghi(6, 10));
        poligons.add(new Cerc (7));

        for(Poligon p: poligons){
            p.afisare();
            p.detalii();
            System.out.println("Perimetrul poligonului este " + p.perimetru() + " de cm.");
            System.out.println("============================================================\n");
        }
    }

}