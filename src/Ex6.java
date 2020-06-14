public class Ex6 {
    private static boolean validateCard(String str)
    {
        int[] ints = new int[str.length()];
        for(int i =0;i<str.length();i++)
        {
            ints[i] = Integer.parseInt(str.substring(i,i+1));
        }
        for(int i = ints.length-2;i>=0;i= i -2)
        {
            int j = ints[i];
            j *= 2;
            if(j>9)
            {
                j = j % 10 + 1;
            }
            ints[i] = j;
        }
        int sum =0;
        for(int i = 0;i<ints.length;i++)
        {
            sum += ints[i];
        }
        if(sum%10 == 0)
        {
            return true;
        }
        else return false;
    }
    public static void main(String[] args) {
        System.out.println(validateCard("1234567890123456"));
        System.out.println(validateCard("1234567890123452"));
    }
}
