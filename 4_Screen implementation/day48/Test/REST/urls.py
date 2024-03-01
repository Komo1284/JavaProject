# 설치 목록)
# pip install django~=3.2
# pip install djangorestframework
# pip install django-cors-headers

from django.contrib import admin
from django.urls import path, include
from . import views

urlpatterns = [
    path('', views.listAll.as_view()),
    path('<int:idx>/', views.listOne.as_view()),
    path('add/', views.listAdd.as_view()),
    path('delete/<int:idx>/', views.listDel.as_view()),
    path('put/<int:idx>/', views.listUpd.as_view()),
]
