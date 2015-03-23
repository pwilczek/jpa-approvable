package name.wilu;

import javax.persistence.*;

@Entity
@Table(name = "entity_request_action")
public class EntityRequestAction extends RequestAction {

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ActionType type;

}
