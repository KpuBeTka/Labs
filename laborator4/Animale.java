package laborator4;
import java.util.ArrayList;
import java.util.Scanner;

class Animale{
    private String denumire, culoare;
    private int nrPicioare, anNastere;
    private boolean areAripi;

    Animale(){
    };

    Animale(String denumire, String culoare, int nrPicioare, int anNastere, boolean areAripi){
        this.denumire = denumire;
        this.culoare = culoare;
        this.nrPicioare = nrPicioare;
        this.anNastere = anNastere;
        this.areAripi = areAripi;
    }

    String getDenumire(){
        return denumire;
    }

    String getCuloare(){
        return culoare;
    }

    int getNrPicioare(){
        return nrPicioare;
    }

    int getAnNastere(){
        return anNastere;
    }

    boolean getAreAripi(){
        return areAripi;
    }

    void getData(){
        System.out.println("============================");
        System.out.println("Denumirea: " + denumire + ";");
        System.out.println("Culoarea: " + culoare + ";");
        System.out.println("Numarul de piciare: " + nrPicioare + ";");
        System.out.println("Anul nasterii: " + anNastere + ";");
        if(areAripi)
            System.out.println("Are aripi;");
        else
            System.out.println("Nu are aripi;");
    }
}

class mainAnimale{
    static int nrCuloareGri(ArrayList<Animale> a){
        int nrGri = 0;

        for(Animale i:a)
            if(i.getCuloare().equals("gri"))
                nrGri++;

        return nrGri;
    }

    static void listaCailor(ArrayList<Animale> a){
        for(Animale i:a)
            if(i.getDenumire().equals("cal"))
                i.getData();
    }

    static void listaDouaPicioare(ArrayList<Animale> a){
        for(Animale i:a)
            if(i.getNrPicioare() == 2)
                i.getData();
    }

    static void listaAripi(ArrayList<Animale> a){
        for(Animale i:a)
            if(i.getAreAripi())
                i.getData();
    }
    public static void main(String[ ] args){
        Scanner cin = new Scanner(System.in);

        int n = 0;
        System.out.print("Numarul de animale in lista? ");
        n = cin.nextInt();

        ArrayList <Animale> animale = new ArrayList<Animale>();

        for(int i = 0; i < n; i++){
            System.out.println("============================");

            System.out.print("Denumirea: ");
            String denumire = cin.next();

            System.out.print("Culoarea: ");
            String culoare = cin.next();

            System.out.print("Numarul de picioare: ");
            int nrPicioare = cin.nextInt();

            System.out.print("Anul nasterii: ");
            int anNastere = cin.nextInt();

            System.out.print("Are aripi(true/false): ");
            boolean areAripi = cin.nextBoolean();

            animale.add(new Animale(denumire, culoare, nrPicioare, anNastere, areAripi));
        }

        System.out.println("");
        System.out.println("");

        System.out.println("=========================================");
        System.out.println("");
        System.out.println("");

        System.out.println("<<< Animalele >>>");
        for(Animale i:animale){
            i.getData();
        }

        System.out.println("");
        System.out.println("<<< Numarul de animale de culoare gri >>>");
        System.out.println("============================");
        System.out.println("Sunt " + nrCuloareGri(animale) + " animale de culoarea gri");

        System.out.println("");
        System.out.println("<<< Lista cailor >>>");
        listaCailor(animale);

        System.out.println("");
        System.out.println("<<< Lista animalelor cu 2 picioare >>>");
        listaDouaPicioare(animale);

        System.out.println("");
        System.out.println("<<< Lista animalelor cu aripi >>>");
        listaAripi(animale);

        cin.close();
    }
}