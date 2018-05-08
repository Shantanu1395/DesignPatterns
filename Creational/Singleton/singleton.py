from threading import Lock
class Singleton():
    _instance=None
    def __init__(self):
        print("Creating Object..")

    @staticmethod      
    def getInstance():
        _lock = Lock()
        if Singleton._instance==None:
            Singleton._instance=Singleton()
        return Singleton._instance

s1=Singleton.getInstance()    
print(id(s1))

s2=Singleton.getInstance()    
print(id(s2))
