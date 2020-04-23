#deque is used to increase the performance of the program
from collections import deque
def extending_deque():
	lst=[20,30,40]
	#creating deque by using a deque
	deck=deque(lst)
	print(deck)#deque([20, 30, 40])
	print("before extending",id(deck))#before extending 51616424
	#extend (iterable)-->etends an iterable to the right side of the deque
	lst1=[3,9,27]
	deck.extend(lst1)
	print(deck)#deque([20, 30, 40, 3, 9, 27])
	print("after extending",id(deck))#after extending 51616424
	print()
	#extendleft(iterable)-->extends an iterable to the left side of the deque
	lst2=[4,16,25]
	deck.extendleft(lst2)
	print(deck)#deque([25, 16, 4, 20, 30, 40, 3, 9, 27])

if __name__ == '__main__':
	extending_deque()