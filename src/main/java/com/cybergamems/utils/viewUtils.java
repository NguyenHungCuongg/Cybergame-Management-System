
package com.cybergamems.utils;

import java.text.DecimalFormat;

public final class viewUtils { 
    private static final DecimalFormat decimalFormat = new DecimalFormat("#,##0");
    private viewUtils(){};
    
    public static String formatDoubleWithoutDecimal(double value){
        return decimalFormat.format(value);
    }
}
