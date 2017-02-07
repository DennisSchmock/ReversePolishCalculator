# ReversePolishCalculator

My solution to the ReversePolishCalculator

The interface for Path is defined in Path.class
The implementation is in IPath.class
Implemented a Pathstack in PathStack.class
The calculator itself is in Calc.class

The calculator works by having two stacks. One for opereators and one for intermediate results. 
First we iterate through the String, by splitting it by " ", and sort numbers and operators in two stacks. 

Then we go through the operatorstack (from top of course, using LIFO) and calculate from the top of intermediate results, hence making sure, that we always use the latest added number/result.
Last we output the contents of the intermediate results. 

Tested in main.class

/Dennis Schmock
