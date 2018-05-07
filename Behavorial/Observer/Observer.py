import abc

class Subject(metaclass=abc.ABCMeta):

    @abc.abstractmethod
    def register(self,o):
        pass

    @abc.abstractmethod
    def deregister(self,o):
        pass

    @abc.abstractmethod
    def notifyAllObservers(self):
        pass

class Observer(metaclass=abc.ABCMeta):
    globalcount=0
    @abc.abstractmethod
    def update(self,a,b,c):
        pass
    

class ConcreteSubject(Subject):

    def __init__(self):
        self.stock1=None
        self.stock2=None
        self.stock3=None
        self.observers=[]

    def register(self,o):
        self.observers.append(o)
        print("Object Registered")

    def deregister(self,o):
        i=self.observers.index(o)
        print(str(i+1)+" Deregistered")
        del self.observers[i]

    def notifyAllObservers(self):
        for i in self.observers:
            i.update(self.stock1,self.stock2,self.stock3)

    def updateStock1(self,stock):
        self.stock1=stock
        self.notifyAllObservers()

    def updateStock2(self,stock):
        self.stock2=stock
        self.notifyAllObservers()
        
    def updateStock3(self,stock):
        self.stock3=stock
        self.notifyAllObservers()
        
class ConcreteObserver(Observer):
    def __init__(self,s):
        self.s=s
        Observer.globalcount+=1
        self.obCounter=Observer.globalcount
        self.stock1=None
        self.stock2=None
        self.stock3=None

    def update(self,a,b,c):
        self.stock1=a
        self.stock2=b
        self.stock3=c
        self.printPrices()

    def printPrices(self):
        print("Observer Id:"+str(self.obCounter))
        print("Stock 1:"+str(self.stock1))
        print("Stock 2:"+str(self.stock2))
        print("Stock 3:"+str(self.stock3))
        print()

if __name__=='__main__':
    s=ConcreteSubject()

    o1=ConcreteObserver(s)
    s.register(o1)
    s.updateStock1(100)
    s.updateStock2(150)
    s.updateStock3(200)

    o2=ConcreteObserver(s)
    s.register(o2)
    s.updateStock1(20)
    s.updateStock2(43)
    s.updateStock3(53)

    s.deregister(o1)
    s.updateStock1(10.3)
    
