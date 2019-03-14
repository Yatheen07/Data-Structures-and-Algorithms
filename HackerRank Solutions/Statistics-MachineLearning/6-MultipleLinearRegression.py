# Enter your code here. Read input from STDIN. Print output to STDOUT
numbers = list(map(int, input().split()))
features,rows = numbers[0],numbers[1]

x_train = []
y_train = []
for i in range(rows):
    values = input().split()
    #print(str(values))
    temp = []
    for feature in range(features):
        temp.append(float(values[feature]))
    x_train.append(temp)
    y_train.append(float(values[-1]))

t = int(input())
x_test = []
for j in range(t):
    values = input().split()
    #print(str(values))
    temp = []
    for feature in range(features):
        temp.append(float(values[feature]))
    x_test.append(temp)


from sklearn import linear_model

lm = linear_model.LinearRegression()
model = lm.fit(x_train,y_train)
predictions = model.predict(x_test)


for value in predictions:
    print(value)
