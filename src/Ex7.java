public class Ex7 {
    private static String numToEng(int number)
    {
        int onesDigit;
        int tensDigit;
        int hundredsDigit;
        String [] ones = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten",
                "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        String [] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

        String [] hundreds = {"one hundred", "two hundred", "three hundred", "four hundred", "five hundred",
                "six hundred", "seven hundred", "eight hundred", "nine hundred" };

            if (number < 20)
            {
                String result = ones[number];
                return  result;
            }
            if (number > 20 && number < 100)
            {
                tensDigit = number/10;
                onesDigit = number%10;
                return ones[onesDigit] + " " + tens[tensDigit];
            }
            if(number >= 100 && number < 1000)
            {
                hundredsDigit = number / 100;
                tensDigit = number % 100;
                if(tensDigit > 20)
                {
                    tensDigit/=10;
                    onesDigit = number%10;
                    return hundreds[hundredsDigit-1] + " " + tens[tensDigit] + " " + ones[onesDigit];
                }
                else {
                    onesDigit = number % 10;
                    return hundreds[hundredsDigit - 1] + " " + ones[tensDigit];
                }
            }
            return "";
    }
    public static void main(String[] args) {
        System.out.println(numToEng(18));
        System.out.println(numToEng(909));
        System.out.println(numToEng(105));
        System.out.println(numToEng(126));
        System.out.println(numToEng(173));
        System.out.println(numToEng(215));
    }
}
