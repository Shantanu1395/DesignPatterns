from GenericDevice import GenericDevice
from PauseRemote import PauseRemote
from MuteRemote import MuteRemote
from Remote import Remote
from TVDevice import TVDevice

remote1=MuteRemote(TVDevice(100,2))
remote2=PauseRemote(TVDevice(100,2))
remote1.buttonNinePressed()
remote2.buttonNinePressed()