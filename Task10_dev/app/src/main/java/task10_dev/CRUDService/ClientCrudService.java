package task10_dev.CRUDService;

import org.hibernate.Session;
import org.hibernate.Transaction;
import task10_dev.Entity.Client;


public class ClientCrudService {

    public void createNewClient(Session session, String name) {

        Transaction transaction = session.beginTransaction();
            Client newClient = new Client();
            newClient.setName(name);
            session.persist(newClient);
        transaction.commit();

        session.close();
    }

    public Client getClientById(Session session, long id) {
        Client client = session.get(Client.class, id);
        session.close();
        return client;
    }

    public Client updateClientById(Session session, long id, String name) {

        Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, id);
            client.setName(name);
            session.persist(client);
        transaction.commit();

        session.close();

        return client;
    }

    public void deleteClientById(Session session, long id) {
        Transaction transaction = session.beginTransaction();
            Client client = session.get(Client.class, id);
            session.remove(client);

        transaction.commit();

        session.close();
    }
}
