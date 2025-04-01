
package com.cybergamems.utils;

import java.text.DecimalFormat;

public final class ViewUtilities { 
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,##0");
    private ViewUtilities (){};
    
    public static String formatDoubleWithoutDecimal(double value){
        return decimalFormat.format(value);
    }
}

