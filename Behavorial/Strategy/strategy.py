import abc

class Context(object):
    def __init__(self,value,strategy):
        self._value=value
        self._strategy=strategy

    def calculate(self):
        self._strategy.compute(self._value)

class Strategy(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def compute(self,val):
        pass

class Strategy1(Strategy):
    def compute(self,value):
        if value<40:
            print("Slim")
        else:
            print("Fat")

class Strategy2(Strategy):
    def compute(self,value):
        if value<60:
            print("Slim")
        else:
            print("Fat")

class Strategy3(Strategy):
    def compute(self,value):
        if value<90:
            print("Slim")
        else:
            print("Fat")            


if __name__ == '__main__':
    s1=Strategy1()
    s2=Strategy2()
    s3=Strategy3()

    c1=Context(60,s1)
    c1.calculate()

    c2=Context(60,s2)
    c2.calculate()

    c3=Context(60,s3)
    c3.calculate()
