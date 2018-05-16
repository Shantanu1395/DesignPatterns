from Command import *

class TurnTVOn(Command):
    def __init__(self, device):
        self.device = device

    def execute(self):
        self.device.on()

    def unexecute(self):
        self.device.off()