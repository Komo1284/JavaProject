from django.shortcuts import render
from rest_framework.response import Response
from rest_framework.views import APIView
from django.http import JsonResponse
from .models import Account
from .serial import AccountSerial
import json

# Create your views here.
class listAll(APIView) :
    def get(self, resquest) :
        li = Account.objects.all().order_by('-id')
        serial = AccountSerial(li, many = True)

        return Response(serial.data)
    
class listOne(APIView) :
    def get(self, request, idx) :
        li = Account.objects.filter(id = idx)
        serial = AccountSerial(li, many = True)

        return Response(serial.data)

class listAdd(APIView) :
    def post(self, request) :
        data = json.loads(request.body)

        newAcc = Account();
        newAcc.userid = data['userid']
        newAcc.userpw = data['userpw']
        newAcc.nick = data['nick']
        newAcc.email = data['email']
        newAcc.save()

        response_data = { 'msg': '요청이 처리되었습니다' }
        return JsonResponse(response_data)
    
class listDel(APIView) :
    def delete(self, request, idx) :
        acc = Account.objects.filter(id = idx)
        acc.delete()

        response_data = { 'msg': '요청이 처리되었습니다' }
        return JsonResponse(response_data)
    
class listUpd(APIView) :
    def put(self, request, idx) :
        data = json.loads(request.body)

        acc = Account.objects.get(id = idx)
        acc.userpw = data['userpw']
        acc.save()        

        response_data = { 'msg': '요청이 처리되었습니다' }
        return JsonResponse(response_data)
