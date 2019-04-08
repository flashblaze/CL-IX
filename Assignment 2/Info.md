#Assignment 2

## [Tutorial Link](https://www.youtube.com/watch?v=wQJYLWPsyqI)

Download mpj from [here](https://sourceforge.net/projects/mpjexpress/) and copy the path of the folder.

Paste the path in `.bashrc` or `.zshrc` like so:
`export export $MPJ_HOME=/home/flashblaze/Programming/mpj-v0_44`

1. Compile using `javac -cp $MPJ_HOME/lib/mpj.jar ScatterGather.java`
2. Run using `$MPJ_HOME/bin/mpjrun.sh -np 4 ScatterGather`
3. Check system resources for CPU usage.
