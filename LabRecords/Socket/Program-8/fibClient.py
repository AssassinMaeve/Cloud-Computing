import socket as sc 

c_sock = sc.socket()
c_sock.connect(('localhost', 5000)) 

n = input("Enter the value of N (position in Fibonacci series): ")
val = bytes(n, 'utf-8') 
c_sock.send(val) 

data = c_sock.recv(1024).decode() 
print(data)

c_sock.close()