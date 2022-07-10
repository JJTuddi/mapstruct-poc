package org.example.data.tricky;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ABMethodsReverseOrderDeclarationTest implements ABTest {

    private final ABMethodsReverseOrderDeclaration ab = new ABMethodsReverseOrderDeclaration();

    @Test
    @Override
    public void testDoSomething() {
        A a = new A();
        B b = new B();
        Object o = new Object();

        assertEquals(AB.GOT_A, ab.doSomething(a));
        assertEquals(AB.GOT_B, ab.doSomething(b));
        assertEquals(AB.GOT_OBJECT, ab.doSomething(o));
    }

}