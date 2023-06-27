package task10_dev.Entity;

import jakarta.persistence.*;
import lombok.Data;

@Table(name = "client")
@Data
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", length = 200)
    private String name;
}
