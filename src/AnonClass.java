public interface AnonClass {
    public void anonMethod();
}

class Example {

    public static void main(String[] args) {

        String localVariable = "Printing the local variable value";

        AnonClass anon = new AnonClass() {
            public void anonMethod() {
                System.out.println("Inside method of anonymous class");
                System.out.println(localVariable);
            }
        };

        anon.anonMethod();

    }

}

