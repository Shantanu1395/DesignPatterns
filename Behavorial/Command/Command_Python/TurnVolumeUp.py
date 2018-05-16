from Command import *

class TurnVolumeUp(Command):
    def __init__(self, device):
        self.device = device

    def execute(self):
        self.device.volumeUp()

    def unexecute(self):
        self.device.volumeDown()