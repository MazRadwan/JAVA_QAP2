package problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;

    public CreditCard(Person newCardHolder, Money limit){
        this.owner = newCardHolder;
        this.creditLimit = new Money(limit); //uses copy constructor
        this.balance = new Money(0.0);
    }

    public Money getBalance(){
         return new Money(balance); //return a copy (encapsulation)
    }
    public Money getCreditLimit(){
        return new Money(creditLimit); //return a copy (encapsulation)
    }
    public String getPersonals(){
        return owner.toString();
    }
    public void charge(Money amount){
        Money newBalance = balance.add(amount);
        if (newBalance.compareTo(creditLimit) <= 0){
            balance = newBalance;
            System.out.println("Charge: " + amount);
    } else {
        System.out.println("Exceeds credit limit");
    }
}

    public void payment(Money amount){
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);

    }
  
}
