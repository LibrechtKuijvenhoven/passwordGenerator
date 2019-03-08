 // ---------- imports -----------\\
    import java.util.Random;
    import java.util.Scanner;
    import java.util.Arrays;
    import java.util.ArrayList;
    import java.awt.datatransfer.*;
    import java.awt.Toolkit;
 // --------  end imports ---------\\



public class passwordGenerator extends javax.swing.JFrame
{
    /* ---- Define Varibles ---- */
    // all of the different characters which the user can choose
    private static String[]            pwLowerLetter    =   {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    private static String[]            pwUpperLetter    =   {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    private static String[]            pwNumbers        =   {"1","2","3","4","5","6","7","8","9","0"};
    private static String[]            pwSymbols        =   {"!","@","#","$","%","^","&","*","_","-","+","="};
    private static String[]            pwCharacters     =   {"~","(",")","{","}","[","]","/","\\","\"","`",",",";",":",".","<",">"," "};

    //the length of the password.
    // The user can choose the lenth
    public static int                  pwLength;
    //this is the string where the password that will be generated in
    public static String             pwOutput = "";

    private static ArrayList<String> pwTmpArray  = new ArrayList<>();
    private static String            pwTmpString = "";

    // here goes all the arrays that the users has chosen
    private static String[]            pwGetChar = {};


    // all the variables which indicates which kind of characters the user wants to use for his password
    protected static boolean           useLower         = false;
    protected static boolean           useUpper         = false;
    protected static boolean           useNumbers       = false;
    protected static boolean           useCharacters    = false;
    protected static boolean           useSymbols       = false;

    // variables to copy the password
    public static StringSelection stringSelection;
    public static Clipboard clipboard;

    public  static String               ErrorShort = "Error: password is to short";
    public  static String               ErrorLong = "Error: password is to long";

    /* ---------End Variables------------ */

    public static void main(String[]args){
    }
    //generates the password of an given length
    protected static String generate_password(){
        //clears the output string
        pwOutput = "";
        //loops the amount of the passwordlength
        for (int i=0; i<pwLength;i++){
            //adds a random string chosen from the chosen characters
                pwOutput += pwGetChar[(int) (Math.random() * pwGetChar.length)];
        }
        //displays the password on the screen
        return pwOutput;
    }

    //generates the password of an given length
    protected static String generate_distinct_password(){
        //clears the output string
        pwOutput = "";
        //loops the amount of the passwordlength
        for (int i=0; i<pwLength;i++){
            //adds a random string chosen from the chosen characters
            pwTmpString = pwGetChar[(int) (Math.random() * pwGetChar.length)];

            if (pwTmpArray.contains(pwTmpString)){
                i--;
            }else{
                pwTmpArray.add(pwTmpString);
            }
            pwTmpString = "";

        }
        for (String K: pwTmpArray) {
            pwOutput += K;
        }
        pwTmpArray.clear();
        //displays the password on the screen
        return (pwOutput);
    }
    //here are the character chosen based on the users choice
    protected static void set_characters(){
        //clear the array for all the characters
        // to make sure that it generates the correct password
        pwGetChar = new String[0];

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
    //Copy the password
    protected static void Copy(){
        stringSelection = new StringSelection(pwOutput);
        clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipboard.setContents(stringSelection, null);
    }

    protected static String passwordCheck(){
        if(pwLength < 6){
            return ErrorShort;
        }else if(pwLength > 32){
            return ErrorLong;
        }else{
            return "checked";
        }
    }

}