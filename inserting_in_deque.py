#insert(i,x)-->where i position ,c is the element
from collections import deque
#deck --->20  30   40   
#+ve	   0   1    2
def inserting_ele_deque():
	deck=deque([20,30,40])
	print(deck)#deque([20, 30, 40])

	deck.insert(2,100)
	print(deck)#deque([20, 30, 100, 40])

	deck.insert(3,100)
	print(deck)#deque([20, 30, 100, 100, 40])

	deck.insert(2,25)
	print(deck)#deque([20, 30, 25, 100, 100, 40])
	
if __name__ == '__main__':
	inserting_ele_deque()