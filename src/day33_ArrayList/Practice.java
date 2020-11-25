package day33_ArrayList;

public class Practice {
    public static void main(String[] args) {
        String password = "Batch21!";

        String upperLetter = "";
        String lowerLetter = "";
        String digits = "";
        String specialCharacter = "";

        for ( char each : password.toCharArray()){ // 'B' 'a' 't' 'c' 'h' '2' '1' '!'
            if (Character.isUpperCase(each)){
              upperLetter += each;
            } else  if (Character.isLowerCase(each)){
                lowerLetter += each;
            }else if (Character.isDigit(each)){
                digits += each;
            }else{
                specialCharacter += each;
            }
        }
        System.out.println("Upper letters " + upperLetter);
        System.out.println("Lower letters " + lowerLetter);
        System.out.println("digits = " + digits);
        System.out.println("specialCharacter = " + specialCharacter);


        boolean isValid = password.length() >= 8 && upperLetter.length() >0 &&
                lowerLetter.length()>0 && digits.length() >0 && specialCharacter.length()>0;
        System.out.println(isValid);


    }

}
