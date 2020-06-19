package laborator3;

class Automobil{
    String denumire, compProducatoare, culoare, tipAutomobil;
    int nrPasageri, anProducere, nrUsi, volRezervor, viteza, pret;
    char cutieDeViteza;
    boolean aerConditionat;

    Automobil(String denumire){
        this.denumire = denumire;
    }

    Automobil(String denumire, String compProducatoare){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
    }

    Automobil(String denumire, String compProducatoare, String culoare){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi, int volRezervor){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
        this.volRezervor = volRezervor;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi, int volRezervor, int viteza){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
        this.volRezervor = volRezervor;
        this.viteza = viteza;
    }
    
    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi, int volRezervor, int viteza, int pret){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
        this.volRezervor = volRezervor;
        this.viteza = viteza;
        this.pret = pret;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi, int volRezervor, int viteza, int pret, char cutieDeViteza){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
        this.volRezervor = volRezervor;
        this.viteza = viteza;
        this.pret = pret;
        this.cutieDeViteza = cutieDeViteza;
    }

    Automobil(String denumire, String compProducatoare, String culoare, String tipAutomobil, int nrPasageri, int anProducere, int nrUsi, int volRezervor, int viteza, int pret, char cutieDeViteza, boolean aerConditionat){
        this.denumire = denumire;
        this.compProducatoare = compProducatoare;
        this.culoare = culoare;
        this.tipAutomobil = tipAutomobil;
        this.nrPasageri = nrPasageri;
        this.anProducere = anProducere;
        this.nrUsi = nrUsi;
        this.volRezervor = volRezervor;
        this.viteza = viteza;
        this.pret = pret;
        this.cutieDeViteza = cutieDeViteza;
        this.aerConditionat = aerConditionat;
    }

    public static void main(String[] args){
        Automobil a1 = new Automobil("Mustang");
        Automobil a2 = new Automobil("Camaro", "Chevrolet");
        Automobil a3 = new Automobil("Charger", "Dodge", "rosu");
        Automobil a4 = new Automobil("Viper", "Dodge", "galben", "muscle car");
        Automobil a5 = new Automobil("Roadster", "Tesla", "visiniu", "roadster", 2);
        Automobil a6 = new Automobil("Model X", "Tesla", "alb", "crossover", 5, 2015);
        Automobil a7 = new Automobil("Chiron", "Bugatti", "albastru", "hyper car", 2, 2018, 2);
        Automobil a8 = new Automobil("Prius", "Toyota", "alb", "family", 5, 2014, 4, 30);
        Automobil a9 = new Automobil("Agera RS", "Kenyggsegg", "negru", "hyper car", 2, 2014, 2, 200, 400);
        Automobil a10 = new Automobil("Roadster 2.0", "Tesla", "visiniu", "hyper car", 2, 2020, 2, 0, 300, 200000);
        Automobil a11 = new Automobil("GTR", "Nissan", "alb", "coupe", 5, 2010, 4, 150, 300, 250000, 'm');
        Automobil a12 = new Automobil("Veneno", "Lamborgini", "gri", "hyper car", 2, 2015, 2, 150, 400, 2000000, 'a', true);

        System.out.println("a1: " + a1.denumire + " " + a1.compProducatoare + " " + a1.culoare + " " + a1.tipAutomobil + " "
                           + a1.nrPasageri + " " + a1.anProducere + " " + a1.nrUsi + " " + a1.volRezervor + " "
                           + a1. viteza + " " + a1.pret + " " + a1.cutieDeViteza + " " + a1.aerConditionat);

        System.out.println("a2: " + a2.denumire + " " + a2.compProducatoare + " " + a2.culoare + " " + a2.tipAutomobil + " "
                           + a2.nrPasageri + " " + a2.anProducere + " " + a2.nrUsi + " " + a2.volRezervor + " "
                           + a2. viteza + " " + a2.pret + " " + a2.cutieDeViteza + " " + a2.aerConditionat);

        System.out.println("a3: " + a3.denumire + " " + a3.compProducatoare + " " + a3.culoare + " " + a3.tipAutomobil + " "
                           + a3.nrPasageri + " " + a3.anProducere + " " + a3.nrUsi + " " + a3.volRezervor + " "
                           + a3. viteza + " " + a3.pret + " " + a3.cutieDeViteza + " " + a3.aerConditionat);  

        System.out.println("a4: " + a4.denumire + " " + a4.compProducatoare + " " + a4.culoare + " " + a3.tipAutomobil + " "
                           + a4.nrPasageri + " " + a4.anProducere + " " + a4.nrUsi + " " + a4.volRezervor + " "
                           + a4. viteza + " " + a4.pret + " " + a4.cutieDeViteza + " " + a4.aerConditionat);
        
        System.out.println("a5: " + a5.denumire + " " + a5.compProducatoare + " " + a5.culoare + " " + a3.tipAutomobil + " "
                           + a5.nrPasageri + " " + a5.anProducere + " " + a5.nrUsi + " " + a5.volRezervor + " "
                           + a5. viteza + " " + a5.pret + " " + a4.cutieDeViteza + " " + a5.aerConditionat);

        System.out.println("a6: " + a6.denumire + " " + a6.compProducatoare + " " + a6.culoare + " " + a3.tipAutomobil + " "
                           + a6.nrPasageri + " " + a6.anProducere + " " + a6.nrUsi + " " + a6.volRezervor + " "
                           + a6. viteza + " " + a6.pret + " " + a6.cutieDeViteza + " " + a6.aerConditionat);

        System.out.println("a7: " + a7.denumire + " " + a7.compProducatoare + " " + a7.culoare + " " + a3.tipAutomobil + " "
                           + a7.nrPasageri + " " + a7.anProducere + " " + a7.nrUsi + " " + a7.volRezervor + " "
                           + a7. viteza + " " + a7.pret + " " + a7.cutieDeViteza + " " + a7.aerConditionat);

        System.out.println("a8: " + a8.denumire + " " + a8.compProducatoare + " " + a8.culoare + " " + a3.tipAutomobil + " "
                           + a8.nrPasageri + " " + a8.anProducere + " " + a8.nrUsi + " " + a8.volRezervor + " "
                           + a8. viteza + " " + a8.pret + " " + a4.cutieDeViteza + " " + a8.aerConditionat);

        System.out.println("a9: " + a9.denumire + " " + a9.compProducatoare + " " + a9.culoare + " " + a3.tipAutomobil + " "
                           + a9.nrPasageri + " " + a9.anProducere + " " + a9.nrUsi + " " + a9.volRezervor + " "
                           + a9. viteza + " " + a9.pret + " " + a9.cutieDeViteza + " " + a9.aerConditionat);

        System.out.println("a10: " + a10.denumire + " " + a10.compProducatoare + " " + a10.culoare + " " + a3.tipAutomobil + " "
                           + a10.nrPasageri + " " + a10.anProducere + " " + a10.nrUsi + " " + a10.volRezervor + " "
                           + a10. viteza + " " + a10.pret + " " + a10.cutieDeViteza + " " + a10.aerConditionat);

        System.out.println("a11: " + a11.denumire + " " + a11.compProducatoare + " " + a11.culoare + " " + a3.tipAutomobil + " "
                           + a11.nrPasageri + " " + a11.anProducere + " " + a11.nrUsi + " " + a11.volRezervor + " "
                           + a11. viteza + " " + a11.pret + " " + a11.cutieDeViteza + " " + a11.aerConditionat);

        System.out.println("a12: " + a12.denumire + " " + a12.compProducatoare + " " + a12.culoare + " " + a3.tipAutomobil + " "
                           + a12.nrPasageri + " " + a12.anProducere + " " + a12.nrUsi + " " + a12.volRezervor + " "
                           + a12. viteza + " " + a12.pret + " " + a12.cutieDeViteza + " " + a12.aerConditionat);
    }
}