from Remote import *


class MuteRemote(Remote):
    def __init__(self,device):
        super().__init__(device)

    def buttonNinePressed(self):
        print("TV Muted")