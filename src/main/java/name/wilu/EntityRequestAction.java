package name.wilu;

import javax.persistence.*;

@Entity
@Table(name = "approvable_request_action")
public class EntityRequestAction extends RequestAction {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType type;

    @OneToOne
    private Approvable approvable;

}
