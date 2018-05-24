Composite Design Pattern

                 Component
                /         \
          Component      Component
          /       \       /     \
       Leaf       Leaf Leaf Component
                            /       \
                          Leaf      Leaf  

Use Case- Used when want to represent tree like hierarachy/part-whole hierarachy.


Example Used-Assembly of a computer

                 Computer
                /         \
          Peripheral      Cabinet
          /       \       /     \
       Monitor  Mouse HardDrive Motherboard
                                 /        \
                               CPU        RAM  
