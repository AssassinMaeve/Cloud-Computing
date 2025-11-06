import socket as sc 
import time

def binaryToDecimalManual(binary_str): 
    """Convert binary to decimal manually without built-in int() function"""
    decimal = 0
    power = 0
    
    # Traverse binary string from right to left
    for digit in reversed(binary_str):
        if digit not in ['0', '1']:
            return "Invalid binary number"
        decimal += int(digit) * (2 ** power)
        power += 1
    
    return decimal

s_sock = sc.socket() 
s_sock.bind(('localhost', 5000))  
s_sock.listen(1)  

print('Server is waiting for request') 
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr) 

binary_num = c_sock.recv(1024).decode()  
print('Received from client:', binary_num) 

decimal_num = binaryToDecimalManual(binary_num) 
print(f'Binary {binary_num} in Decimal is: {decimal_num}')

response = f'Binary {binary_num} = Decimal {decimal_num}'
data = bytes(response, 'utf-8')
c_sock.send(data) 

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
