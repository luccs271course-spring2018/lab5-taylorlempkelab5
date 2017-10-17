##Philip Lempke and Nick Taylor
#Solution to Lab 5

##Why does 'LinkedStack' not require an explicit constructor?

#LinkedStack does not require an explicit constructor since you have methods created in its class that you can call upon.
#eliminating the need for a constructor


##What is the time and (extra) space complexity of each of the `LinkedStack` methods, as well as `ReverseLines.main`?


##For LinkedStack methods: 
# push, peek, and pop all have a  complexity of T(n) = O(1), and a space complexity of S(n) = 0(1); they are in constant time


##for the main class in ReverseLines: 
# isEmpty and asList both have a time complexity of T(n) = O(1) and S(n) = O(1); they are in constant time


##How else (not using `Node`) could we have implemented `LinkedStack` in such a way that it is still based on a linked list but the `asList` method uses constant time and space?

# If we were to use an arrayList as the container so that we have O(n)


##Is it better for `push` and `pop` to return the item or the stack itself?

##Pros 
# if you use push or pop it will use less memory which will allow it to be faster
# as it operates on constant time and space

##Cons
# Returning the whole stack will take a larger amount of time if the stack is considerably large
# If you return the whole stack you have every item returned at once, rather than individually