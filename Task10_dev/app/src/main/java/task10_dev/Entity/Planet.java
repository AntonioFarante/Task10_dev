package task10_dev.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Planet {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @Column(name = "name", length = 500)
    private String name;
}
