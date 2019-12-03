import javax.swing.*;

public class ASCIIValue {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog(null,"Enter a char or ascii value","ASCII",JOptionPane.QUESTION_MESSAGE);
        for(int i = 0; i < input.length(); i++){
            if(Character.isDigit(input.charAt(i))){
              int n = Integer.parseInt(input);
              char letter = checkASCIILetter(n);
              System.out.print(letter);
            }
            else{
                char[] letters = input.toCharArray();
                for(char letter : letters){
                    int number = checkASCIINumber(letter);
                    System.out.println(number);
                }

            }
        }

    }

    private static int checkASCIINumber(char input) {
        int number = (int) input;
        return number;
    }

    private static char checkASCIILetter(int n) {
        char letter = (char) n;
        return letter;
    }
}
