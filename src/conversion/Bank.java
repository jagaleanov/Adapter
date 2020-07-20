/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conversion;

/**
 *
 * @author jgale
 */
public class Bank {
    
    private double pesos = 0;
    
    public Bank() {
    }
    
    public double getTotalPesos()
    {
        return this.pesos;
    }
    
     public void withdrawPesos( double pesos )
    {
        this.pesos -= pesos;
    }
     
     public void consignPesos( double pesos )
    {
        this.pesos += pesos;
    }
}
