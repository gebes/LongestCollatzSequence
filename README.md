# LongestCollatzSequence
 Get the longest Chain under 1 Million.  
 This problem is from [projecteuler.net](https://projecteuler.net/problem=14)
 
## The problem
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)  
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

## Example output
```
Found new record          1:     1		after 0,000s 		ime since start 0,000s
Found new record          2:     2		after 0,000s 		ime since start 0,046s
Found new record          3:     8		after 0,000s 		ime since start 0,048s
Found new record          6:     9		after 0,000s 		ime since start 0,049s
Found new record          7:    17		after 0,000s 		ime since start 0,049s
Found new record          9:    20		after 0,000s 		ime since start 0,050s
Found new record         18:    21		after 0,001s 		ime since start 0,051s
Found new record         25:    24		after 0,000s 		ime since start 0,052s
Found new record         27:   112		after 0,000s 		ime since start 0,053s
Found new record         54:   113		after 0,002s 		ime since start 0,055s
Found new record         73:   116		after 0,001s 		ime since start 0,056s
Found new record         97:   119		after 0,000s 		ime since start 0,057s
Found new record        129:   122		after 0,001s 		ime since start 0,059s
Found new record        171:   125		after 0,001s 		ime since start 0,061s
Found new record        231:   128		after 0,001s 		ime since start 0,063s
Found new record        313:   131		after 0,003s 		ime since start 0,067s
Found new record        327:   144		after 0,001s 		ime since start 0,068s
Found new record        649:   145		after 0,008s 		ime since start 0,076s
Found new record        703:   171		after 0,001s 		ime since start 0,077s
Found new record        871:   179		after 0,004s 		ime since start 0,082s
Found new record       1161:   182		after 0,006s 		ime since start 0,089s
Found new record       2223:   183		after 0,015s 		ime since start 0,104s
Found new record       2463:   209		after 0,003s 		ime since start 0,108s
Found new record       2919:   217		after 0,010s 		ime since start 0,118s
Found new record       3711:   238		after 0,009s 		ime since start 0,127s
Found new record       6171:   262		after 0,033s 		ime since start 0,161s
Found new record      10971:   268		after 0,074s 		ime since start 0,235s
Found new record      13255:   276		after 0,015s 		ime since start 0,251s
Found new record      17647:   279		after 0,043s 		ime since start 0,295s
Found new record      23529:   282		after 0,071s 		ime since start 0,366s
Found new record      26623:   308		after 0,029s 		ime since start 0,395s
Found new record      34239:   311		after 0,056s 		ime since start 0,451s
Found new record      35655:   324		after 0,011s 		ime since start 0,462s
Found new record      52527:   340		after 0,168s 		ime since start 0,630s
Found new record      77031:   351		after 0,222s 		ime since start 0,852s
Found new record     106239:   354		after 0,306s 		ime since start 1,158s
Found new record     142587:   375		after 0,367s 		ime since start 1,525s
Found new record     156159:   383		after 0,110s 		ime since start 1,635s
Found new record     216367:   386		after 0,566s 		ime since start 2,202s
Found new record     230631:   443		after 0,147s 		ime since start 2,349s
Found new record     410011:   449		after 1,808s 		ime since start 4,158s
Found new record     511935:   470		after 1,028s 		ime since start 5,186s
Found new record     626331:   509		after 1,224s 		ime since start 6,410s
Found new record     837799:   525		after 2,208s 		ime since start 8,619s
Found new record    1117065:   528		after 3,251s 		ime since start 11,870s
Found new record    1501353:   531		after 4,430s 		ime since start 16,300s
Found new record    1723519:   557		after 2,487s 		ime since start 18,787s
Found new record    2298025:   560		after 6,646s 		ime since start 25,433s
Found new record    3064033:   563		after 8,496s 		ime since start 33,929s
Found new record    3542887:   584		after 5,827s 		ime since start 39,757s
Found new record    3732423:   597		after 2,099s 		ime since start 41,856s
```
