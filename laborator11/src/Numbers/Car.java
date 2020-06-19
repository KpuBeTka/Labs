package Numbers;

class Car {

    //proprietățile mașinii
    private String VIN; //codul VIN
    private double range, maximumSpeed; //distanța care o poate parcurge cu un rezervor, viteza maximă
    private boolean isStarted = false; //arată dacă mașina este pornită

    //constructorii
    Car(){

    }
    Car(String VIN, double range, double maximumSpeed){
        this.VIN = VIN;
        this.range = range;
        this.maximumSpeed = maximumSpeed;
    }

    //seteri și geteri
    public String getVIN() {
        return VIN;
    }
    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public double getRange() {
        return range;
    }
    public void setRange(double range) {
        this.range = range;
    }

    public double getMaximumSpeed() {
        return maximumSpeed;
    }
    public void setMaximumSpeed(double maximumSpeed) {
        this.maximumSpeed = maximumSpeed;
    }

    public boolean isStarted() {
        return isStarted;
    }
    public void setStarted(boolean started) {
        isStarted = started;
        //dacă se pornește mașina, se pornește și motorul
        engine.isStarted = started;
    }

    //afișarea datelor despre mașină
    public void getAllData(){
        //afișarea datelor despre mașină
        System.out.print("Mașina:\n" + VIN + ", " + range + " km, " + maximumSpeed + " km/h, ");
        //afișarea dacă mașina este pornită
        if(isStarted)
            System.out.println("este pornită.");
        else
            System.out.println("nu este pornită.");

        //afișarea datelor despre mașină
        engine.getAllData();
    }

    //pornirea mașinei
    public void start(){
        engine.start();
        isStarted = true;
        System.out.println("Car has been started");
    }
    //oprirea mașinei
    public void stop(){
        engine.stop();
        isStarted = false;
        System.out.println("Car has been stopped");
    }

    //crearea obiectului care corespunde motorului mașinei
    Engine engine = new Engine(7600);

    //clasa cu motor
    private class Engine{
        //caracteristicele motorului
        private int maximumRevsPerMin; //numărul maximal de rotații pe minută
        private boolean isStarted = false; //arată dacă este pornit

        //constructorii
        Engine(){

        }
        Engine(int maximumRevsPerMin){
            this.maximumRevsPerMin = maximumRevsPerMin;
        }

        //seteri și geteri
        public int getMaximumRevsPerMin() {
            return maximumRevsPerMin;
        }
        public void setMaximumRevsPerMin(int maximumRevsPerMin) {
            this.maximumRevsPerMin = maximumRevsPerMin;
        }

        public boolean isStarted() {
            return isStarted;
        }
        public void setStarted(boolean started) {
            isStarted = started;
        }

        //afișarea datelor
        public void getAllData(){
            //afișarea numărului de rotații
            System.out.print("Motorul:\n" + maximumRevsPerMin + " de rotații pe minută, ");

            //afișarea dacă motorul este pornit
            if(isStarted)
                System.out.println("este pornit.");
            else
                System.out.println("nu este pornit.");
        }

        //pornirea motorului
        public void start(){
            isStarted = true;
            System.out.println("Engine has been started");
        }
        //oprirea motorului
        public void stop(){
            isStarted = false;
            System.out.println("Engine has been stopped");
        }
    }
}

//clasa principală
class MainCar{

    public static void main(String[] args){
        //crearea obiectului
        Car car1 = new Car("1HGBH41JXMN109186", 500, 150);

        //afișarea caracteristicilor
        car1.getAllData();

        System.out.println();

        Car car2 = new Car("1H893HF8FN109186", 600, 210);

        car2.setStarted(true);

        car2.getAllData();
    }

}
