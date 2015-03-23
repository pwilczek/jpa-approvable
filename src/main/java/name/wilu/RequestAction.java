package name.wilu;

import javax.persistence.*;

@Entity
@Table(name = "request_action")
public class RequestAction {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Embedded
    private RequestDetail requestDetail;


}
