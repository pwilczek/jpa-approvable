package name.wilu.requestaction;

import name.wilu.workflow.Approvable;

import javax.persistence.*;

@Entity
@Table(name = "approvable_request_action")
public class ApprovableRequestAction extends RequestAction {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType type;

    @OneToOne
    private Approvable approvable;

}
