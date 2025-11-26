class Method1{

    String msg1 = " OK";
    static String msg2 = " NOT OK";


    public void method1(){
        System.out.println("Not in static method" + msg1);
        System.out.println("Not in static method" + msg2);  // no error
    }

    public static void method2(){
        //System.out.println("In static method" + msg1); // Error : non-static variable msg1 cannot be referenced from a static context
        System.out.println("In static method" + msg2);
    }
}

public class StaticMethod1 {
    public static void main(String[] args) {
        Method1 call = new Method1();
        call.method1();    // if you haven't used static keyword, call like this

        Method1.method2();  // if you declared as static method, use object directly without calling new object
    }
}
