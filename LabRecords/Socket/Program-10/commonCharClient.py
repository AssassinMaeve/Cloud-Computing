import socket as sc 

c_sock = sc.socket()
c_sock.connect(('localhost', 5000)) 

str1 = input("Enter first string: ")
str2 = input("Enter second string: ")

# Send both strings separated by comma
combined = str1 + ',' + str2
val = bytes(combined, 'utf-8') 
c_sock.send(val) 

data = c_sock.recv(1024).decode() 
print(data)

c_sock.close()
