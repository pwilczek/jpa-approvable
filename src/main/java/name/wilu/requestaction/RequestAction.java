package name.wilu.requestaction;

import name.wilu.common.RequestDetail;

import javax.persistence.*;

@Entity
@Table(name = "request_action")
@Inheritance(strategy = InheritanceType.JOINED)
public class RequestAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;

    @Embedded
    protected RequestDetail requestDetail;

    public void setRequestDetail(RequestDetail requestDetail) {
        this.requestDetail = requestDetail;
    }
}
