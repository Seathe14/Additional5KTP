public class Ex3 {
    private static boolean canComplete(String word, String fullWord)
    {
        int count = 0;
        for(int i = 0;i < fullWord.length();i++)
        {
            if(fullWord.charAt(i) == word.charAt(count))
            {
                count++;
                if(count == word.length())
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canComplete("butl","beautiful"));
        System.out.println(canComplete("butlz","beautiful"));
        System.out.println(canComplete("rk","rock"));
    }
}
