class Mobile{
    String brand;
    int price;
    static String name = "AI Smartphone";
}

public class StaticVariable {
    public static void main(String[] args) {
        Mobile mobile1 = new Mobile();
        mobile1.brand = "Apple";
        mobile1.price = 60000;
        Mobile.name = "AI Smartphone";  //making as class member for static variable
        System.out.println("I have " + mobile1.brand + " smartphone of prize " + mobile1.price + " INR of type " + Mobile.name);

        Mobile mobile2 = new Mobile();
        mobile2.brand = "Samsung";
        mobile2.price = 90000;
        Mobile.name = "Future Smartphone"; //making as class member for static variable
        System.out.println("I have " + mobile2.brand + " smartphone of prize " + mobile2.price + " INR of type " + Mobile.name);
    }
}
