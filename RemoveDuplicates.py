def removeDuplicate(str,n):
	#used as index in the modifies string
	index=0
	#traverse throught all characters
	for i in range(0,n):
		#check if str[i] is present before it
		for j in range(0,i+1):
			if(str[i]==str[j]):
				break
	         #if not present then addd it to result
		if(j==i):
			str[index]=str[i]
			index += 1
	return ''.join(str[:index])

	#driver code
	str="abcskjaabc"
	n=len(str)
	print(removeDuplicate(list(str),n))

if __name__ == '__main__':
	 removeDuplicate(str,n)