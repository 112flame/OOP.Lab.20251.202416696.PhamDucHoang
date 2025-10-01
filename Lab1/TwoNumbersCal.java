import javax.swing.JOptionPane;
public class TwoNumbersCal{
    public static void main(String[] args) {
        String strNum1, strNum2;
        String strRes = "";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null, "Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        double num1 = Double.parseDouble(strNum1);
        double num2 = Double.parseDouble(strNum2);
        double sum = num1 + num2;
        strRes += "The sum is: " + sum + "\n";
        double difference = num1 - num2;
        strRes += "The differnece is: " + difference + "\n";
        double product = num1 * num2;
        strRes += "The product is: " + product + "\n";
        double quotient = num1 / num2;
        strRes += "The quotient is: " + quotient + "\n";
        JOptionPane.showMessageDialog(null, strRes);
        System.exit(0);
    }
}