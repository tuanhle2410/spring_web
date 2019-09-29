package vn.topica.itlab4.findfinders.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils {
    /**
     * This method converts a String into Date
     * @param s the string input
     * @return  a Date
     * @throws ParseException Signals that an error has been reached unexpectedly while parsing
     */
    public static Date stringToDate(String s) throws ParseException {
        Date date = new SimpleDateFormat("dd/MM/yyyy").parse(s);
        return date;
    }
}
