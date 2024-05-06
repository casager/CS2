public class PE_problem17 {
    public static void main(String[] args) {
        int totalLetters = 0;
        for (int i = 1; i <= 1000; i++) {
            String numberInWords = convertToWords(i);
            totalLetters += countLetters(numberInWords);
        }
        System.out.println(totalLetters);
    }
    public static String convertToWords(int number) {
        if (number == 1000) {
            return "one thousand";
        }
        String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
        String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String words = "";
        int hundreds = number / 100;
        int remainder = number % 100;
        if (hundreds > 0) {
            words += ones[hundreds] + " hundred";
            if (remainder > 0) {
                words += " and ";
            }
        }
        if (remainder >= 20) {
            words += tens[remainder / 10];
            remainder %= 10;
            if (remainder > 0) {
                words += "-";
            }
        }
        if (remainder >= 10 && remainder < 20) {
            words += teens[remainder - 10];
        } else if (remainder > 0) {
            words += ones[remainder];
        }
        return words;
    }
    public static int countLetters(String word) {
        return word.replaceAll("[^a-zA-Z]", "").length();
    }
}
