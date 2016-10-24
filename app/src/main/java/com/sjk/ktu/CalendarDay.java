package com.sjk.ktu;

/**
 * Created by vvdnlt207 on 20/10/16.
 */
public class CalendarDay {
    int id;
    String date;
    String title;
    int type;

    public CalendarDay() {
    }

    public CalendarDay(int id, String date, String title, int type) {
        this.id = id;
        this.date = date;
        this.title = title;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
