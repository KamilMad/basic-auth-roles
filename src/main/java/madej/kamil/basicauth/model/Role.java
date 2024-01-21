package madej.kamil.basicauth.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "roles")
@RequiredArgsConstructor
@Getter
@Setter
public class Role {

    @Id
    private long id;

    private String name;

    @ManyToMany(mappedBy = "roles")
    Set<User> users;;
}
