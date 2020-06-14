import javax.print.attribute.standard.NumberOfDocuments;

public class Ex2 {
    private static int LetterDiff;
    private static int NumDiff;

    private static void FindDiffs(String start, String end)
    {
        LetterDiff = Math.abs(end.charAt(0) - start.charAt(0));
        NumDiff = Math.abs(end.charAt(1) - start.charAt(1));
    }


    private static boolean rookCanMove(String start, String end)
    {
        FindDiffs(start, end);
        return LetterDiff == 0 || NumDiff == 0;
    }
    private static boolean knightCanMove(String start,String end)
    {
        FindDiffs(start,end);
        return LetterDiff == 2 && NumDiff == 1 || LetterDiff == 1 && NumDiff == 2;
    }
    private static boolean bishopCanMove(String start,String end)
    {
        FindDiffs(start,end);
        return LetterDiff==NumDiff;
    }
    private static boolean kingMove(String start, String end)
    {
        return NumDiff <=1 && LetterDiff <= 1;
    }
    private static boolean queenMove(String start, String end)
    {
        return rookCanMove(start,end) || bishopCanMove(start,end);
    }
    private static boolean pawnCanMove(String start, String end)
    {
        if (LetterDiff != 0)
            return false;
        if (NumDiff > 2)
            return false;
        if (start.charAt(1) != '2' && NumDiff > 1 )
            return false;
        return true;
    }
    public static boolean canMove(String figure, String start, String end)
    {
        switch(figure)
        {
            case "Pawn":
                return pawnCanMove(start,end);
            case "Rook":
                return rookCanMove(start,end);
            case "King":
                return  kingMove(start, end);
            case "Queen":
                return queenMove(start, end);
            case "Bishop":
                return bishopCanMove(start, end);
            case "Knight":
                return knightCanMove(start, end);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(canMove("Rook","A8","H8"));
        System.out.println(canMove("Bishop","A7","G1"));
        System.out.println(canMove("Queen","C4","D6"));
    }
}
