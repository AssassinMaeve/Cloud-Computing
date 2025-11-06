import socket as sc 
import time

def replaceVowelsNext(text): 
    """Replace each vowel with next vowel in cyclic order"""
    # Create vowel mapping: a->e, e->i, i->o, o->u, u->a
    vowels = 'aeiou'
    vowel_map = dict(zip(vowels, vowels[1:] + vowels[0]))
    
   	# Add uppercase mappings
    vowel_map.update(dict(zip(vowels.upper(), (vowels[1:] + vowels[0]).upper())))
    
    # Replace each character
    result = ''.join([vowel_map.get(char, char) for char in text])
    return result

s_sock = sc.socket() 
s_sock.bind(('localhost', 5000))  
s_sock.listen(1)  

print('Server is waiting for request') 
c_sock, addr = s_sock.accept()
print('Connected with Client...', addr) 

text = c_sock.recv(1024).decode()  
print('Received from client:', text) 

converted = replaceVowelsNext(text) 
print(f'Original: {text}')
print(f'Converted: {converted}')

response = f'Original: {text} | Converted: {converted}'
data = bytes(response, 'utf-8')
c_sock.send(data) 

time.sleep(0.5)  # Ensure data is sent before closing
c_sock.close()
s_sock.close()
