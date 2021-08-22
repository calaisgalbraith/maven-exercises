package maven;

public class CodeupCrypt {

//The class should have a double static property called version that is not initialized,
// but it could set any floating number to simulate we have a version number.
    public static double version;


//It should have a method called hashPassword that takes in a string parameter and
// hashes it into a new string and return it.
    public static String hashPassword(String input){
        String hash = "";
        for (char character : input.toCharArray()){
            switch (character) {
                case 'a':
                case 'A':
                    hash += 4;
                    break;
                case 'e':
                case 'E':
                    hash += 3;
                    break;
                case 'i':
                case 'I':
                    hash += 1;
                    break;
                case 'o':
                case 'O':
                    hash += 0;
                    break;
                case 'u':
                case 'U':
                    hash += 9;
                    break;
                default:
                    hash += character;
            }
        }
        return hash;
    }

//It should have a method called checkPassword that compares two string
// parameters to make sure they match with a valid hash.
    public static boolean checkPassword(String password, String hash){
        return hash.equals(hashPassword(password));
    }
}
