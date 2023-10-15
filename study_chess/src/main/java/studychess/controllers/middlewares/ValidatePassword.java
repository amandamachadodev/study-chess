package studychess.controllers.middlewares;

import studychess.exceptions.InvalidPasswordException;

public class ValidatePassword {

    public static void isValidPassword(String password) {
        if (password.length() < 8) {
            throw new InvalidPasswordException("A senha deve ter pelo menos oito caracteres.");
        }

        boolean containsLetter = false;
        boolean containsNumber = false;

        for (char c : password.toCharArray()) {
            if (Character.isLetter(c))
                containsLetter = true;
            else if (Character.isDigit(c))
                containsNumber = true;

            if (containsLetter && containsNumber)
                break;
        }

        if (!containsLetter || !containsNumber)
            throw new InvalidPasswordException("A senha deve conter letras e números.");
    }
}
