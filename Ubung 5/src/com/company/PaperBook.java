package com.company;

import java.util.Date;

public class PaperBook extends Book{
    private String series;

    private String month;

    public PaperBook(String isbn, int pages, Date released, String title, String series, String month){
        super(isbn,pages,released,title);
        this.series = series;
        this.month = month;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
