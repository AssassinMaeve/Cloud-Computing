import socket as sc 

c_sock = sc.socket()
c_sock.connect(('localhost', 5000)) 

num = input("Enter a number: ")
val = bytes(num, 'utf-8') 
c_sock.send(val) 

data = c_sock.recv(1024).decode() 
print(data)

c_sock.close()
