package Classes_Objects;

public class month_overloading {
 public static String getMonth(int month) {
     switch (month) {
         case 1: return "Jan";
         case 2: return "F";
         case 3: return "M";
         default:return "Invalid number";
     }
 }
 public static int getMonth(String month) {
     switch (month) {
         case "Jan":return 1;
         case "F":return 2;
         case "M":return 3;
         default:return -1;
     }
 }
}
