from Pizza import *

class PizzaDecorator(Pizza):

    def __init__(self,pizza):
        self.tempPizza = pizza

    def getDescription(self):
        return self.tempPizza.getDescription()

    def getCost(self):
        return self.tempPizza.getCost();

class Mozerella(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Mozerella '

    def getCost(self):
        return self.tempPizza.getCost() + 50


class TomatoSauce(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Tomato-Sauce '

    def getCost(self):
        return self.tempPizza.getCost() + 35


class Mushrooms(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Mushrooms '

    def getCost(self):
        return self.tempPizza.getCost() + 40


class Onion(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Onions '

    def getCost(self):
        return self.tempPizza.getCost() + 30

class Capsicum(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Capsicum '

    def getCost(self):
        return self.tempPizza.getCost() + 30


class Tomato(PizzaDecorator):

    def __init__(self,pizza):
        self.tempPizza = pizza
        super().__init__(pizza)

    def getDescription(self):
        return self.tempPizza.getDescription() + 'Tomato '

    def getCost(self):
        return self.tempPizza.getCost() + 30
    
