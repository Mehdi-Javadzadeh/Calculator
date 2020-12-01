package academy.learnprogramming;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                                while (true) {
                                    Scanner input = new Scanner(System.in);
                                    System.out.println("insert your Calculation :");
                                    String userExpression = input.next();
                                    String[] splitExpression = userExpression.split("(?<=[\\d.])(?=[^\\d.])|(?<=[^\\d.])(?=[\\d.])");
                                    String[] newSplitExpression;
                                    newSplitExpression = splitExpression;

                                    double convertedToNumber1;
                                    convertedToNumber1 = Double.parseDouble(newSplitExpression[0]);
                                    double convertedToNumber2;
                                    convertedToNumber2 = Double.parseDouble(newSplitExpression[2]);

                                    char operator = newSplitExpression[1].charAt(0);

                                    double result = 0;

                                    if (operator =='+'){
                                        result =  sum(convertedToNumber1,convertedToNumber2);
                                        System.out.println(result);
                                    }else if (operator == '-'){
                                        result =subtraction(convertedToNumber1,convertedToNumber2);
                                        System.out.println(result);
                                    }else if (operator == '*'){
                                        result = multiplication(convertedToNumber1,convertedToNumber2);
                                        System.out.println(result);
                                    }else if (operator == '/'){
                                        result = divide(convertedToNumber1,convertedToNumber2);
                                        System.out.println(result);
                                    }else System.out.println("Invalid Expression");
                         }

                      }// methods
        public static double sum (double x, double y){
        return x + y;
                }
    public static double subtraction (double x, double y){
        return x - y;
            }
    public static double multiplication (double x, double y){
        return x * y;
         }
    public static double divide (double x, double y){
        return x / y;
    }
}
