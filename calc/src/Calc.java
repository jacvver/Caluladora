import javax.swing.JOptionPane;

public class Calc {
    public static void main (String[] args){
        String op, fNumber, sNumber;
        int firstNumber, secondNumber = 0;

        op = JOptionPane.showInputDialog("CALCULADORA\n\n" +
                    "Digite o número da operação que deseja executar:\n" +
                    "1 - Soma\n" +
                    "2 - Subtração\n" +
                    "3 - Multiplicação\n" +
                    "4 - Divisão\n" +
                    "5 - Resto da divisão\n" +
                    "6 - Potência\n" +
                    "7 - Raiz quadrada\n" +
                    "\n");
        int operation = Integer.parseInt(op);

        fNumber = JOptionPane.showInputDialog("Primeiro número:");
        firstNumber = Integer.parseInt(fNumber);
        
        if (operation <= 6) {
            sNumber = JOptionPane.showInputDialog("Segundo número:");
            secondNumber = Integer.parseInt(sNumber);
        }

        switch(operation) {
            case 1:
                JOptionPane.showMessageDialog(null, firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber));
                break;
            case 2:
                JOptionPane.showMessageDialog(null, firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber));
                break;
            case 3:
                JOptionPane.showMessageDialog(null, firstNumber + " x " + secondNumber + " = " + (firstNumber * secondNumber));
                break;
            case 4:
                JOptionPane.showMessageDialog(null, firstNumber + " ÷ " + secondNumber + " = " + (firstNumber / secondNumber));
                break;
            case 5:
                JOptionPane.showMessageDialog(null, firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber));
                break;
            case 6:
                JOptionPane.showMessageDialog(null, firstNumber + "^" + secondNumber + " = " + (int) Math.pow(firstNumber,secondNumber));
                break;
            case 7:
                JOptionPane.showMessageDialog(null,  "√" + firstNumber + "= " + (int) Math.sqrt(firstNumber));
                break;
        }
    }
}
          
        

            