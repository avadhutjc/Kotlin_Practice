class A {
    {
        System.out.println(1);
    }
}

class B extends A {
    {
        System.out.println(2);
    }

}

class C extends B {
    {
        System.out.println(3);
    }
}

class MainClass2 {
    public static void main(String[] args) {
        C c = new C();
    }
}