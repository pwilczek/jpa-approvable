package name.wilu.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class RequestDetail {

    @Column(name = "user_name", nullable = false)
    private String user;

    @Column
    @Temporal(TemporalType.DATE)
    private Date created;

}
