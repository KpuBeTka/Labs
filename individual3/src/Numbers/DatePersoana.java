package Numbers;

public class DatePersoana implements NumePrenumePersoana, TelefonPersoana {

    private String nume, prenume;
    private int telefon;

    DatePersoana(){}

    DatePersoana(String nume, String prenume, int telefon){
        this.nume = nume;
        this.prenume = prenume;
        this.telefon = telefon;
    }

    @Override
    public void setNume(String nume) {
        this.nume = nume;
    }
    @Override
    public String getNume() {
        return nume;
    }

    @Override
    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }
    @Override
    public String getPrenume() {
        return prenume;
    }

    @Override
    public void setTelefon(int telefon) {
        this.telefon = telefon;
    }
    @Override
    public int getTelefon() {
        return telefon;
    }

}
