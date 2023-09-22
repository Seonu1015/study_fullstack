from django.shortcuts import render, get_object_or_404
import requests
from .models import City

def index(request):
    url = 'http://api.openweathermap.org/data/2.5/weather?q={}&units=imperial&appid=287a1975eee8ad6b91676d15218be07b'

    cities = City.objects.all()
    weather_data = []
    for city in cities:
        city_weather = requests.get(url.format(city)).json()
        print(city_weather)

        weather = {
            'city' : city,
            'temperature' : round((city_weather['main']['temp']-32)*5/9, 1),
            'description' : city_weather['weather'][0]['description'],
            'icon' : city_weather['weather'][0]['icon']
        }
        weather_data.append(weather)

    context = {'weather_data' : weather_data}

    return render(request, 'weather/index.html', context)