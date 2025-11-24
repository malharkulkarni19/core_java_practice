class Calculator{

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {

        Calculator obj1 = new Calculator();
        int result1 = obj1.add(12,11);
        int result2 = obj1.add(12,11, 27);

        System.out.println(result1);
        System.out.println(result2);

    }
}
