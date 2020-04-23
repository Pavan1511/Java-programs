#pop() and popleft()

from collections import deque

def removing_ele_deque():
	d1=deque([10,20,30,40,50])

	#to remove element from left size #pop()
	print(d1)#deque([10, 20, 30, 40, 50])

	print(d1.pop())#50
	print(d1)#deque([10, 20, 30, 40]) element 50 is been removed

	print(d1.pop())#40
	print(d1)#deque([10, 20, 30])

	#to remove element from left size #popleft()
	print(d1.popleft())#10
	print(d1)#deque([20, 30])

	print(d1.popleft())#20
	print(d1)#deque([30])

if __name__ == '__main__':
	removing_ele_deque()