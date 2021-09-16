package com.planit.jupiter.utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.text.ParseException;

public class Utilities {

    public float currencyConvertor(String value){
        float num = 0;
        try {
            num = NumberFormat.getInstance()
                    .parse(value.substring(1))
                    .floatValue();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return num;
    }

    public static double round(double value, int numbers) {
        if (numbers < 0) throw new IllegalArgumentException();
        BigDecimal bdec = new BigDecimal(Double.toString(value));
        bdec = bdec.setScale(numbers, RoundingMode.HALF_UP);
        return bdec.doubleValue();
    }
    
}
