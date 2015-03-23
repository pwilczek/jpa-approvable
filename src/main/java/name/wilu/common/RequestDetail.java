package name.wilu.common;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;

@Embeddable
public class RequestDetail {

    public RequestDetail() {
    }

    public RequestDetail(String user, Date created) {
        this.user = user;
        this.created = created;
    }

    @Column(name = "user_name", nullable = false)
    private String user;

    @Column
    @Temporal(TemporalType.DATE)
    private Date created;

}
