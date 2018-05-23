from Remote import *



class PauseRemote(Remote):
    def __init__(self,device):
        super().__init__(device)

    def buttonNinePressed(self):
        print("TV Paused")