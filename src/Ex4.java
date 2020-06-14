public class Ex4 {
    private static int sumDigProd(int[] numbers)
    {
        int sum = 0;
        for(int i =0;i<numbers.length;i++)
        {
            sum += numbers[i];
        }
        String strNum = String.valueOf(sum);
        int mpy = 0;
        while(strNum.length()>1)
        {
            mpy = 1;
            for(int i =0;i<strNum.length();i++)
            {
                mpy *= Character.getNumericValue(strNum.charAt(i));
            }
            strNum = String.valueOf(mpy);
        }
        return mpy;
    }
    public static void main(String[] args) {
        System.out.println(sumDigProd(new int[]{16,28}));
        System.out.println(sumDigProd(new int[]{0}));
        System.out.println(sumDigProd(new int[]{1,2,3,4,5,6}));
    }
}
