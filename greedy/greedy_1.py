
# 거스름돈
n = 1260
count = 0
array = [500, 100, 50, 10]

for coin in array:
    count += n // coin
    n %= coin

print(count)

# 시간 복잡도 : 동전의 총 종류에만 영향을 받는다
