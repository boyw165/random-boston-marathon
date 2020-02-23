## How to run

1. Install Kotlin

```
$ brew update
$ brew install kotlin
```

2. Build and run the code in command line.

```
$ kotlinc boston-marathon-analysis.kt -include-runtime -d ans.jar && java -jar ans.jar
```

3. Output.

```
1. Most recent year that Canada (CAN) won the Boston Marathon => 1980
2. Fastest women's time in the 1980s => 8563
3. After the United States,the country that has won the 2nd-most number of times => KEN
4. First year that a woman's time beat the slowest men's winning time => 1974
```
