package Banking;

import java.util.Scanner;

public class Bankapp {
    int accountNo = 1008;
    String name;
    float initialBalance = 0;
    int pin = 2006;
    
    public boolean verifyAccount(int acc, int pn){
        
            if(acc == accountNo && pn == pin){
                return true;
            }else{
                return false;
            }
    }
    
    public int setAccount(){
        return accountNo;
    }
    
    public void viewBalance(){
    
    
    }
}
