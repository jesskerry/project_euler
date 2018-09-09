import numpy as np

def get_num_factors(num):
    factors = set()
    factors.add(1)
    factors.add(num)
    for i in range(1, int(np.ceil(np.sqrt(num)))):
        if num % i == 0:
            factors.add(i)
            factors.add(int(num / i))
    return len(factors)

triangular_numbers = {}
factors = {}
idx = 1

# essentially the "do" of a do-while
triangular_numbers[idx] = 1
factors[idx] = get_num_factors(triangular_numbers[idx])
# end "do"
while(factors[idx] < 500):
    idx += 1
    triangular_numbers[idx] = triangular_numbers[idx - 1] + idx
    factors[idx] = get_num_factors(triangular_numbers[idx])
    print(factors[idx])
print()
print(triangular_numbers[idx])

# print(get_num_factors(12375))
