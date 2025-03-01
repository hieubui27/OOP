import javax.swing.JOptionPane;

public class Calculate{
	public static void main(String[]args){
		String strNum1,strNum2;
		String strNotification = "You've just enterd: ";
		strNum1 = JOptionPane.showInputDialog(null,"Please input the first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		double Num1= Double.parseDouble(strNum1);
		strNum2= JOptionPane.showInputDialog(null,"Please input the second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		double Num2= Double.parseDouble(strNum2);
		double Sum= Num1+Num2;
		double Dif=Num1-Num2;
		double Product=Num1*Num2;
		String Quotient = (Num2 != 0) ? String.valueOf(Num1 / Num2) : "Undefined (division by zero)";
		String resultMessage = "Sum: " + Sum + "\n"+ "Difference: " + Dif + "\n"+ "Product: " + Product + "\n" + "Quotient: " + Quotient;
		JOptionPane.showMessageDialog(null,resultMessage,"Calculation result",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
		
		