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
        adder = (x % y) * (10 ** (length - 1))
        result = result + (x % y) * (10 ** (length - 1))
        x = x - adder
        print(adder)
        print(x)
        y = y* 10
        print(result)
        length = length - 1
        print(length)

reverse_integer(123)

