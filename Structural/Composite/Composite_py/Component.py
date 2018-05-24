import abc

class Component(metaclass=abc.ABCMeta):
    @abc.abstractmethod
    def showPrice(self):
        pass

class Leaf(Component):
    def __init__(self,cost,name):
        self.cost=cost
        self.name=name
    
    def showPrice(self):
        print(self.name+" : "+str(self.cost))

class Composite(Component):
    def __init__(self,name):
        self.name=name
        self.components=[]

    def addComponent(self,c):
        self.components.append(c)

    def showPrice(self):
        print(self.name)
        for i in self.components:
            i.showPrice()
