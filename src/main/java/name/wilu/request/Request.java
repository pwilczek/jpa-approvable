package name.wilu.request;

import name.wilu.common.RequestDetail;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Request {

    @Id
    @GeneratedValue
    protected Long id;

    @Embedded
    protected RequestDetail requestDetail;

    @Enumerated(EnumType.STRING)
    @Column(name="request_status", nullable = false)
    protected RequestStatus requestStatus;

}
