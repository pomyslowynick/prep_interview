def reverse_integer(x):
    result = 0
    y = 10
    length = 0
    temp = x
    while temp > 0:
        length += 1
        temp = temp // 10
        

    temp = x
    while x > y:
        result = result + (x % y) * (10 * (length - 1))
        y = y * 10
        print(result)

reverse_integer(123)

