package task10_dev.CRUDService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task10_dev.Entity.Client;
import task10_dev.Entity.Planet;

public class PlanetCrudService {

    public void createNewPlanet(Session session, String name) {

        Transaction transaction = session.beginTransaction();
        Planet newPlanet = new Planet();
        newPlanet.setName(name);
        session.persist(newPlanet);
        transaction.commit();

        session.close();
    }

    public Planet getPlanetById(Session session, long id) {
        Planet planet = session.get(Planet.class, id);
        session.close();
        return planet;
    }

    public Planet updatePlanetById(Session session, long id, String name) {

        Transaction transaction = session.beginTransaction();
        Planet planet = session.get(Planet.class, id);
        planet.setName(name);
        session.persist(planet);
        transaction.commit();

        session.close();

        return planet;
    }

    public void deletePlanetById(Session session, long id) {
        Transaction transaction = session.beginTransaction();
        Planet planet = session.get(Planet.class, id);
        session.remove(planet);

        transaction.commit();

        session.close();
    }
}
