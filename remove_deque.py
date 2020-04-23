#remove(x) -->single argument
from collections import deque
def removing_ele():
	#creating deque
	d1=deque([1,3,5,7,9])
	print(d1)#deque([1, 3, 5, 7, 9])
	d1.remove(5)
	print(d1)#deque([1, 3, 7, 9])
	#d1.remove(100)
	#print(d1) value error


if __name__ == '__main__':
	removing_ele()