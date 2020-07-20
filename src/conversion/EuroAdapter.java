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
public class EuroAdapter implements IAdapter{
    
    Bank bank = new Bank();
    
    public EuroAdapter() {
    }
    
    public double getTotal()
    {
         return this.bank.getTotalPesos() / 3681.42;
    }
    
    @Override
     public void withdrawCash( double euros )
    {
        double pesos = euros * 3681.42;
         bank.withdrawPesos( pesos );
    }
     
    @Override
     public void consignCash( double euros )
    {
        double pesos = euros * 3681.42;
         bank.consignPesos( pesos );
    }
}
