#rotate(n) 
from collections import deque 
def rotating_deque(): 
 fruits = deque(['apple','mango','orange','banana','kiwi']) 
 #rotating fruits deque by 1 step 
 print(f"deque before rotating:{fruits}") 
 fruits.rotate(2) 
 print(f"deque after rotating:{fruits}") 
 
 
if __name__ == "__main__": 
 rotating_deque() 