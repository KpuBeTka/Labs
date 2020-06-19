package Numbers;

class Abonat {
    private long id;
    private String name;
    private String tariff;
    private PhoneNumber phoneNumber;

    public Abonat (long id, String name){
        this.id = id;
        this.name = name;
    }

    public long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public String getTariff(){
        return tariff;
    }

    public void setTariff(String tariff){
        this.tariff = tariff;
    }

    public String getPhoneNumber(){
        if (phoneNumber != null ){
            return (":" + phoneNumber.countryCode + " " + phoneNumber.netCode + "-" + phoneNumber.number);
        } else {
            return ("Numarul de telefon este vid!");
        }
    }

    public void obtainNumber(int countryCode, int netCode){
        phoneNumber = new PhoneNumber();
        phoneNumber.setCountryCode(countryCode);
        phoneNumber.setNetCode(netCode);
        phoneNumber.generateNumber();
    }

    public String toString(){
        return "Abonat " + name + "\n ID-" + id + "\n Tarif-" + tariff + " Numar de telefon-" + getPhoneNumber()+ "\n";
    }

    private class PhoneNumber{
        private int countryCode;
        private int netCode;
        private int number;

        public void setCountryCode(int countryCode){
            this.countryCode = countryCode;
        }

        public void setNetCode(int netCode){
            this.netCode = netCode;
        }

        public int generateNumber(){
            int temp = new java.util.Random().nextInt(100000);
            number = temp;
            return number;
        }
    }//end class PhoneNumber
}//end class Abonat
class TestAbonent {
    public static void main(String[] args) {
        Abonat ab = new Abonat (810023,"Timofei Balan");
        ab.setTariff("gratuit");
        ab.obtainNumber(375, 25);
        System.out.println(ab);
    }
}
