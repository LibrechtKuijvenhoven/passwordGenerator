//importing Random to choose a character
import java.util.Random;
//importing scanner for user input
import java.util.Scanner;
//importing Arrays for copying arrays
import java.util.Arrays;



public class passwordGenerator extends layout
{
    /* ---- Define Varibles ---- */
    // all of the different characters which the user can choose
    private static String[]            pwLowerLetter    =   {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private static String[]            pwUpperLetter    =   {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static String[]            pwNumbers        =   {"1","2","3","4","5","6","7","8","9","0"};
    private static String[]            pwSymbols        =   {"!","@","#","$","%","^","&","*","_","-","+","="};
    private static String[]            pwCharacters     =   {"~","(",")","{","}","[","]","/","\\","\"","`",",",";",":",".","<",">"};


    //the length of the password.
    // The user can choose the lenth
    public static int                  pwLength = 10;
    //this is the string where the password that will be generated in
    public static String               pwOutput = "";

    // here goes all the arrays that the users has chosen
    private static String[]            pwGetChar = {};

    // all the variables which indicates which kind of characters the user wants to use for his password
    private static boolean             useLower         = false;
    private static boolean             useUpper         = false;
    private static boolean             useNumbers       = false;
    private static boolean             useCharacters    = false;
    private static boolean             useSymbols       = false;

    layout screen = (layout);



    /* ------------------------- */
    public static void main(String[]args){
        screen();
        Input();
        //Execute();
        //generate_password();
    }

    public static void Execute(){


    }

    public static void set_Characters(){
        if(useLower) {   useLower = true;       }
        if(useUpper) {   useUpper = true;       }
        if(useNumbers) {   useNumbers = true;     }
        if(useCharacters) {   useCharacters = true;  }
        if(useSymbols) {   useSymbols = true;     }
    }

    public static void Input(){
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter how long your password will be: ");
        pwLength = scanner.nextInt();
        if (pwLength < 6){
            System.out.print("Your password has to be 6 or more characters");
        }
        generate_password();

        scanner.close();

    }
    //generates the password of an given length
    private static void generate_password(){
        //executes the choose_characters method
        set_characters();
        //loops the amount of the passwordlength
        for (int i=0; i<pwLength;i++){
            //adds a random string chosen from the chosen characters
            pwOutput += pwGetChar[(int) (Math.random() * pwGetChar.length)];
        }
        //displays the password on the screen
        System.out.println(pwOutput);


    }
    //here are the character chosen based on the users choice
    private static void set_characters(){

        //checks if the user wants to use lowercase letters for his password
        //example:    abc
        if(useLower){
            if (pwGetChar == null) {
                pwGetChar = Arrays.copyOf(pwLowerLetter, pwLowerLetter.length);
            }else{
                pwGetChar = merge(pwLowerLetter);
            }
        }
        //checks if the user wants to use uppercase letters for his password
        //example:    ABC
        if(useUpper){
            if (pwGetChar == null) {
                pwGetChar = Arrays.copyOf(pwUpperLetter, pwUpperLetter.length);
            }else{
                pwGetChar = merge(pwUpperLetter);
            }
        }
        //checks if the user wants to use numbers for his password
        //example:    123
        if(useNumbers) {
            if (pwGetChar == null) {
                pwGetChar = Arrays.copyOf(pwNumbers, pwNumbers.length);
            }else{
                pwGetChar = merge(pwNumbers);
            }
        }
        //checks if the user wants to use symbols for his password
        //example:    !@#
        if(useSymbols){
            if (pwGetChar == null) {
                pwGetChar = Arrays.copyOf(pwSymbols, pwSymbols.length);
            }else{
                pwGetChar = merge(pwSymbols);
            }
        }
        //checks if the user wants to use special characters for his password
        //example:    (>}
        if(useCharacters){
            if (pwGetChar == null) {
                pwGetChar = Arrays.copyOf(pwCharacters, pwCharacters.length);
            }else{
                pwGetChar = merge(pwCharacters);
            }
        }
        //if none are chosen this will run
        if (!useLower && !useUpper && !useNumbers && !useCharacters && !useSymbols){
            System.out.println("Er moet minimaal een geselecteerd worden");

        }

    }
    //Merge two characters arrays
    public static String[] merge(String[] array){

        //makes a temporary arra
        String[] tmp = new String[pwGetChar.length + array.length];

        //copy the 'pwGetChar' array the 'tmp' array
        System.arraycopy(pwGetChar, 0, tmp, 0, pwGetChar.length);
        //copy the given array the 'tmp' array
        System.arraycopy(array, 0, tmp, pwGetChar.length, array.length);

        //returns the 'tmp' array.
        // which now constists out of two arrays
        return tmp;
    }

}