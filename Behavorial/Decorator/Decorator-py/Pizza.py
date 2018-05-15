import abc

class Pizza(metaclass = abc.ABCMeta):
    @abc.abstractmethod
    def getDescription(self):
        pass
    
    @abc.abstractmethod
    def getCost(self):
        pass

class Pan(Pizza):

    def getDescription(self):
        return 'Fresh-Pan-Dough '

    def getCost(self):
        return 100

class CheeseBurst(Pizza):

    def getDescription(self):
        return 'Cheese-Burst-Dough '

    def getCost(self):
        return 180
