class Node:
    def __init__(self, data):
        self.data = data
        self.next = None
    
class SinglyLinkedList:
    def __init__(self):
        self.head = None

    def is_empty(self):
        return self.head is None
    
    def append(self, data):
        newNode = Node(data)

        if self.is_empty:
            self.head = newNode
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = newNode

    def prepend(self, data):
        newNode = Node(data)
        if not self.is_empty():
            newNode.next = self.head
        self.head = newNode

    def delete(self, data):
        if not self.is_empty:
            if self.head == data:
                self.head = self.head.next
            else:
                prevNode = null, currentNode = self.head
                while currentNode != null and currentNode.data != data:
                    prevNode = currentNode
                    currentNode = currentNode.next

                    if currentNode != null:
                        prevNode.next = currentNode.next

# 단일 연결 리스트를 역순으로 뒤집는 함수 만들어보기

