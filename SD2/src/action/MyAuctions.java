package action;

import com.opensymphony.xwork2.ActionSupport;
import model.Auctions;
import model.SessionModel;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.Map;

/**
 * Created by ritaalmeida on 06/12/16.
 */
public class MyAuctions extends ActionSupport implements SessionAware {
    private static final long serialVersionUID = 1L;
    private Map<String, Object> session;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    public String execute() {
        SessionModel auction = getModel();
        session.remove("auctions");
        session.remove("ofnotification");
        if (auction.getRmiConnection() != null) {
            if (session.get("user") != null) {
                ArrayList<Auctions> auctions = null;
                    if ((auctions = auction.myAuctions(getModel().getUser().getName())) != null) {
                        session.put("auctions", auctions);
                        return "listauctions";
                    }
                    return "stay";
            }else{
                return "login";
            }
        }
        return "noservice";
    }

    public SessionModel getModel() {
        if (!session.containsKey("model")) {
            this.setSessionModel(new SessionModel());
        }
        return (SessionModel) session.get("model");
    }

    public void setSessionModel(SessionModel model) {
        this.session.put("model", model);
    }
}
