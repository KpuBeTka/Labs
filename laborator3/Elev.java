package laborator3;

class Elev{
    String nume, prenume, patronimic;  
    int varsta, nrAbsente;
    char gen;
    double notaMedie;

    Elev(String nume, String prenume, String patronimic, int varsta, char gen, int nrAbsente, double notaMedie){
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
        this.varsta = varsta;
        this.gen = gen;
        this.nrAbsente = nrAbsente;
        this.notaMedie = notaMedie;
    }
    Elev(String nume, String prenume, String patronimic, int varsta, char gen, int nrAbsente){
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
        this.varsta = varsta;
        this.gen = gen;
        this.nrAbsente = nrAbsente;
    }
    Elev(String nume, String prenume, String patronimic, int varsta, char gen){
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
        this.varsta = varsta;
        this.gen = gen;
    }
    Elev(String nume, String prenume, String patronimic, int varsta){
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
        this.varsta = varsta;
    }
    Elev(String nume, String prenume, String patronimic){
        this.nume = nume;
        this.prenume = prenume;
        this.patronimic = patronimic;
    }
    Elev(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }
    Elev(String nume){
        this.nume = nume;
    }

    void purtare(){
        if(nrAbsente > 30)
            System.out.println("Purtarea este satisfacatoare.");
        else if(nrAbsente > 20 && nrAbsente <= 30)
                System.out.println("Purtarea este buna.");
        else if(nrAbsente > 8 && nrAbsente <= 20)
                System.out.println("Purtarea este foarte buna.");
        else
            System.out.println("Purtarea este excelenta.");
    }

    double bursa(){
        if(notaMedie < 5)
            return 0;
        else if(notaMedie >= 5 && notaMedie < 7)
            return 100;
        else if(notaMedie >= 7 && notaMedie < 8)
            return 20 * notaMedie;
        else if(notaMedie >= 8 && notaMedie < 10)
            return 25 * notaMedie;
        else
            return 300;
    }

    void test(){
        System.out.println(nume + " " + prenume + ": ");

        purtare();

        System.out.println("Bursa = " + bursa() + " lei.");

        System.out.println("=======================");
    }

    public static void main(String[] args){
        Elev e1 = new Elev("Braga", "Petru", "Petru", 17, 'm', 0, 4.5);
        Elev e2 = new Elev("Busuioc", "Ciprian", "Dumitru", 17, 'm', 5, 5);
        Elev e3 = new Elev("Ceban", "Marian", "Lilian", 17, 'm', 10, 5.5);
        Elev e4 = new Elev("Ceban", "Tudor", "Dumirtru", 17, 'm', 15, 6);
        Elev e5 = new Elev("Ceban", "Vasile", "Vitale", 17, 'm', 20, 6.5);
        Elev e6 = new Elev("Chihai", "Cristian", "Dan", 17, 'm', 25, 7);
        Elev e7 = new Elev("Chiper", "Andrea", "Victor", 17, 'f', 30, 7.5);
        Elev e8 = new Elev("Ciobanu", "Stanislav", "Emilian", 17, 'm', 25, 8);
        Elev e9 = new Elev("Cocotchin", "Maxim", "Adrian", 17, 'm', 20, 9);
        Elev e10 = new Elev("Cosman", "Stanislav", "Marc", 17, 'm', 15, 10);

        System.out.println("=======================");

        e1.test();
        e2.test();
        e3.test();
        e4.test();
        e5.test();
        e6.test();
        e7.test();
        e8.test();
        e9.test();
        e10.test();
    }
}