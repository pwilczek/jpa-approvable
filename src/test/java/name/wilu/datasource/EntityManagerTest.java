package name.wilu.datasource;

import name.wilu.common.RequestDetail;
import name.wilu.request.ApprovableRequest;
import name.wilu.request.RequestStatus;
import name.wilu.requestaction.ActionType;
import name.wilu.requestaction.ApprovableRequestAction;
import name.wilu.requestaction.RequestAction;
import name.wilu.workflow.Approvable;
import org.hamcrest.CoreMatchers;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import java.beans.PropertyVetoException;
import java.sql.SQLException;
import java.util.Date;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfiguration.class, JpaConfiguration.class})
public class EntityManagerTest {

    @PersistenceContext
    EntityManager em;

    @Test
    @Transactional
    public void shouldInjectPersistenceContext() throws PropertyVetoException, SQLException {
        assertNotNull(em);
    }

    @Test
    @Transactional
    public void shouldCreateObjectsTree() {
        Approvable approvable = new Approvable();
        approvable.setActive(false);
        em.persist(approvable);
        //
        RequestDetail details = new RequestDetail("wilu", new Date());
        ApprovableRequestAction action = new ApprovableRequestAction();
        action.setRequestDetail(details);
        action.setApprovable(approvable);
        action.setAction(ActionType.ADD);
        em.persist(action);
        //
        ApprovableRequest request = new ApprovableRequest();
        request.setRequestDetail(details);
        request.setRequestStatus(RequestStatus.SFA);
        request.addRequestAction(action);
        em.persist(request);
    }
}
