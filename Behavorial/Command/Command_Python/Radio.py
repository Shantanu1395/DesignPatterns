from ElectronicDevice import *

class Radio(ElectronicDevice):

    def __init__(self):
        self.volume = 0
        self.name = 'Radio'

    def on(self):
        print('TV On')

    def volumeUp(self):
        self.volume += 1
        print('Radio Volume : ' + str(self.volume))

    def off(self):
        print('TV Off')

    def volumeDown(self):
        self.volume -= 1
        print('Radio Volume : ' + str(self.volume))
