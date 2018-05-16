from ElectronicDevice import *
from Television import *
from DeviceButton import *
from Command import *
from TurnTVOn import *
from TurnTVOff import *
from TurnVolumeDown import *
from TurnVolumeUp import *
from AllMute import *
from Radio import *

#Turning TV On
tv = Television()
tvOn = TurnTVOn(tv)
db = DeviceButton(tvOn)
db.press()


#Turning TV Off
tvOn = TurnTVOff(tv)
db = DeviceButton(tvOn)
db.press()

#Volume Up
tvOn = TurnVolumeUp(tv)
db = DeviceButton(tvOn)
db.press()
db.press()
db.press()

#Volume Down
tvOn = TurnVolumeUp(tv)
db = DeviceButton(tvOn)
db.unpress()
db.unpress()
db.unpress()

#Decreasing Volume of Both to 0
tv = Television()
radio = Radio()

tvOn1 = TurnVolumeUp(tv)
db1 = DeviceButton(tvOn)
db1.press()
db1.press()
db1.press()

tvOn2 = TurnVolumeUp(radio)
db2 = DeviceButton(tvOn2)
db2.press()
db2.press()
db2.press()

l=[tv,radio]
allVolDown = AllMute(l)
db = DeviceButton(allVolDown)
db.press()
