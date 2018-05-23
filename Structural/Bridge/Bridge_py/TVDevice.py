from GenericDevice import *

class TVDevice(GenericDevice):
    def __init__(self,deviceState,maxSetting):
        self.deviceState=deviceState
        self.maxSetting=maxSetting

    def buttonFivePressed(self):
        print("Channel Down")
        self.deviceState-=1

    def buttonSixPressed(self):
        print("Channel Up")
        self.deviceState+=1