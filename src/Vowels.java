public class Vowels {
    public int vowels (String str) {
        return str.replaceAll("(?i)[^aeuyo]" ,"").length();
    }
}
