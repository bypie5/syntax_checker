class SubtypeAssign{
    public static void main(String[] a){
        System.out.println(new A().Test());
    }
}

class A {
    B b;
    C c;
    F f;
    boolean t;

    public int Test() {
        c = new C();
        b = c;

        t = b.Test();
        t = c.Test();
        t = f.Test(); // TE



        return 0;
    }
}


class B {
    public boolean Test() {
        return false;
    }
}

class C extends B {

}

class D extends C {
    public int Test () {
        return 0;
    }
}

class F extends D {

}

