#creating a double ended queue or deque  #only list and string
#colletions
from collections import deque
def creating_deque():
	#deque of number
	deck1=deque([10,20,30,40,50])
	print(deck1)
	print(type(deck1))

	#deque of string
	deck2=deque('abc for tech')
	print(deck2)#deque['a','b','c','c',........]
if __name__ == '__main__':
	creating_deque()


	  