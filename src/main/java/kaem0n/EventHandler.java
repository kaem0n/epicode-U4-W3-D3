package kaem0n;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import kaem0n.dao.EventDAO;
import kaem0n.entities.Event;
import kaem0n.entities.EventType;

import java.time.LocalDate;

public class EventHandler {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("eventhandler");
    public static void main(String[] args) {
        EntityManager em = emf.createEntityManager();
        EventDAO ed = new EventDAO(em);

//        ed.save(new Event("Metallica concert", LocalDate.now(), "World tour 2024", EventType.PUBLIC, 20000));
//        ed.save(new Event("Festival di Sanremo", LocalDate.parse("2024-02-10"), "Edizione 2024 del Festival di Sanremo", EventType.PRIVATE, 1800));
//        ed.getById(1);
//        ed.delete(1);

        em.close();
        emf.close();
    }
}
