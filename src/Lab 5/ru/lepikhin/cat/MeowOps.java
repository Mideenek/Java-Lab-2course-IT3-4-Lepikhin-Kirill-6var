package ru.lepikhin.cat;

public class MeowOps {
    public static void meowAll(Meower... meowers) {
        for (Meower meower : meowers) {
            meower.meow();
        }
    }
}