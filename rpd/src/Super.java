class Super{
    public String toString(){
        return "4";
    }
}
class SubClass extends Super{
    public String toString(){
        return super.toString()+"3";
    }
    public static void main(String[] args){
        System.out.println( new SubClass() );
    }
}
