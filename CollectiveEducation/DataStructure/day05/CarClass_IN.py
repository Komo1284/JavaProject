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

class SuperCar(Car) :
    def __init__(self, color, speed = 0, bTurbo = True) :
        super().__init__(color,speed)
        self.bTurbo = bTurbo

    def speedUp(self):
        if self.bTurbo == True :
            self.speed += 30
        else:
            super().speedUp()

    def __str__(self):
        if self.bTurbo :
            return "[%s] [speed = %d] TurboMode" % (self.color, self.speed)
        else:
            return "[%s] [speed = %d] NormalMode" % (self.color, self.speed)
        

sCar = SuperCar("blackpink", 0, False)
print("sCar: ", sCar)
sCar.speedUp()
sCar.speedUp()
print("sCar: ", sCar)