package statictopic;

public class OuterClass {
    private int outerVariable = 10;

    public void outerMethod() {
        System.out.println("This is the outer method");
    }

    public class InnerClass {
        private int innerVariable = 20;

        public void innerMethod() {
            System.out.println("This is the inner method");
            System.out.println("Outer variable: " + outerVariable);
            outerMethod();
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.innerMethod();
    }
}
