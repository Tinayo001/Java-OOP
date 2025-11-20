class Leap {
    boolean isLeapYear(int year) {
        if (year % 400 == 0) {
            return true;        // every 400th year is a leap year
        } else if (year % 100 == 0) {
            return false;       // divisible by 100 but not by 400 -> not a leap year
        } else if (year % 4 == 0) {
            return true;        // divisible by 4 -> leap year
        } else {
            return false;       // everything else -> not a leap year
        }
    }
}

