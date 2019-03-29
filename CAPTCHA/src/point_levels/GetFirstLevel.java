package point_levels;

public class GetFirstLevel
{
    public static String buildStr(int position){
        switch (position){
            case 1: return "один ";
            case 2: return "два ";
            case 3: return "три ";
            case 4: return "четыре ";
            case 5: return "пять ";
            case 6: return "шесть ";
            case 7: return "семь ";
            case 8: return "восемь ";
            case 9: return "девять ";
            default: return "";
        }
    }
}
