import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Ex5 {
    private static String sameVowelGroup(String [] words)
    {
        List<String> result = new LinkedList<String>();
        result.add(words[0]);
        HashSet<Character> letters = new HashSet<>();
        words[0] = words[0].toLowerCase();
        for(int i =0;i<words[0].length();i++)
        {
            if(words[0].charAt(i) == 'i' || words[0].charAt(i)=='e' || words[0].charAt(i) == 'a' || words[0].charAt(i) == 'o'
            || words[0].charAt(i)=='u')
            {
                letters.add(words[0].charAt(i));
            }
        }
        HashSet<Character> compare = new HashSet<>(letters);
        for(int i = 1;i < words.length;i++)
        {
            compare = (HashSet<Character>) letters.clone();
            for(int j =0;j<words[i].length();j++)
            {
                if(words[i].charAt(j) == 'i' || words[i].charAt(j)=='e' || words[i].charAt(j) == 'a' || words[i].charAt(j) == 'o'
                        || words[i].charAt(j)=='u')
                {
                    compare.add(words[i].charAt(j));
                }
            }
            if(compare.size() == letters.size())
                result.add(words[i]);
        }
        return String.valueOf(result);
    }
    public static void main(String[] args) {
        System.out.println(sameVowelGroup(new String[]{"toe","ocelot","maniac"}));
        System.out.println(sameVowelGroup(new String[]{"many","carriage","emit","apricot","animal"}));
        System.out.println(sameVowelGroup(new String[]{"hoops","chuff","bot","bottom","animal"}));
    }
}
