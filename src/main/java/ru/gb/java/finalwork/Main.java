package ru.gb.java.finalwork;

import ru.gb.java.finalwork.controller.AnimalController;
import ru.gb.java.finalwork.services.AnimalList;


public class Main {
    public static void main(String[] args) throws Exception {
        AnimalController controller = new AnimalController();

        controller.Run();
    }
}