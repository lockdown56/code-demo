package lambda;

public class LambdaDemo1 {
    interface Printer {
        void printer(String val);
    }


    public static void main(String[] args) {
        LambdaDemo1 lambdaDemo1 = new LambdaDemo1();
        String something = "hello world";

//        lambdaDemo1.normaluse(something);
        lambdaDemo1.useLambda(something);
    }

    private void normaluse(String something) {
        Printer printer = new Printer() {
            @Override
            public void printer(String val) {
                System.out.println(val);
            }
        };

        printSomething(something, printer);
    }

    private void printSomething(String something, Printer printer) {
        printer.printer(something);
    }

    private void useLambda(final String something) {
        Printer printer = val -> System.out.println(val);

        printSomething(something, printer);
    }
}
