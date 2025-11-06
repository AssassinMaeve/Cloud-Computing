import socket as sc 
import time

def findNthFibonacci(n):
    """Find the Nth term of Fibonacci series"""
    if n <= 0:
        return "Invalid input"
    elif n == 1:
        return 0
    elif n == 2:
        return 1
    else:
        a, b = 0, 1
        for i in range(2, n):
            c = a + b
            a = b
            b = c
        return b

s_sock = sc.socket() 
s_sock.bind(('localhost', 5000))  
s_sock.listen(1)  

print('Server is waiting for request') 
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr) 

num = c_sock.recv(1024).decode()  
print('Received from client:', num) 

nth_term = findNthFibonacci(int(num)) 
print(f'The {num}th term of Fibonacci series is: {nth_term}')

response = f'The {num}th term of Fibonacci series is: {nth_term}'
data = bytes(response, 'utf-8')
c_sock.send(data) 

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
