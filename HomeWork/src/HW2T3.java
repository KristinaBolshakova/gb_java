
import java.util.Arrays;

public class HW2T3 {
    public static void main(String[] args) {
        java.lang.String json = "{\"фамилия\":\"Иванов\",\"оценка\":\"5\",\"предмет\":\"Математика\"},{\"фамилия\":\"Петрова\",\"оценка\":\"4\",\"предмет\":\"Информатика\"},{\"фамилия\":\"Краснов\",\"оценка\":\"5\",\"предмет\":\"Физика\"}";
        java.lang.String[] newjson = json.replace("\"", "").replace(":", " ").replace(",", " ").replace("{", "").replace("}", "").split(" ");
        System.out.println(Arrays.toString(newjson));
        StringBuilder stringBuilder = new StringBuilder(" ");
        System.out.println(stringBuilder);
        for (int i = 0; i < newjson.length; i+=6) {
            System.out.println("Студент" + " " + newjson[i+1] + " " + "получил" + " " + newjson[i+3] + " " + "по предмету" + " " + newjson[i+5]);
        }
    }

}
