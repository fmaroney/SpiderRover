# SpiderRover
This project contains the initial project files for the Spider Mars Rover simulation workshop. Your job is to complete the program with your own code.

## System Requirements
* Java 8+

## Your Mars Mission
You are simulating a mars rover, which needs to autonomously map a quadrant of the planet within *no more than 5 minutes.* 

**HINT: Your program does not need to execute in real time!**

The planet quadrant is represented by a comma-delimited file. Each entry, or block, in the file either contains valuable ore (1) or is empty of ore (0). Your rover must begin and end at a lander that you place at one corner of the quadrant. The quadrant will always be rectangular. 

Your rover must identify, as well as possible within the time limit, how much ore is in the quadrant and where each piece of ore is located. It can only scan the block of ground on which it is situated for ore. 

It may perform one action per second. Rover actions include:
* Turn 90 degrees
* Move forward one block
* Scan the ground 

## Submitting Your Program
Before doing anything with this project, create a branch with your name on the Git project with 
```
git branch <YOUR_NAME>
```
Once you have completed your work, commit and push your code to the remote repository with
```
git commit -m <COMMIT_MESSAGE>
git push
```

## Useful Files
### Ground.java
The support package contains a `Ground` class which imports the map CSV so that the data may be used. `Ground` contains one public function and three static final variables. 

Static final variables are unchangeable, but may be referenced by other parts of the application. You do not need to initialize the `Ground` class in order to access them-- simply call with `Ground.<VAR_NAME>`:

* `int INVALID = -1`
* `int EMPTY = 0`
* `int ORE = 1`

All these variables are used in the context of the status of a space on the grid, hence referring to whether there is `ORE`, whether it is `EMPTY`, or it is an `INVALID` space to get ore and therefore has no value. 

`int scanForOre(x, y)` allows another class to determine whether there is ore in an (x, y) location. It returns one of the numbers represented by `ORE`, `EMPTY`, or `INVALID`, depending on whether there is ore in the space.  `x` and `y` must both be `int` variables.  

### testMap.csv
`src/resources/testMap.csv` is a sample map you may use for testing your rover program. 

**NOTE: Your completed program may be tested on different maps! Make something flexible, not something that works perfectly with the one map. **

When you run your program, make sure that the first argument is the path to this file. For example, you may run a compiled program from the command line with
```
java -jar SpiderRover.jar "src/resources/testMap.csv"
```
In Eclipse, navigate to Run -> Run Configurations and create a run configuration with the Main Class set to `main.MarsMission`, open the Args tab, and enter the path to this file. 

If the program has issues finding the file, then it will exit with an error description. 

### MarsMission.java
This is your main method, and has the space labeled for you to incorporate your work. Good luck!
