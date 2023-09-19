from urllib.request import urlopen
from urllib.parse import urlencode

url = "http://127.0.0.1:8888/cgi_bin/script.py"

data = {
    "name" : "이수진",
    "email" : "leesujin@example.com",
    "url" : "http://www.google.com",
}

encData = urlencode(data)
postData = encData.encode('ascii')

f = urlopen(url, postData)
print(f.read().decode('cp949'))