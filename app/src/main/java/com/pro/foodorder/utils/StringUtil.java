package com.pro.foodorder.utils;

public class StringUtil {

    public static boolean isValidEmail(CharSequence target) {
        if (target == null)
            return false;
        return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

    public static boolean isGoodField(String input) {
        return input != null && !input.isEmpty() && input.length() >= 6;
    }

    public static boolean isEmpty(String input) {
        return input == null || input.isEmpty() || ("").equals(input.trim());
    }

    public static String getDoubleNumber(int number) {
        if (number < 10) {
            return "0" + number;
        } else return "" + number;
    }

    public static String toVND(int x) {
        if (x == 0) return "0";
        String res = "";
        String signal = "";
        if (x < 0) {
            signal = "-";
            x = -x;
        }

        int i = 0;
        while (x > 0) {
            int y = x % 10;
            i += 1;
            if (i == 3 && x > 9) {
                res = "," + Integer.toString(y) + res;
                i = 0;
            } else {
                res = Integer.toString(y) + res;
            }
            x /= 10;
        }
        return signal + res;
    }
}

