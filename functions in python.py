def fun_sorted():
	data="tech for abc"
	lst=sorted(data)  #[' ', ' ', 'a', 'b', 'c', 'c', 'e', 'f', 'h', 'o', 'r', 't']
	#when we needed the output in list format
	print(''.join(lst)) #  abccefhort
def fun_length():
	s1="the clown ran after the car into the tent"
	print(len(s1))
def fun_maximum():
	s1='abc'
	s2='xyz'
	print(max(s1))#c
	print(max(s2))#z
def fun_minimum():
	s1='abc'
	s2='xyz'
	print(min(s1))#a
	print(min(s2))#x
def fun_ord():
	print(ord('a'))#97
	print(ord('A'))#65
	print(ord('z'))#122
	print(ord('n'))#110
def fun_chr():
	print(chr(65))#a
	print(chr(110))#n
	print(chr(122))#z
if __name__ == '__main__':
	fun_sorted()
	fun_length()
	fun_maximum()
	fun_minimum()
	fun_ord()
	fun_chr()