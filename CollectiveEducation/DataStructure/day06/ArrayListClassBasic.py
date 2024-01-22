# ArrayList 클래스 구현하기

class ArrayList:
    def __init__(self, capacity = 10) :
        self.capacity = capacity
        self.items = [None] * self.capacity
        self.nItems = 0

    def size(self) :
        return self.nItems

    def isEmpty(self):
        return self.nItems == 0
    
    def isFull(self) :
        return self.nItems >= self.capacity
    
    def clear(self) :
        self.items = [None] * self.capacity
        self.nItems = 0

    def insert(self, pos, elem) :
        # self.items.insert(pos, elem)
        if not self.isFull() :
            for i in range(self.nItems-1, pos-1, -1) :
                self.items[i+1] = self.items[i]
            self.items[pos] = elem
            self.nItems += 1

    def delete(self,pos):
        # self.items.pop(pos)
        if 0 <= pos < self.nItems :
            for i in range(pos, self.nItems-1) :
                self.items[i] = self.items[i+1]
            self.nItems -= 1

    def append(self, elem) :
        if not self.isFull() :
            self.items[self.nItems] = elem
            self.nItems += 1

    def pop(self) :
        if not self.isEmpty() :
            self.items[self.nItems-1] = None
            self.nItems -= 1

    def getEntry(self, pos) :
        return self.items[pos]
    
    def find(self, item) :
        for i in range(self.nItems):
            if self.items[i] == item :
                return i
        return -1
    
    def replace(self, pos, elem) :
        self.items[pos] = elem

    def display(self, msg='ArrayList:' ) :
        print(msg, end='= [')
        for i in range(self.nItems):
            print(self.items[i], end=', ')
        print("]")


if __name__ == "__main__":
    s = ArrayList()
    s.display('클래스로 구현한 배열 구조의 리스트(ArrayList) 테스트')
    s.insert(0, 10)
    s.insert(0, 20)
    s.insert(1, 30)
    s.insert(s.size(), 40)
    s.insert(2, 50)
    s.display("클래스로 구현한 ArrayList(삽입x5): ")
    s.replace(2, 90)
    s.display("클래스로 구현한 ArrayList(교체x1): ")
    s.delete(2)
    s.delete(s.size() -1)
    s.delete(0)
    s.display("클래스로 구현한 ArrayList(삭제x3): ")
    s.clear()
    s.display("클래스로 구현한 ArrayList(정리후): ")

