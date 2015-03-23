package name.wilu.datasource;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.sql.DataSource;

import java.beans.PropertyVetoException;
import java.sql.SQLException;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {DataSourceConfiguration.class, JpaConfiguration.class})
public class EntityManagerTest {

    @PersistenceContext
    EntityManager em;

    @Test
    public void shouldInjectPersistenceContext() throws PropertyVetoException, SQLException {
        assertNotNull(em);
    }
}
