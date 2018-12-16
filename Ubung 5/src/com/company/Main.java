package com.company;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<PaperBook> books = new ArrayList<>();
        for(int i = 1; i <= 5; i++){
            books.add(new PaperBook("00000-000000-0000", 200 + i*10, new Date(2018,i+1,2, 14,9, 54),
                    "My PaperBook"+i, "My series", "Month"));
        }

        for(int i = 1; i <= 5; i++) {
            var book = books.get(i-1);
            System.out.println(book.getTitle() + " hat " + book.getPages() + " Seiten und folgende ISBN: " + book.getIsbn() +
                    " zusätzlich ist es im Monat " + new SimpleDateFormat("MMMM").format(book.getReleased()));
        }
        return;
    }
}
