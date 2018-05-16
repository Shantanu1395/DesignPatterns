import abc

class ElectronicDevice(metaclass = abc.ABCMeta):

    @abc.abstractmethod
    def on(self):
        pass

    @abc.abstractmethod
    def volumeUp(self):
        pass

    @abc.abstractmethod
    def off(self):
        pass

    @abc.abstractmethod
    def volumeDown(self):
        pass