package websockets;

import model.SessionModel;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

import javax.servlet.http.HttpSession;
import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;

@ServerEndpoint(value = "/notification",configurator = HandShake.class)
public class Notification
{
    private SessionModel user;
    private Session session;
    private HttpSession httpSession;
    private static Set<Notification> connections = new CopyOnWriteArraySet<Notification>();

    @OnOpen
    public void onOpen(Session session, EndpointConfig config)
    {
        this.session = session;
        this.httpSession = (HttpSession)config.getUserProperties().get(HttpSession.class.getName());
        connections.add(this);
        this.user = (SessionModel)httpSession.getAttribute("user");
       // notifyWait();
    }

    @OnClose
    public void onClose()
    {
        connections.remove(this);
    }

    @OnMessage
    public void onMessage(String text)
    {
        String split[] = text.split(" ");
        int type = Integer.parseInt(split[0]);
        int auction = Integer.parseInt(split[1]);
        String username = user.getUser().getName();
        verifyNotification(type,auction);

    }

    public void verifyNotification(int type, int auction)
    {
        /*if(type == 1) // bid
        {
            this.user.getUser()..
        }
        else if(type == 2) //message
        {

        }*/
    }
    public void notifyWait()
    {
      /*  for(Notification client:connections)
        {
            if(user == null || user.getWaitNotifications()==null)
            {
                return;
            }
            for(int i=0;i<user.getWaitNotifications().size();i++)
            {
                try
                {
                    synchronized (client)
                    {
                        if (client.user.getUser().getName().matches(user.getWaitNotifications().get(i).getUsername()))
                        {
                            client.session.getBasicRemote().sendText(user.getWaitNotifications().get(i).getMessage());
                            user.getWaitNotifications().remove(i);
                            user.removeWaitNotification(i);
                            i--;
                        }
                    }
                }
                catch(IOException e)
                {
                    connections.remove(client);
                    try
                    {
                        client.session.close();
                    }
                    catch (IOException e1)
                    {
                        System.err.println("IO Exception: "+e1);
                    }
                }
            }

        }*/
    }

    public void notifyMsg( String msg)
    {
        System.out.println(msg);

        try {
            for(Notification client:connections)
                client.session.getBasicRemote().sendText(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }

       /* for(Notification client:connections)
        {
            try
            {
                boolean send = false;
                Auctions project = client.user.detailAuction(projectID);
                synchronized (client)
                {
                    if (client.user.getUser().getName().matches(user))
                    {
                        client.session.getBasicRemote().sendText(user.getWaitNotifications().get(i).getMessage());ceived a pledge of value € from "+this.user.getUser().getName()+","+projectID+",Amount:"+(project.getAmount()));
                        send = true;
                    }
                    else
                    {
                        client.session.getBasicRemote().sendText(","+projectID+","+(project.getAmount()));
                    }
                }
                if(send == false)
                {
                    this.user.addWaitNotification(user,"You have received a pledge of value € from "+this.user.getUser().getName());
                }
            }
            catch(IOException e)
            {
                connections.remove(client);
                try
                {
                    client.session.close();
                }
                catch (IOException e1)
                {
                    System.err.println("IO Exception: "+e1);
                }
            }
        }*/
    }
}