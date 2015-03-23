package name.wilu.requestaction;

import name.wilu.request.ApprovableRequest;
import name.wilu.workflow.Approvable;

import javax.persistence.*;

@Entity
@Table(name = "approvable_request_action")
public class ApprovableRequestAction extends RequestAction {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType action;

    @OneToOne
    private Approvable approvable;

    @ManyToOne
    private ApprovableRequest request;

    public void setApprovable(Approvable approvable) {
        this.approvable = approvable;
    }

    public void setRequest(ApprovableRequest request) {
        this.request = request;
    }

    public void setAction(ActionType action) {
        this.action = action;
    }
}
