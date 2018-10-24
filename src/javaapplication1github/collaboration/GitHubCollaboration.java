package javaapplication1github.collaboration;


public class GitHubCollaboration 
{   
        
    public static void main(String[] args)
    {
        // Call methods Addition, Subtraction and Multiplication
        Addition(5, 5);
        Subtraction(5, 5);
        Multiplication(5, 5);
    }
    
    public static double Addition(double firstNumber, double secondNumber)
    {
        double sum = firstNumber + secondNumber; // Calculation
        System.out.println(firstNumber + " + " + secondNumber + " = " + sum); // Output
        
        return sum;
    }
    
    public static double Subtraction(double firstNumber, double secondNumber)
    {
        double difference = firstNumber - secondNumber; // Calculation
        System.out.println(firstNumber + " - " + secondNumber + " = " + difference); // Output
        
        return difference;
    }
    
    public static double Multiplication(double firstNumber, double secondNumber)
    {
        double product = firstNumber * secondNumber; // Calculation
        System.out.println(firstNumber + " * " + secondNumber + " = " + product); // Output
        
        return product;
    }
    
    
    
}
