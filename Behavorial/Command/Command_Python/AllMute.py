from Command import *

class AllMute(Command):
    def __init__(self,templist):
        self.templist = templist
        self.stored = []

    def execute(self):
        for i in self.templist:
            self.stored.append(i.volume)
            i.volume = 0
            print(i.name)
            print("Volume : "+str(i.volume))

    def unexecute(self):
        k=0
        for i in self.templist:
            i.volume = self.stored[k]
            k+=1