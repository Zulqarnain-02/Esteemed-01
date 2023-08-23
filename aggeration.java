class laptop{
    private
    String model="DELL";
    double pricce=49990.45;
    charger c;
public void addCharger( charger obj){
    c=obj;
}
public void display(){
    System.out.println("Model "+ model);
System.out.println("Price is "+ pricce);
System.out.println("Charger volt is "+ c);
}

}
class charger{
    int volt=12;
}
public class aggeration {
    public static void main(String[] args) {
        laptop l=new laptop();
        charger c=new charger();
        l.addCharger(c);
        l.display();
    }
}
