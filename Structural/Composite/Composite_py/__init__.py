from Component import *

hardDrive=Leaf(4000,'Hard Drive')
mouse=Leaf(300,'Mouse')
monitor=Leaf(10000,'Monitor')
RAM=Leaf(2500,'RAM')
CPU=Leaf(12000,'CPU')

Computer=Composite("Computer")
Peripherals=Composite("Peripherals")
Cabinet=Composite("Cabinet")
Motherboard=Composite("Motherboard")


Peripherals.addComponent(mouse)
Peripherals.addComponent(monitor)

Motherboard.addComponent(CPU)
Motherboard.addComponent(RAM)

Cabinet.addComponent(hardDrive)
Cabinet.addComponent(Motherboard)

Computer.addComponent(Peripherals)
Computer.addComponent(Cabinet)

Computer.showPrice()
