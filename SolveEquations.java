import javax.swing.JOptionPane;

public class SolveEquations {
    public static void main(String[] args) {
        String Choose = JOptionPane.showInputDialog(
                null,
                "Choose equation to solve:\n"
                + "1 - First-degree equation\n"
                + "2 - System of first-degree equations\n"
                + "3 - Second-degree equation\n",
                "Equation Solver",
                JOptionPane.QUESTION_MESSAGE
        );

        int choice = Integer.parseInt(Choose);
        switch (choice) {
            case 1:
                solveFirstDegree();
                break;
            case 2:
                solveFirstDegreeSystem();
                break;
            case 3:
                solveSecondDegree();
                break;
            default:
                JOptionPane.showMessageDialog(null,"Invalid choice!","Error",JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }

    private static void solveFirstDegree() {
        String inputA = JOptionPane.showInputDialog(null, "Enter a:", "ax + b = 0", JOptionPane.INFORMATION_MESSAGE);
        String inputB = JOptionPane.showInputDialog(null, "Enter b:", "ax + b = 0", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);

        String result;
        if (a == 0) {
            if (b == 0) {
                result = "Infinite solutions";
            } else {
                result = "No solution";
            }
        } else {
            double x = -b / a;
            result = "x = " + x;
        }
        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void solveFirstDegreeSystem() {
        String sA11 = JOptionPane.showInputDialog(null, "Enter a11:", "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        String sA12 = JOptionPane.showInputDialog(null, "Enter a12:", "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);
        String sB1  = JOptionPane.showInputDialog(null, "Enter b1:",  "a11x1 + a12x2 = b1", JOptionPane.INFORMATION_MESSAGE);

        String sA21 = JOptionPane.showInputDialog(null, "Enter a21:", "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        String sA22 = JOptionPane.showInputDialog(null, "Enter a22:", "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);
        String sB2  = JOptionPane.showInputDialog(null, "Enter b2:",  "a21x1 + a22x2 = b2", JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(sA11);
        double a12 = Double.parseDouble(sA12);
        double b1  = Double.parseDouble(sB1);
        double a21 = Double.parseDouble(sA21);
        double a22 = Double.parseDouble(sA22);
        double b2  = Double.parseDouble(sB2);


        double D  = a11 * a22 - a21 * a12;
        double D1 = b1 * a22 - b2 * a12;
        double D2 = a11 * b2 - b1 * a21;

        String result;
        if (D == 0) {
            if (D1 == 0 && D2 == 0) {
                result = "Infinite solutions";
            } else {
                result = "No solution";
            }
        } else {
            double x1 = D1 / D;
            double x2 = D2 / D;
            result = "x1 = " + x1 + ", x2 = " + x2;
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }

    private static void solveSecondDegree() {
        String inputA = JOptionPane.showInputDialog(null, "Enter a:", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        String inputB = JOptionPane.showInputDialog(null, "Enter b:", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);
        String inputC = JOptionPane.showInputDialog(null, "Enter c:", "ax^2 + bx + c = 0", JOptionPane.INFORMATION_MESSAGE);

        double a = Double.parseDouble(inputA);
        double b = Double.parseDouble(inputB);
        double c = Double.parseDouble(inputC);

        String result;
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Infinite solutions";
                } else {
                    result = "No solution";
                }
            } else {
                double x = -c / b;
                result = "x = " + x;
            }
        } else {
            
            double delta = b*b - 4*a*c;
            if (delta < 0) {
                result = "No real solution";
            } else if (delta == 0) {
                double x = -b / (2*a);
                result = "x = " + x;
            } else {
                double x1 = (-b + Math.sqrt(delta)) / (2*a);
                double x2 = (-b - Math.sqrt(delta)) / (2*a);
                result = "x1 = " + x1 + ", x2 = " + x2;
            }
        }

        JOptionPane.showMessageDialog(null, result, "Result", JOptionPane.INFORMATION_MESSAGE);
    }
}
