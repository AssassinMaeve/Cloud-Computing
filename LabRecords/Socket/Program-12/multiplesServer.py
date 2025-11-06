import socket as sc 
import time

def generateMultiples(n, count=10): 
    """Generator function to yield multiples of a number"""
    for i in range(1, count + 1):
        yield n * i

s_sock = sc.socket() 
s_sock.bind(('localhost', 5000))  
s_sock.listen(1)  

print('Server is waiting for request') 
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr) 

num = c_sock.recv(1024).decode()  
print('Received from client:', num) 

# Generate 10 multiples using generator
multiples = list(generateMultiples(int(num), 10))
print(f'10 multiples of {num}: {multiples}')

response = f'10 multiples of {num}: {multiples}'
data = bytes(response, 'utf-8')
c_sock.send(data) 

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
