class Student{
    int a;
    int b;

    public int add(int a, int b) {     //this is behaviour of the method
        System.out.println("In add method");
        return a + b;
    }

    public void getMeAPen(int price){
        if(price <= 10) {
            System.out.println("I want a Pen");
        }
        else{
            System.out.println("I don't want a Pen");
        }
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Student a1 = new Student();

        System.out.println(a1.add(num1,num2));

        Student s2 = new Student();
        a1.getMeAPen(15);
    }
}
