package point_levels;

public class GetSecondLevel {
    public static String buildStr(int secondPosition, int firstPosition) {
        switch (secondPosition) {
            case 1:
                switch (firstPosition){
                    case 0: return "десять ";
                    case 1: return "одиннадцать ";
                    case 2: return "двенадцать ";
                    case 3: return "тринадцать ";
                    case 4: return "четырнадцать ";
                    case 5: return "пятнадцать ";
                    case 6: return "шестьнадцать ";
                    case 7: return "семнадцать ";
                    case 8: return "восемьнадцать ";
                    case 9: return "девятьнадцать ";
                    default: return "";
                }
            case 2:
                return "двадцать ";
            case 3:
                return "тридцать ";
            case 4:
                return "сорок ";
            case 5:
                return "пятьдесят ";
            case 6:
                return "шестьдесят ";
            case 7:
                return "семьдесят ";
            case 8:
                return "восемьдесят ";
            case 9:
                return "девяноста ";
            default:
                return "";
        }
    }
}
