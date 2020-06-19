package laborator2;

public class Fructe{
    boolean seminte, anotimp;
    double p;

    void setProprietati(boolean seminte, boolean anotimp, double p){
        this.seminte = seminte;
        this.anotimp = anotimp;
        this.p = p;
    }

    void getProprietati(){
        if(seminte){
            System.out.print("Fructul are seminte, ");
        } else {
            System.out.print("Fructul nu are seminte, ");
        }

        if(anotimp){
            System.out.print("este sezonier ");
        } else {
            System.out.print("nu este sezonier ");
        }

        System.out.println("si are pretul egal cu " + p);
    }

    public static void main(String[] args) {
        Fructe ob1 = new Fructe();

        ob1.setProprietati(true, false, 150);

        ob1.getProprietati();
    }
}