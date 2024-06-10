1 , 2 , 4       k=5
​
1->1+1+1+1=4    (3 operations)
2-> 2+1+1=4        (2 operations)
​
WE should not make all the numbers equal to the number which is not present in the array
as in this case all the elements need to do operations in order to reach a particular element
​
**Example**
​
1 , 2 , 4       k=5
​
***lets make all the numbers equal to 2***
1->1+1=2    (1 operations)
only 1 operation used and max freq=2
​
***lets make all the numbers equal to 3***
1->1+1+1=3    (2 operations)
2-> 2+1=3        (1 operations)
only 3 operation used and max freq=2
​
***lets make all the numbers equal to 5***
1->1+1+1+1+1=5    (4 operations)
2-> 2+1+1+1=5        (3 operations)
4-> 4+1=5                 (1 operation)
8 operation used exceeded the limit as k=5
​
So, in any case, we either use fewer than k or more than k operations if we take a number that does not exist in the array.
​
So we will increase the elements of array and make it equal to the highest number.As only numbers smaller than it can increase and become equal to it which will hence increase the frequency.
​
**Example**