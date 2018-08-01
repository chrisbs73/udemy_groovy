@groovy.transform.ToString
class Account {

    def balance = 0.0
    def type // checking or savings
    
    def deposit(amount) {
        balance += amount
    }

    def withdrawal(amount) {
        balance -= amount
    }
    
    def plus(Account account) {
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