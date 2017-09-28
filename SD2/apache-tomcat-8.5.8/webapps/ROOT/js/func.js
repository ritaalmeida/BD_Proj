var webSocketNotification;

var notifications = document.getElementById("notifications");
var dropdownnotifications = document.getElementById("dropdownnotifications");

function add(divName,idDiv,idInput,nameInput)
{
    var newdiv = document.createElement('div');
    newdiv.id = idDiv;
    if(divName == 'ptype')
    {
        newdiv.innerHTML ="<input id="+idInput+" type='text' class='form-control' placeholder='Product Type' name="+nameInput+" required>";
    }
    if(divName == 'rwrd')
    {
        newdiv.innerHTML ="<input id="+idInput+" type='text' class='form-control' placeholder='Reward' name="+nameInput+" required>";
        newdiv.innerHTML += "<input id='valueReward' type='number' class='form-control' placeholder='100' name='ValueReward' required>";
    }
    document.getElementById(divName).appendChild(newdiv);
}

function openSocketNotification()
{
    if('WebSocket' in window)
    {
        webSocketNotification = new WebSocket('ws://'+window.location.host+'/notification');
        console.debug(webSocketNotification);
    }
    else if('MozWebSocket' in window)
    {
        webSocketNotification = new MozWebSocket('ws://'+window.location.host+'/notification');
        console.debug(webSocketNotification);
    }
    else
    {
        console.debug("Error: WebSocket is not supported by this browser!");
        return;
    }


    webSocketNotification.onopen = function(event)
    {
        console.debug("Socket Notification Opened!");
    };

    webSocketNotification.onmessage = function(event)
    {
       // showNotification(event.data);
        console.debug("Message" +  event.data);
    }

    webSocketNotification.onclose = function(event)
    {

    }
}

function showNotification(text)
{
    var url = document.URL;
    if(url.indexOf("projects") > -1 || url.indexOf("donate") > -1 || url.indexOf("sendmessage") > -1 || url.indexOf("editreward") > -1 || url.indexOf("sendreply") > -1)
    {
        var split = text.split(",");
        text = split[0];
        $('#userMoney').text('Available Money: ' + event.data);
        $('#currentAmount_'+split[1]).text('Current Amount: '+split[2]);
    }
    if(text.indexOf("you") > -1)
    {
        var newLi = document.createElement("LI");
        newLi.innerHTML = "<a>"+text+"</a>";
        notifications.appendChild(newLi);
        dropdownnotifications.className = "btn-warning";
    }
}

function makeBid(String )
{

}
function makeMessage ()
{

}
function writeConsole(text)
{
    console.log(text);
}
function saw(text)
{
    if(text == 'messages')
    {
        dropdownmessages.className = "";
    }
    else if(text == 'notifications')
    {
        dropdownnotifications.className = "";
    }
}

window.onload = openSocketNotification();;