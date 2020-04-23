from collections import deque
#adding ele to deque
def add_ele_deque():
	#to create double ended queue i have to pass deck as a keyword
	lst=[20,30,40]
	deck=deque(lst)
	print(deck)#deque([20, 30, 40])
	#append(x)-->adds x to right side of the deque(double ended queue)
	deck.append(50)
	deck.append(60)
	print(deck)#deque([20, 30, 40, 50,60....])
	#appendleft(x)-->adds x to left side of the deque(double ended queue)
	deck.appendleft(10)
	print(deck)
	deck.appendleft(5)
	print(deck)
	#accessing deque elements
	#deck--->5,10,20, 30, 40, 50, 60
	#        0  1  2   3   4   5   6
	print(deck[0])

if __name__ == '__main__':
	add_ele_deque()