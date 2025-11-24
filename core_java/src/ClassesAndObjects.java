class Student{
    int a;
    int b;

    public int add(int a, int b) {
        System.out.println("In add method");
        return a + b;
    }
}

public class ClassesAndObjects {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        Student a1 = new Student();

        System.out.println(a1.add(num1,num2));
    }
}
