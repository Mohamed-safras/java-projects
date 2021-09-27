package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {
        String newYear = "01/10/2021";
        SimpleDateFormat newyears = new SimpleDateFormat(newYear);
        Date d1 = newyears.parse(newYear);

        Date currentDate = new Date();




    }
}
