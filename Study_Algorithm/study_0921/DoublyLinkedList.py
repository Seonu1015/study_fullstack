# 이중 연결 리스트
class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

class DoublyLinkedList:
    def __init__(self):
        self.head = None
    
    def is_empty(self):
        return self.head is None
    
    def append(self, data):
        newNode = Node(data)

        if self.is_empty():
            self.head = newNode
        else:
            temp = self.head
            while temp.next:
                temp = temp.next
            temp.next = newNode
            newNode.prev = temp

    def prepend(self, data):
        newNode = Node(data)
        if not self.is_empty():
            newNode.next = self.head
            self.head.prev = newNode
        self.head = newNode

    def delete(self, data):
        if not self.is_empty():
            if self.head.data == data:
                temp = self.head
                if temp.next: # head 다음 노드가 존재하는 경우에만 prev를 None으로 설정
                    temp.next.prev = None
                self.head = temp.next
                temp.next= None
            else:
                currentNode = self.head
                
                while currentNode and currentNode.data != data:
                    prevNode = currentNode
                    currentNode = currentNode.next

                if currentNode:
                    prevNode = currentNode.prev
                    nextNode = currentNode.next

                    if currentNode:
                        prevNode.next = nextNode

                    if nextNode:
                        nextNode.prev = prevNode

def print_linked_list(linked_list):
    currentNode = linked_list.head
    while currentNode is not None:
        print(currentNode.data, end=' ')
        currentNode = currentNode.next
    print()


linked_list = DoublyLinkedList()

linked_list.append(1)
linked_list.append(2)
linked_list.append(3)

print_linked_list(linked_list)

linked_list.delete(2)

print_linked_list(linked_list)