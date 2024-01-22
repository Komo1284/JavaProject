# Car 클래스 만들기

class Car :
    
    # 생성자 함수: 데이터 멤버 정의 및 초기화
    def __init__(self, color, speed = 0) :
        self.color = color
        self.speed = speed

    def display(self) :
        print(self.color, ":", self.speed)

    def speedUp(self) :
        self.speed += 10

    def speedDown(self) :
        self.speed -= 10

    def isEqual(self, carB) :
        if self.color == carB.color :
            return True
        else :
            return False
        
    def __eq__(self, carB) :
        if self.color == carB.color :
            return True
        else :
            return False
        
    def __str__(self) :
        return "차의 색상 : %s, 차의 속도: %d" % (self.color,self.speed)

# 객체 생성
black = Car('black', 0)
red = Car('red', 120)
yellow = Car('yellow', 30)
blue = Car('blue')
green = Car("green")

black.display()
red.display()
yellow.display()
blue.display()
green.display()
print()

green.speedUp()
green.speedUp()
green.speedUp()
green.display()

red.speedDown()
red.speedDown()
red.display()

red2 = Car('red')
print("black.isEqual(red2) : ", black.isEqual(red2))
print("red.isEqual(red2) : ", red.isEqual(red2))
print("red == red2 : ", red == red2)

print("black car info: ", black)