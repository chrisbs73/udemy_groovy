@groovy.transform.ToString
class Account {

    BigDecimal balance = 0.0
    String type // checking or savings
    
    BigDecimal deposit(amount) {
        balance += amount
    }

    BigDecimal withdrawal(amount) {
        balance -= amount
    }
    
    BigDecimal plus(Account account) {
        this.balance + account.balance
    }

}

Account checking = new Account(type:"Checking")
checking.deposit(100.00)

Account savings = new Account(type:"Savings")
savings.deposit(50.00)

println checking
println savings

total = checking + savings
println total