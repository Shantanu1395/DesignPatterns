from Command import *

class TurnVolumeDown(Command):
    def __init__(self, device):
        self.device = device

    def execute(self):
        self.device.volumeDown()

    def unexecute(self):
        self.device.volumeUp()