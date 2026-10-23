
class Solution {
    private String[] belowTwenty = {
        "", "One", "Two", "Three", "Four", "Five",
        "Six", "Seven", "Eight", "Nine", "Ten",
        "Eleven", "Twelve", "Thirteen", "Fourteen",
        "Fifteen", "Sixteen", "Seventeen", "Eighteen",
        "Nineteen"
    };

    private String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        return convert(num).trim();
    }

    private String convert(int num) {
        if (num == 0) {
            return "";
        }

        if (num < 20) {
            return belowTwenty[num] + " ";
        }

        if (num < 100) {
            return tens[num / 10] + " "
                    + convert(num % 10);
        }

        if (num < 1000) {
            return belowTwenty[num / 100] + " Hundred "
                    + convert(num % 100);
        }

        if (num < 1000000) {
            return convert(num / 1000) + "Thousand "
                    + convert(num % 1000);
        }

        if (num < 1000000000) {
            return convert(num / 1000000) + "Million "
                    + convert(num % 1000000);
        }

        return convert(num / 1000000000) + "Billion "
                + convert(num % 1000000000);
    }
}
