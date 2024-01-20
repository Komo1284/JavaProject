def contains(bag, e) :
    return e in bag

def insert(bag, e) :
    bag.append(e)

def remove(bag, e) :
    bag.remove(e)

def count(bag) :
    return len(bag)

def numOf(bag, e) :
    count = 0
    for i in range(len(bag)):
        if bag[i] == e :
            count += 1
    return count

#===========================================
myBag = []
insert(myBag, '휴대폰')
insert(myBag, '지갑')
insert(myBag, '손수건')
insert(myBag, '빗')
insert(myBag, '자료구조')
insert(myBag, '야구공')
print('내 가방속의 물건', myBag)

insert(myBag, '빗')
remove(myBag,'손수건')
print('내 가방속의 물건:', myBag)
print()
print('빗 의 개수', numOf(myBag,'빗'))
print('빛 의 개수', numOf(myBag,'빛'))