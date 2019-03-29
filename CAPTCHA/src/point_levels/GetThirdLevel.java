package point_levels;

public class GetThirdLevel
{
    public static String buildStr(int position){
        switch (position){
            case 1: return "сто ";
            case 2: return "двести ";
            case 3: return "триста ";
            case 4: return "четыреста ";
            case 5: return "пятьсот ";
            case 6: return "шестьсот ";
            case 7: return "семьсот ";
            case 8: return "восемьсот ";
            case 9: return "девятьсот ";
            default: return "";
        }
    }
}
