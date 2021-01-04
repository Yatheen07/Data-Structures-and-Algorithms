
#Initial Solution - Shortcut Method
""" Given n, when represented as sum of powers of 2,
    the winningPosition is the number obtained by
    performing the following action:
        sourceBinary[1:] + sourceBinary[0],
    where souceBinary is the binary representation of n.
    ex: if n = 41, 
        Binary Rep: 101001
        Solution = 010011 ('01001' appended with '1')"""

def getWinningPosition(n):
    sourceBinary = bin(n).replace('0b','')
    targetBinary = sourceBinary[1:] + sourceBinary[0]
    return int(targetBinary,2)

for n in range(1,100):
    print(str(n)+" ----> "+str(getWinningPosition(n)))