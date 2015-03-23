package name.wilu.request;

import name.wilu.requestaction.ApprovableRequestAction;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "approvable_request")
public class ApprovableRequest extends  Request{

    @OneToMany(mappedBy = "request")
    private Set<ApprovableRequestAction>requestActions = new HashSet();
}
