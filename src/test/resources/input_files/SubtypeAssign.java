class SubtypeAssign{
    public static void main(String[] a){
        System.out.println(new A().Test());
    }
}

class A {
    B b;
    C c;

    public int Test() {
        c = new C();
        b = c;

        return 0;
    }
}


class B {

}

class C extends B {

}
