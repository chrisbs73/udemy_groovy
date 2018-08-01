@groovy.transform.ToString
class Account {
    BigDecimal balance = 0.0

    def deposit(BigDecimal amount) {
        if( amount < 0 ) {
            throw new Exception("Deposit ${amount} must be < 0")
        }
        balance += amount
    }

    def deposit(List amounts) {
        for (amount in amounts) {
            deposit(amount)    
        }
    }
}

Account myAcct = new Account()
myAcct.deposit(45.00)

try {
    myAcct.deposit(-10)
} catch ( Exception e) {
    println e.message
}

println myAcct.balance

myAcct.deposit([1.50,2,100,4])

println myAcct.balance