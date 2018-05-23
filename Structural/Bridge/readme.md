 This folder contains implementation of the bridge pattern which used to decouple the interaction between the two interfaces by providing an abstraction.
 
 Contains an example of two interfaces(not the literal one) Remote and TV which are realted to each other.
 
 Remotes are of two types -Mute Remote and Pause Remote
 These Concrete Remote classes extends Remote class 
 TV Device extends the GenericDevice
 
          Generic Device->TV Device
          Remote(Device as a parameter) -> MuteRemote
                                        -> PauseRemote
*Remote interacts with device                                        
                                        
