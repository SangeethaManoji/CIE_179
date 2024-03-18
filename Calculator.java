public class Calculator{
    public float addition(float operand1 ,float operand2){
        return (operand1 + operand2 );
    }
    public float subtraction(float operand1 ,float operand2){
        return (operand1 - operand2 );
    }
    public float division(float operand1 ,float operand2){
        return (operand1 / operand2 );
    }
    public float multiplication(float operand1 ,float operand2){
        return (operand1 * operand2 );
    }
    
    public static void main(String[] args ){
        Calculator calc = new Calculator();
        float operand1= 10;
        float operand2= 2;
        float add_result=calc.addition( operand1 ,operand2);
        System.out.print("\nAddition of two numbers" + add_result);
        float sub_result=calc.subtraction( operand1 ,operand2);
        System.out.print("\nsubtraction of two numbers" + sub_result);
        float mul_result=calc.multiplication( operand1 ,operand2);
        System.out.print("\nMultiplication of two numbers" + mul_result);
        float div_result=calc.division( operand1 ,operand2);
        System.out.print("\nDivision of two numbers" + div_result);
        // float sq_result=calc.square( operand1 );
        // System.out.print("Square of a numbers" + sq_result);
        // float cb_result=calc.cube( operand1);
        // System.out.print("Cube of a numbers" + cb_result);
    }
}
