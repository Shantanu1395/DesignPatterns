class FundsCheck():
    
    def __init__(self):
        self.funds=1000

    def increase(self,amount):
         self.funds+=amount

    def decrease(self,amount):
         if self.hasBalance(amount):
             self.funds-=amount

    def hasBalance(self,amount):
         return self.funds-amount>=0

    def getBalance(self):
         return self.funds
