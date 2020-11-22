package com.erikas.mokausi;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PersonTest {

    @Test
    public void shouldReturnHelloWorld() {

        Person erikas = new Person();
        assertEquals("Hello World", erikas.helloWorld() );
    }

}
