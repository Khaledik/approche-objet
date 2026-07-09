package utils;

public class TestStringUtils {
    public static void main(String[] args) {

        int age = 22;
        String resultat = StringUtils.append("Bonjour ", "Je m'appelle ", "Khaled ", ",et j'ai ", age, " ans");

        System.out.println(resultat);
    }
}
