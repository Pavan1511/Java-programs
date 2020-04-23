#splitlines() </n /r /t are escape sequence>
def check():
	data1="abc for tech tech for abc"
	data2="abc for \ntech tech for\r abc"
	print(data1.splitlines())#There is no escape sequences in data1 # ['abc for tech tech for abc']
	print(data2.splitlines())#['abc for ', 'tech tech for', ' abc']
if __name__ == '__main__':
	check()