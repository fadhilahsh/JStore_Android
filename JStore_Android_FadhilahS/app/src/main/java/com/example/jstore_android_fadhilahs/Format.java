package com.example.jstore_android_fadhilahs;

import java.text.NumberFormat;
import java.util.Locale;

public class Format {
    static public String toCurrency(double ammount)
    {
        return NumberFormat.getCurrencyInstance(new Locale("id", "ID")).format(ammount);
    }

    static  public String toDate(String date)
    {
        return date.substring(0,10);
    }
}
