from django.db import models

# Create your models here.
class Account(models.Model) :
    userid = models.CharField(max_length = 20)
    userpw = models.CharField(max_length = 20)
    nick = models.CharField(max_length = 50)
    email = models.CharField(max_length = 50)
    jdate = models.DateField(auto_now = True)

    def __str__(self) :
        msg = "{} | {} | {} | {} | {}"
        msg = msg.format(self.userid, self.userpw
                         , self.nick, self.email, self.jdate)
        return msg