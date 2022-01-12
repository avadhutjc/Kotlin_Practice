class X {
    static void staticMethod() {
        System.out.println("Class X");
    }
}

class Y extends X {
    static void staticMethod() {
        System.out.println("Class Y");
    }
}

class MainClass3 {
    public static void main(String[] args) {
        Y obj = new Y();

        Y.staticMethod();
    }
}