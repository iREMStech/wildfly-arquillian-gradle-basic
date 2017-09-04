package com.ansis.irems.gwa_proto;
import java.io.PrintStream;

/**
 * A component for creating personal greetings.
 */
public class Greeter {
    public void greet(final PrintStream to, final String name) {
        to.println(createGreeting(name));
    }

    public String createGreeting(final String name) {
        return "Hello, " + name + "!";
    }
}