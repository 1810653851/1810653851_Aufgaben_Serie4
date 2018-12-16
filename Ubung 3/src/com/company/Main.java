package com.company;

import java.util.Date;

public class Main {

    public static void main(String[] args) {
        var book = new Book("32242342", 200, new Date(2018,9,2, 14,9, 54), "My Book");

        System.out.println("Das Buch hat " + book.getPages() + " Seiten,wurde " + book.getReleased() +
                " veröffentlich und hat den Titel" + book.getTitle());
        return;
    }

}
