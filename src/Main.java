
/*  Напишите программу  использую регулярные выражения
  которая будет выдавать числом сколько
  гласных букв  находиться в любой строке.*/

public class Main {
    public static void main(String[] args) {
        Vowels vowels = new Vowels();
        System.out.println(vowels.vowels("Happy New Year"));
    }
}
