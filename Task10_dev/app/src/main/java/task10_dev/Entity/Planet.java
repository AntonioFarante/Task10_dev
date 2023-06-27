package task10_dev.Entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.Pattern;

@Data
@Entity
public class Planet {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column()
    private long id;

    @Column(name = "name", length = 500)
    @Pattern(regexp = "^[A-Z0-9]+$")
    private String name;
}
