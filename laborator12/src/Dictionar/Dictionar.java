package Dictionar;

import java.util.HashMap;
import java.util.Scanner;

interface Word{

    String word = null;

    String getWord();

    void setWord(String word);

}

class Word1 implements Word{

    String word = null;

    public Word1(String word) {
        this.word = word;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public void setWord(String word) {
        this.word = word;
    }
}

class Word2 implements Word{

    String word = null;

    public Word2(String word) {
        this.word = word;
    }

    @Override
    public String getWord() {
        return word;
    }

    @Override
    public void setWord(String word) {
        this.word = word;
    }

}

class Dictionar{
    static Scanner in = new Scanner(System.in);
    static HashMap<Word1, Word2> dictionar = new HashMap<>();

    static String searchWord(Word1 word){
        if(dictionar.containsKey(word))
            return dictionar.get(word).getWord();
        else
            return "Așa cuvânt nu a fost găsit.";
    }

    public static void  main(String[] args){
        dictionar.put(new Word1("ruginit"), new Word2("vechi"));
        dictionar.put(new Word1("binecuvântare"), new Word2("a fi de acord"));
        dictionar.put(new Word1("deficit"), new Word2("lipsă"));
        dictionar.put(new Word1("tandem"), new Word2("grup"));
        dictionar.put(new Word1("adițional"), new Word2("suplimentar."));
        dictionar.put(new Word1("serviciu"), new Word2("post"));

        System.out.println("-=< Dicționar de sinonime>=-");
        System.out.print("Cuvântul dorit: ");
        String word = in.nextLine();

        System.out.println(searchWord(new Word1(word)));
    }

}