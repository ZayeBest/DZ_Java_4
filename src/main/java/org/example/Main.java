package org.example;
import java.util.Scanner;
import static java.lang.Math.sqrt;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //part1

        int arg = 0;
        double res1 = 0;
        Scanner scn = new Scanner(System.in);

        System.out.println("Введіть свое число: ");
        arg = scn.nextInt();
        res1 = sqrt(arg);
        System.out.println("Корень з вашого числа дорівнює: \n"+ res1);

        //part 2

        System.out.println("Введіть числа більші за 0 через \" \":");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();


        String[] numbers = input.split(" ");

        int min = Integer.parseInt(numbers[0]);
        int max = Integer.parseInt(numbers[0]);

        for (int i = 1; i < numbers.length; i++) {
            int num = Integer.parseInt(numbers[i]);
                if (num < min) {
                    min = num;
                }if (num > max) {
                    max = num;
                }
            }
        System.out.println("Мінімальне значення: " + min);
        System.out.println("Максимальне значення: " + max);

        //part 3

        String text =
                "Роняє ліс багряний свій убір,\n" +
                "Срібне мороз, що в'януло поле,\n" +
                "Прогляне день ніби мимоволі\n" +
                "І сховається за край окружних гір\n";
        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;

        System.out.println("\n"+text);

        for (int i = 0; i < text.length(); i++){
            char now = text.charAt(i);
            if(now == 'п' || now == 'П'){
                count1+=1;
            }else if (now == 'р' || now == 'Р'){
                count2+=1;
            } else if (now == 'о' || now == 'О') {
                count3+=1;
            }
        }

        for (int i = 0; i< text.length()-2; i++){
            char now = text.charAt(i);
            char now1 = text.charAt(i+1);
            char now2 = text.charAt(i+2);
            if ((now == 'п' || now == 'П') && (now1 == 'р' || now1 == 'Р') && (now2 == 'о' || now2 == 'О')){
                count+=1;
            }
        }
        System.out.println("Кількість комбінацій \"про\" у тексті: "+ count);
        System.out.println("Кількість букв \"п\": "+ count1);
        System.out.println("Кількість букв \"р\": "+ count2);
        System.out.println("Кількість букв \"о\": "+ count3);
    }
}