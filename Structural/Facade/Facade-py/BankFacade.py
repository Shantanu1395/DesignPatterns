from CheckAccountNumber import *
from CheckSecurityCode import *
from FundsCheck import *

class BankFacade():
    def __init__(self,accountNumber,secutityCode):
        self.accountNumber=accountNumber
        self.secutityCode=secutityCode
        self.checkAccountNum=CheckAccountNumber()
        self.checkSecurityCode=CheckSecurityCode()
        self.fundsCheck=FundsCheck()

    def deposit(self,amount):
        if self.checkAccountNum.check(self.accountNumber) and self.checkSecurityCode.check(self.secutityCode):
            self.fundsCheck.increase(amount)
            print("Balance Now:"+str(self.fundsCheck.getBalance()))
        else:
            print("Incorrect Details")

    def withdraw(self,amount):
        if self.checkAccountNum.check(self.accountNumber) and self.checkSecurityCode.check(self.secutityCode):
            self.fundsCheck.decrease(amount)
            print("Balance Now:"+str(self.fundsCheck.getBalance()))
        else:
            print("Incorrect Details")            
