

Algorithm
1. Input: An array a of n integers and an integer d representing the number of left rotations.
2. Calculate the number of Rotation and store them in d
3. Compute d = d % n to handle cases where d is greater than n.
4.Create a New Array:
5.Initialize a new array rotatedArray of the same length n.
6.Copy Elements to New Position:
7.For each index i from 0 to n-1, copy the element a[(i + d) % n] to rotatedArray[i].
8.Output: Return or print the rotatedArray.
