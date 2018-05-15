from Addons import *

if __name__ == '__main__':
    
    def choosePizza(base):
        print('1.FarmHouse\n2.FungiMagic\n')
        if int(input()) == 1:
            return TomatoSauce(Mozerella(Onion(Capsicum(Tomato(base)))))
        else:
            return TomatoSauce(Mozerella(Mushrooms(base)))

    def makeYourPizza(base):
        pizza = base
        ingredients = 0
        print('Add')
        while True:
            print('1. Mozerella')
            print('2. Mushrooms')
            print('3. Onions')
            print('4. Capsicum')
            print('5. Tomato')
            print('6. Thats it!!')
            ingredients = int(input())
            if ingredients == 6:
                break
            if ingredients == 1:
                pizza = Mozerella(pizza)
            if ingredients == 2:
                pizza = Mushrooms(pizza)    
            if ingredients == 3:
                pizza = Onion(pizza)    
            if ingredients == 4:
                pizza = Capsicum(pizza)    
            if ingredients == 5:
                pizza = Tomato(pizza)
        return pizza
    
    def chooseBase():
        print('1.Fresh Pan\n2.Cheese Burst\n')
        i = int(input())
        if i == 1:
            return Pan()
        else:
            return CheeseBurst() 
        
    #p1 = choosePizza(chooseBase())
    p2 = makeYourPizza(chooseBase())

    #print(p1.getCost())
    #print(p1.getDescription())
    
    print(p2.getCost())
    print(p2.getDescription())
