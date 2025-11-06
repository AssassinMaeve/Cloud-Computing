import socket as sc
import time

def find_max_min_digit(num):
    # Convert number to string to access each digit
    num_str = str(abs(num))  # abs() handles negative numbers too

    # Initialize max and min with the first digit
    max_digit = min_digit = int(num_str[0])

    # Loop through remaining digits
    for ch in num_str[1:]:
        digit = int(ch)
        if digit > max_digit:
            max_digit = digit
        if digit < min_digit:
            min_digit = digit

    return max_digit, min_digit


# Create socket
s_sock = sc.socket()
s_sock.bind(('localhost', 5000))
s_sock.listen(1)  # Waiting for client
print('Server is waiting for request')

# Accept client connection
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr)

# Receive data from client
num = c_sock.recv(1024).decode()
print('Received from client:', num)

# Process the number
max_digit, min_digit = find_max_min_digit(int(num))
print(f'Maximum digit: {max_digit}, Minimum digit: {min_digit}')

# Send response back to client
response = f'{num} -> Maximum digit: {max_digit}, Minimum digit: {min_digit}'
data = bytes(response, 'utf-8')
c_sock.send(data)

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
