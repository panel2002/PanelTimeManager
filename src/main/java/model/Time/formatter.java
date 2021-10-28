package model.Time;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class formatter {
    public static LocalDateTime format (String inputTime){
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm");
                LocalDateTime time;
                time = LocalDateTime.parse(inputTime, format);
                return time;
            } catch (Exception e) {
                System.out.print("please re-enter:");
                inputTime = input.nextLine();
//                format(inputTime);

            }
        }
    }
}
