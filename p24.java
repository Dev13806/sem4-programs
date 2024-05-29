class insufficientException extends Exception
{
   public insufficientException(String message)
   {
     super(message);
   }
}
class bankaccount
{
    double balance;
    public bankaccount(double ibalance)
    {
       balance=ibalance;
    }
    public void deposite(double amount)
    {
        balance += amount;
        System.out.println("Deposite: \nRs."+amount);
        System.out.println("current balance: \nRs."+balance);
    }
    public void withdraw(double amount) throws insufficientException
    {
       if(balance >= amount)
       {
         balance -= amount;
         System.out.println("Withdrawn:\nRs."+amount);
         System.out.println("current balance:\nRs."+balance);
       }
       else
       {
         throw new insufficientException("Not sufficient fund");
       }  
    }
}

public class p24 
{
    public static void main(String[] args)
    {   
        bankaccount a1=new bankaccount(25000);
        try 
        {
           a1.deposite(0);
           a1.withdraw(20000);
           a1.withdraw(4000);
           a1.withdraw(2000);
        } 
    
        catch (insufficientException e) 
        {
            System.out.println(e.getMessage());
        }
        
    }
}
