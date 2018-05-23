import abc

class Sandwich(metaclass=abc.ABCMeta):
    def makeSandwich(self):
        self.addBread()
        self.addSauce();
        self.addStuffing()

    @abc.abstractmethod
    def addBread(self):
        pass

    @abc.abstractmethod
    def addSauce(self):
        pass

    @abc.abstractmethod
    def addStuffing(self):
        pass
