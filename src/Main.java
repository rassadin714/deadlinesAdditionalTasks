import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        String fullName = "Ivanov Ivan Ivanovich";
        int[] name = new int[3];
        for (int i = 0, q = 0; i < name.length; i++, q++) {
            name[i] = fullName.indexOf('I', q);
            q = name[i];
        }
        int[] name2 = new int[2];
        for (int i = 0, q = 0; i < name2.length; i++, q++) {
            name2[i] = fullName.indexOf(' ', q);
            q = name2[i];
        }
        System.out.println("Имя сотрудника - " + fullName.substring(name[1], name2[1]));
        System.out.println("Фамилия сотрудника - " + fullName.substring(name[0], name2[0]));
        System.out.println("Отчество сотрудника - " + fullName.substring(name[2]));
    }
    public static void task2() {
        System.out.println("Задача 2");

        String fullName = "ivanov ivan ivanovich", fullName2 = "";
        fullName2 = fullName2 + fullName.substring(0, 1).toUpperCase();
        for (int i = 1; i < fullName.length(); i++){
            if (" ".equals(fullName.substring(i -1, i)))
                fullName2 = fullName2 + fullName.substring(i, i + 1).toUpperCase();
            else
                fullName2 = fullName2 + fullName.substring(i, i + 1);
        }
        System.out.println(fullName2);

    }

    public static void task3() {
        System.out.println("Задача 3");

        String one = "135";
        String two = "246";
        StringBuilder connectingStrings = new StringBuilder();
        for (int i = 0; i < one.length(); i++){
            connectingStrings.append(one.charAt(i)).append(two.charAt(i));
        }
        System.out.println(connectingStrings);
    }

    public static void task4() {
        System.out.println("Задача 4");

        String str = "aabccddefgghiijjkk";
        int len = str.length();
        int i = 0;
        while (i < len - 1){
            String tuc = str.substring(i, i + 1);
            String j = str.substring(i + 1, i + 2);
            if (tuc.equals(j)){
                System.out.print(str.substring(i, i + 1));
            }
            i++;
        }
    }
}