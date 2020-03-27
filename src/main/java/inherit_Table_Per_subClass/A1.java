package inherit_Table_Per_subClass;
import javax.persistence.*;
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class A1 {
    @Id
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
