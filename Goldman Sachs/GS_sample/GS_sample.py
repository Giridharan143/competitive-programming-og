class testing:
    def printer(self,idx):
        n=idx;i=1
        while(n>=i):
            print("Hello ",i)
            i+=1

    def recursive(self,n):
        if n==0:
            return 0
        return n+ self.recursive(n-1)

test = testing()
#test.printer(10)
#print(test.recursive(5))


class firstAndSecondSmallest:
    def operation(arr):
        large=small=float('inf')
        
        if len(arr) < 2:
            return "Array must contain at least two elements"

        for idx in range(len(arr)):

            if (arr[idx] < small):
                large = small
                small = arr[idx]                
            elif (arr[idx] > small and arr[idx] < large):
                large = arr[idx]

            return [small,large]

arr = firstAndSecondSmallest.operation([12, 35, 1, 10, 34, 5])
for num in arr:
    print(num," -> ")
print("fin")

