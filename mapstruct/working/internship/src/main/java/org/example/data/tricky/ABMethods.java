package org.example.data.tricky;

public class ABMethods implements AB {

    public String doSomething(A a) {
        System.out.println(GOT_A);
        return GOT_A;
    }

    public String doSomething(B b) {
        System.out.println(GOT_B);
        return GOT_B;
    }

    public String doSomething(Object o) {
        System.out.println(GOT_OBJECT);
        return GOT_OBJECT;
    }

}
