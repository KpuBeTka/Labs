package laborator4;
import java.util.Scanner;
import java.util.ArrayList;

class Student{
    String nume, grupa;
    int an;
    double notaSem1, notaSem2;

    Student(){
    }

    Student(String nume, String grupa, int an, double notaSem1, double notaSem2){
        this.nume = nume;
        this.grupa = grupa;
        this.an = an;
        this.notaSem1 = notaSem1;
        this.notaSem2 = notaSem2;
    }

    double mediaNote(){
        return (notaSem1 + notaSem2)/2;
    }

    void getData(){
        System.out.println(nume + ", " + grupa + ", anul " + an + ", nota in semestrul 1: " + notaSem1 + ", nota in semestrul 2: " + notaSem2);
    }
}

class mainStudent{
    static double mediaMaxima(ArrayList<Student> s){
        double max = 0;
        for(Student i:s)
            if(i.mediaNote() > max)
                max = i.mediaNote();

        return max;
    }

    public static void main(String[] args){
        ArrayList<Student> student = new ArrayList<Student>();
        Scanner cin = new Scanner(System.in);

        System.out.print("Cati studenti vor fi in lista? ");
        int n = cin.nextInt();

        System.out.println("====================");

        for(int i = 0; i < n; i++){
            System.out.println("Persoana nr. " + (i+1) + ": ");

            System.out.print("Nume: ");
            String nume = cin.next();

            System.out.print("Grupa: ");
            String grupa = cin.next();

            System.out.print("Anul: ");
            int an = cin.nextInt();

            System.out.print("Nota medie pe semestrul 1: ");
            double notaSem1 = cin.nextDouble();

            System.out.print("Nota medie pe semestrul 2: ");
            double notaSem2 = cin.nextDouble();

            student.add(new Student(nume, grupa, an, notaSem1, notaSem2));
            cin.nextLine();
        }

        System.out.println("<<< Lista Studentilor >>>");

        for(Student i:student)
            i.getData();

        System.out.println("");

        System.out.println("Cea mai mare medie este " + mediaMaxima(student));

        cin.close();
    }
}