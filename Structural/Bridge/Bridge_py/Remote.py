import abc
from GenericDevice import *


class Remote(metaclass=abc.ABCMeta):
    def __init__(self,device):
        self.device=device

    def buttonFivePressed(self):
        self.device.buttonFivePressed()

    def buttonSixPressed(self):
        self.device.buttonSixPressed()

    def deviceFeedback(self):
        self.device.deviceFeedback()

    @abc.abstractmethod
    def buttonNinePressed(self):
        pass