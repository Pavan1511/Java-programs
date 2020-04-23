#copy()--->will create shallow copy of a deque
#clear()-->remove all the elementin deque
#count()-->count number of occurances of x
from collections import deque
def deque_operation():
	d1=deque([1,2,3,2,4,5,2])
	print(d1)# deque([1, 2, 3, 2, 4, 5, 2])
	print(id(d1)) #50702920

	d2=d1.copy()
	print(d2)#deque([1, 2, 3, 2, 4, 5, 2])
	print(id(d2))
	print()

	d2.clear()
	print()
	#count()
	print(d1.count(2))
if __name__ == '__main__':
	deque_operation()