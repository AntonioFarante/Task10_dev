package task10_dev.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Ticket {
    @Id
    @Column(name = "ticket_id")
    @GeneratedValue
    private long id;

    private long client_id;

    private long from_planet_id;

    private long to_planet_id;
}
