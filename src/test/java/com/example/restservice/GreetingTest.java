package com.example.restservice;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

    @Test
    public void getContent_shouldContainsDavide_whenInitGreeting_withContentDavide() {
        // setup
        Greeting greeter = new Greeting(1, "Davide");
        // act & verify
        assertThat(greeter.getContent(), containsString("Davide"));
    }

}