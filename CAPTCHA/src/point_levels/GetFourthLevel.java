package point_levels;

public class GetFourthLevel
{
    public static String buildStr(int position){
        switch (position){
            case 1: return "одна тысяча ";
            case 2: return "две тысячи ";
            case 3: return "три тысячи ";
            case 4: return "четыре тысячи ";
            case 5: return "пять тысяч ";
            case 6: return "шесть тысяч ";
            case 7: return "семь тысяч ";
            case 8: return "восемь тысяч ";
            case 9: return "девять тысяч ";
            default: return "";
        }
    }
}
