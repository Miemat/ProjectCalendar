package com.project.service;

import java.util.Date;

public class Holiday {

    private String title;
    private String start;
    private String end;
    private boolean allDay;
    private String colorPrime;
    private String colorSeconder;
    private String id;

    public Holiday(String title, String start, String end, boolean allDay, String colorPrime, String colorSeconder, String id) {
        this.title = title;
        this.start = start;
        this.end = end;
        this.allDay = allDay;
        this.colorPrime = colorPrime;
        this.colorSeconder = colorSeconder;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isAllDay() {
        return allDay;
    }

    public void setAllDay(boolean allDay) {
        this.allDay = allDay;
    }

    public String getColorPrime() {
        return colorPrime;
    }

    public void setColorPrime(String colorPrime) {
        this.colorPrime = colorPrime;
    }

    public String getColorSeconder() {
        return colorSeconder;
    }

    public void setColorSeconder(String colorSeconder) {
        this.colorSeconder = colorSeconder;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "title='" + title + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", allDay=" + allDay +
                ", colorPrime='" + colorPrime + '\'' +
                ", colorSeconder='" + colorSeconder + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
