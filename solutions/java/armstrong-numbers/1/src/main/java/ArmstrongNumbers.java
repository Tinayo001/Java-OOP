class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {

        // Convert number to string to count digits
        String numStr = String.valueOf(numberToCheck);
        int numDigits = numStr.length();

        int sum = 0;
        int temp = numberToCheck;

        while (temp > 0) {
            int digit = temp % 10;  // extract last digit
            sum += Math.pow(digit, numDigits);  // add digit^numDigits
            temp /= 10;  // remove last digit
        }

        return sum == numberToCheck;
    }
}

