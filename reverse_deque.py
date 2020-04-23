#Program: 7 
# reverse() 
from collections import deque 
 
def reversing_deque(): 
 d1 = deque([11,13,15,17,19]) 
 
 print(f'deque before reversing:{d1}')#deque([11, 13, 15, 17, 19]) 
 print(d1.reverse())#None 
 print(f'deque after reversing:{d1}')#deque([19,17,15,13,11]) 
 
if __name__ == "__main__": 
 reversing_deque() 
 
 