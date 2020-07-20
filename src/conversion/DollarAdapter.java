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
public class DollarAdapter implements IAdapter{
    
    Bank bank ;
    
    public DollarAdapter(Bank bank) {
        this.bank = bank;
    }
    
    public double getTotal()
    {
         return this.bank.getTotalPesos() / 3300.35;
    }
    
    @Override
     public void withdrawCash( double dollars )
    {
        double pesos = dollars * 3300.35;
         bank.withdrawPesos( pesos );
    }
     
    @Override
     public void consignCash( double dollars )
    {
        double pesos = dollars * 3300.35;
         bank.consignPesos( pesos );
    }
}
