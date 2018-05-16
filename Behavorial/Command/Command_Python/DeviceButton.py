from Command import *

class DeviceButton():

    def __init__(self, command):
        self.command = command

    def press(self):
        self.command.execute()

    def unpress(self):
        self.command.unexecute()