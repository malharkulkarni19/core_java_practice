class Calculator{

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }

    public double add(double a, double b){
        return a + b;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        int result1 = obj1.add(12,11);
        int result2 = obj1.add(12,11, 27);

        Calculator obj2 = new Calculator();
        double result3 = obj2.add(12.5,12.5);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

    }
}
