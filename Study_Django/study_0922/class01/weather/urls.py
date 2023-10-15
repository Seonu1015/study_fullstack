from django.urls import path
from .views import IndexView, DetailView

urlpatterns = [
    path('', IndexView.as_view()),    
    path('detail/<int:city_id>/', DetailView.as_view(), name='detail'),
]


# 함수형

# from django.urls import path
# from weather import views

# app_name = 'weather'

# urlpatterns = [
#     path('', views.index),
#     path('detail/<int:city_id>/', views.detail, name='detail'),
# ]