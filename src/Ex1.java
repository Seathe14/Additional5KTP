import java.util.Arrays;

public class Ex1 {
    private static int[] encrypt(String word)
    {
        char [] chWord = word.toCharArray();
        int[] result = new int[word.length()];
        result[0] = chWord[0];
        for(int i =1;i<word.length();i++)
        {
            result[i] = chWord[i]-chWord[i-1];
        }
        return result;
    }
    private static String decrypt(int[] array)
    {
        char [] chArray = new char[array.length*2];
        chArray[0] = (char) array[0];
        for(int i =1; i < array.length;i++)
        {
           //int number = array[i] + array[i-1];
           //number = array[i] - array[i-1];
           //if(array[i] > array[i-1])
           //   chArray[i] = (char) (array[i]-chArray[i-1]);
           //else
           chArray[i] = Character.valueOf((char) (array[i]+chArray[i-1]));
        }
        String result = String.valueOf(chArray);
        return result;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(encrypt("Hello")));
        System.out.println(decrypt(new int []{72,33,-73,84,-12,-3,13,-13,-68}));
        System.out.println(decrypt(new int []{72, 29, 7, 0, 3}));
        System.out.println(Arrays.toString(encrypt("Sunshine")));
    }
}
