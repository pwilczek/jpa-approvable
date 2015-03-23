package name.wilu;

import javax.persistence.*;

@Entity
@Table(name = "approvable")
public class Approvable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private boolean active;


}
