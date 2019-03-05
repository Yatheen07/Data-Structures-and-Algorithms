Input = "qwertyuwertyuiertyuityuiouiopasdfghwertsdfghpoiuytrewxcvbnmzxdfghjklasdfghjk"

chars = {}

for c in Input:
    if chars.get(c):
        chars[c] = chars.get(c) + 1
    else:
        chars[c] = 1

result = ""

for key,value in chars.items():
    result+=key

print(len(result))
