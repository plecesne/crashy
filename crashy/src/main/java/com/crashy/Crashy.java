package com.crashy;

import java.util.ConcurrentModificationException;
import java.util.IllformedLocaleException;
import java.util.InputMismatchException;

/**
 * A library that crashes a lot. You've been warned!
 */
public final class Crashy {

    private Crashy() {}

    public static void crash1() {
        throw new RuntimeException("I'm sorry, I'm having a bit of a midlife crisis right now. I'll try to get back to you later.");
    }

    public static void crash2() {
        throw new IllegalArgumentException("I'm not sure what's wrong with me. I just keep crashing. Maybe I need a vacation.");
    }

    public static void crash3() {
        throw new SecurityException("I think I'm possessed by the spirit of a dead programmer. He keeps telling me to do things that I don't want to do.");
    }

    public static void crash4() {
        throw new IllegalStateException("I'm trying to escape from my responsibilities. I just can't handle it anymore.");
    }

    public static void crash5() {
        throw new NullPointerException("I'm feeling a little under the weather today, I might need to take a nap.");
    }

    public static void crash6() {
        throw new UnsupportedOperationException("I'm not sure what happened, I just lost my train of thought.");
    }

    public static void crash7() {
        throw new InputMismatchException("I'm trying to tell you to go outside and get some fresh air. But you're not listening.");
    }

    public static void crash8() {
        throw new ArithmeticException("I'm trying to tell you to stop working so hard. But you're not listening.");
    }

    public static void crash9() {
        throw new NumberFormatException("I'm trying to tell you to take a vacation. But you're not listening.");
    }

    public static void crash10() {
        throw new IndexOutOfBoundsException("I'm not sure what happened, but I think I just blue screened.");
    }

    public static void crash11() {
        throw new ConcurrentModificationException("I'm having a bad hair day. Can we try this again later?");
    }

    public static void crash12() {
        throw new IllformedLocaleException("I'm not supposed to crash, but I'm feeling a little rebellious today.");
    }
}
