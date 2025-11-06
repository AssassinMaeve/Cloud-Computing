import socket as sc 
import time

def countCommonChars(str1, str2): 
    """Count common characters between two strings"""
    # Convert both strings to sets and find intersection
    common = set(str1.lower()) & set(str2.lower())
    count = len(common)
    return count, common

s_sock = sc.socket() 
s_sock.bind(('localhost', 5000))  
s_sock.listen(1)  

print('Server is waiting for request') 
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr) 

# Receive two strings separated by comma
strings = c_sock.recv(1024).decode()  
print('Received from client:', strings) 

# Split the strings
str1, str2 = strings.split(',')
count, common = countCommonChars(str1, str2) 
print(f'Common characters: {common}')
print(f'Count: {count}')

response = f'Strings: "{str1}" and "{str2}" | Common characters: {sorted(common)} | Count: {count}'
data = bytes(response, 'utf-8')
c_sock.send(data) 

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
