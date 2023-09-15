class Queue:
    def __init__(self):
        self.queue = []

    def __len__(self):
        return len(self.queue)
    
    def is_empty(self):
        return len(self.queue) == 0
        
    def enqueue(self, item):
        self.queue.append(item)

    def dequeue(self):
        if self.is_empty():
            return "Empty"
        else:
            return self.queue.pop(0)            

    def peek(self):
        if self.is_empty():
            return "Empty"
        else:
            return self.queue[0]
        
queue = Queue()
queue.enqueue(10)
queue.enqueue(20)
queue.enqueue(30)

print(queue.peek())

print(queue.dequeue())
print(queue.dequeue())
print(queue.dequeue())

print(queue.is_empty())

# 숫자 뒤집기 <- 자료 올라오면 확인하기!!! 먼가 수상!!!

def reverse(n):
    queue = Queue()

    while n>0:
        digit = n%10
        queue.enqueue(digit)
        n //= 10

    number = 0

    while queue:
        digit = queue.dequeue()
        number = number * 10 + digit
    return number


print(reverse(12345))
print(reverse(987654321))