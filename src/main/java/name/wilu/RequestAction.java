package name.wilu;

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


}
