# 집합 자료구조 만들기

from ArrayListClassBasic import ArrayList

# Set
class Set :
    def __init__(self, capacity = 10) :
        self.list = ArrayList(capacity)

    def size(self) :
        return self.list.size()
    
    def contains(self, elem) :
        if self.list.find(elem) >= 0 :
            return True
        else: return False

    def insert(self, elem) :
        if not self.contains(elem) :
            self.list.insert(self.size(), elem)
    
    def delete(self, elem) :
        id = self.list.find(elem)
        if id >= 0 :
            self.list.delete(id)

    def display(self, msg) :
        self.list.display(msg)

    def clone(self) :
        newSet = Set()
        for i in range(self.size()) :
            newSet.insert(self.list.getEntry(i))
        return newSet
    
    def union(self, setB):
        newSet = self.clone()
        for i in range(setB.size()) :
            newSet.insert(setB.list.getEntry(i))
        return newSet
    
    def intersect(self, setB):
        newSet = Set()
        for i in range(self.size()) :
            e1 = self.list.getEntry(i)
            for j in range(setB.size()):
                e2 = setB.list.getEntry(j)
                if e1 == e2 :
                    newSet.insert(e1)
        return newSet

    def different(self, setB):
        newSet = self.clone()
        for i in range(setB.size()):
            newSet.delete(setB.list.getEntry(i))
        return newSet



    

# 리스트로 구현한 집합(Set) 테스트
setA = Set()
setA.insert('sellphone')
setA.display('Set A: ')

setB = Set()
setB.insert('brush')
setB.insert('sellphone')
setB.display('Set B: ')

s0 = setA.union(setB)
s1 = setA.intersect(setB)
s2 = setA.different(setB)
s0.display('A U B: ')
s1.display('A ^ B: ')
s2.display('A - B: ')