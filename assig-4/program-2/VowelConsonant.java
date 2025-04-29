public class VowelConsonant {
    public static void main(String[] args) {
        String str = "Hello World".toLowerCase();
        int v = 0, c = 0;
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".indexOf(ch) != -1) v++;
                else c++;
            }
        }
        System.out.println("Vowels: " + v + ", Consonants: " + c);
    }
}
