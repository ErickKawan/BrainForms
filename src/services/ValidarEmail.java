package services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidarEmail {
    public static boolean validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validatePassword(String senha) {
        return senha.length() >= 8 && senha.matches(".*[0-9].*") && senha.matches(".*[a-zA-Z].*");
    }
}
