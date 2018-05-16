from ElectronicDevice import *

class Television(ElectronicDevice):

    def __init__(self):
        self.volume = 0
        self.name = 'Television'

    def on(self):
        print('TV On')

    def volumeUp(self):
        self.volume += 1
        print('Television Volume : ' + str(self.volume))

    def off(self):
        print('TV Off')

    def volumeDown(self):
        self.volume -= 1
        print('Television Volume : ' + str(self.volume))
