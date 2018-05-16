from Command import *

class TurnTVOff(Command):
    def __init__(self, device):
        self.device = device

    def execute(self):
        self.device.off()

    def unexecute(self):
        self.device.on()