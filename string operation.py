#string operations
def operations():
	s='abc'+'for tech'
	print(s)
	#repeatation
	print('python \n'*3)
	#accessing the string character
	data="BMW"
	print(data[1])#M
	#slice
	print(data[:2])#BM
	#checking membership of character in data
	print("W" in data )#True
	print("W" not in data)#False
if __name__ == '__main__':
	operations()

	method can be invoked using . notation
	fuction passing data 