var count = 1;
var intervalID = null;

onmessage = function (e) {
    if (e.data == "start") {
        if (intervalID != null) return;
        intervalID = setInterval(myCallback, 1000);
    }
    else if (e.data == "stop") {
        if (intervalID == null) return;
        clearInterval(intervalID);
        close();
    }
}

function myCallback() {
    postMessage(count);
    count++;
}
