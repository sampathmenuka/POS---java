package util;

import org.mindrot.jbcrypt.BCrypt;

public class passwordManager {

    public static String encryptPassword(String passwordText) {

                return  BCrypt.hashpw(passwordText, BCrypt.gensalt());
    }
}
