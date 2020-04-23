#split()
def check():
	data="the clown ran after the car"
	#case 1
	print(data.split())#['the', 'clown', 'ran', 'after', 'the', 'car']  
	'''the split method is used to split the data based on space and separate the words'''
	#case 2
	print(data.split('the'))
	'''the split method is used to split the data based on 'the' and separate the words'''
	#case 3
	print(data.split('the',1))
	#we cannot split 2nd argument since the order is from left to right
	print(data.split('e',2))
	'''the split method is used to split the data based on 'the' number of occurances and separate the words'''
if __name__ == '__main__':
	check()