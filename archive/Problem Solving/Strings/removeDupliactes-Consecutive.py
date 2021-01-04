from itertools import groupby

Input = "aaaaabbbbcdefbbbb"
result1 = ""
result2 = ""
for key,value in groupby(Input):
    result1+=key+str(len(list(value)))
    result2+=key
print(result1.strip())
print(result2.strip())
