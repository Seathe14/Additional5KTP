import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Ex9 {
    public static String correctTitle(String sentence)
    {
        List<String> wordsArr = new LinkedList<String>();
        for(String str : sentence.split(" "))
        {
            wordsArr.add(str);
        }
        for(int i =0;i< wordsArr.size();i++)
        {
            wordsArr.set(i,wordsArr.get(i).toLowerCase());
        }
        for(int i =0;i<wordsArr.size();i++)
        {
            if(!wordsArr.get(i).equals("in") && !wordsArr.get(i).equals("the")
            && !wordsArr.get(i).equals("and") && !wordsArr.get(i).equals("of"))
            {
                char[] str = wordsArr.get(i).toCharArray();
                str[0] = Character.toUpperCase(str[0]);
                wordsArr.set(i,String.valueOf(str));
            }
        }
        String result = "";
        for(int i = 0; i<wordsArr.size();i++)
        {
            result += wordsArr.get(i) + " ";
        }
        return result;
}
    public static void main(String[] args) {
        System.out.println(correctTitle("jOn SnoW, kINg IN thE noRth."));
        System.out.println(correctTitle("sansa stark, lady of winterfell."));
        System.out.println(correctTitle("TYRION LANNISTER, HAND OF THE QUEEN."));
    }
}
