#Commit 8
Specialize the fish as a Shark and as a Clownfish
Add FishBehaviors

#Commit 7
B. Model fish as well as other swimming animals
Model a Fish with SwimmingAnimal abstract class

#Commit 6
4 - Model parrots that live with dogs, cats, roosters.
Refactor the animal sound to flexible used for all animals
=> Use SoundUtils class inside Animal, then this SoundUtils will use SoundEnums to trigger the appropriate sound
In case parrot, because we inject the sound to constructor, so we just need to trigger whatever sound we want to parrot (that sound should be added to SoundEnums first)

#Commit 5
3c - Model a rooster using composition instead of inheritance.

#Commit 4
3a,b -  Model a rooster says: “Cock-a-doodle-doo”.

#Commit 3
2 - Add Chicken and Duck
Using the default method for behaviors interface, any overridden will be implemented on each concrete class.

#Commit 2
1b - Optimize code for maintaining, instead of setting the behavior methods coupling in class, I separate it to Interfaces.

#Commit 1
1 - Add sing() for bird.
1a - Add Unit test for bird.