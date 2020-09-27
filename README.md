# Sol - problem solver

Setup for Competitive Programming using Java

## Solver flow

Basic routine to have more time focusing on the problem

### Solve the problem into Solution class

```java
public class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int n = timeSeries.length;
        if (n == 0 || duration == 0) return 0;
        int answer = 0;
        for(int i = 1; i < n; ++i) {
            answer += Math.min(timeSeries[i] - timeSeries[i - 1], duration);
        }
        return answer + duration;
    }
}
```

### Configure your input with Runner and Utils classes

```java
public class Runner {
    protected static void run() {
        Solution solution = new Solution();

        int[] array = Utils.readArray(3);
        int duration = Utils.readInt();

        int answer = solution.findPoisonedDuration(array, duration);
        System.out.println(MessageFormat.format("result:\n{0}",answer));
    }
}
```

### Run the solution
build:

> make build

run main:

> make run

```shell script
nicolas:~/workspace/sol$ make run
java -cp ./classes/ sol.Sol
array of length 3: 
1 4 5
int: 
5
result: 9
```

or you can try build and run in sequence:

> make sol

### Test your solution, deliver it


## Setup

You can fork and clone this repository.

And also use with an IDE of your choice without having to run make to run the solution.