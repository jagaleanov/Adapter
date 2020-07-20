/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

import javax.swing.JOptionPane;

/**
 *
 * @author jgale
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Bank bank = new Bank();
        DollarAdapter dollarBank = new DollarAdapter(bank);
        boolean next = true;

        try {
            do {
                /**
                 * *INICIA SELECCION OPERACION**
                 */
                Object[] opsOperations = {
                    "Ingresar",
                    "Retirar",
                    "Salir"};

                String operationSelected = (String) JOptionPane.showInputDialog(
                        null,
                        "<html>Su saldo actual es:<br>"
                        + "$" + bank.getTotalPesos() + " COP<br>"
                        + "$" + dollarBank.getTotal() + " USD<br>"
                        + "Qué operación desea realizar?</html>",
                        "Banco",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opsOperations,
                        opsOperations[0]);

                if (operationSelected.equals("Salir")) {
                    next = false;
                    continue;
                }

                /**
                 * *INICIA SELECCION MONEDA**
                 */
                Object[] opsCurrency = {
                    "COP",
                    "USD"};

                String currencySelected = (String) JOptionPane.showInputDialog(
                        null,
                        "En qué moneda desea realizar la operación?",
                        "Banco",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opsCurrency,
                        opsCurrency[0]);

                double value = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor de la operación"));

                if (operationSelected.equals("Ingresar")) {
                    if (currencySelected.equals("COP")) {
                        bank.consignPesos(value);
                    } else if (currencySelected.equals("USD")) {
                        dollarBank.consignCash(value);
                    }
                } else {
                    if (currencySelected.equals("COP")) {
                        bank.withdrawPesos(value);
                    } else if (currencySelected.equals("USD")) {
                        dollarBank.withdrawCash(value);
                    }
                }
            } while (next == true);

        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "No se ha recibido ningun dato.");
        }
    }
}
