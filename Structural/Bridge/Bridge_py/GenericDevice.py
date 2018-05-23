import abc

class GenericDevice(metaclass=abc.ABCMeta):
    def __init__(self):
        self.deviceState=None
        self.maxSetting=None
        self.volumeLevel=0

    @abc.abstractmethod
    def buttonFivePressed(self):
        pass

    @abc.abstractmethod
    def buttonSixPressed(self):
        pass

    def buttonSevenPressed(self):
        self.volumeLevel+=1
        print("VolumeLevel:"+str(self.volumeLevel))

    def buttonEightPressed(self):
        self.volumeLevel-=1
        print("VolumeLevel:"+str(self.volumeLevel))

    def deviceFeedback(self):
        if self.deviceState>self.maxSetting or self.deviceState<0:
            print("On "+self.deviceState)