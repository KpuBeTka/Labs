package Numbers;

import java.util.*;

interface INumbers{

    int number = 0;

    public void setNumber(int number);
    public int getNumber();

}

class EvenNumber implements INumbers{

    private int evenNumber = 0;

    public EvenNumber(int evenNumber) {
        this.evenNumber = evenNumber;
    }

    @Override
    public void setNumber(int evenNumber) {
        this.evenNumber = evenNumber;
    }

    @Override
    public int getNumber() {
        return evenNumber;
    }

}

class OddNumber implements INumbers{

    int oddNumber = 0;

    public OddNumber(int oddNumber) {
        this.oddNumber = oddNumber;
    }

    @Override
    public void setNumber(int oddNumber) {
        this.oddNumber = oddNumber;
    }

    @Override
    public int getNumber() {
        return oddNumber;
    }

}

public class Numbers{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<EvenNumber> evenNumbers = new ArrayList<>();
        ArrayList<OddNumber> oddNumbers = new ArrayList<>();

        System.out.println("-<= Introduceți numerele după următorul exemplu (fără ghilemele): \"a b c d\" >=-");
        try{
            String [] numbers = in.nextLine().split(" ");

            for(String number : numbers) {
                int auxNumber = Integer.parseInt(number);

                if (auxNumber % 2 == 0)
                    evenNumbers.add(new EvenNumber(auxNumber));
                else
                    oddNumbers.add(new OddNumber(auxNumber));
            }

            System.out.println("-=< Numerele pare: >=-");
            for(EvenNumber number : evenNumbers)
                System.out.print(number.getNumber() + " ");

            System.out.println("\n-=< Numerele impare: >=-");
            for(OddNumber number : oddNumbers)
                System.out.print(number.getNumber() + " ");
        } catch (NumberFormatException e){
            System.out.println("Introduceți datele corect.");
        }
    }

}