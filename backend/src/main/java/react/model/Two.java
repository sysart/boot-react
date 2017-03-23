package react.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "two")
public class Two {
  @Id
  private int id;
  private String name;

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }
}
