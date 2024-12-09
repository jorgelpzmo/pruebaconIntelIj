package miPaquete;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;


public class appPrueba {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("unidad-empresa");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        Departamento departamento = em.find(Departamento.class, 1);
        Empleado empleado = new Empleado("empNuevo", 40, departamento);
        tx.begin();
        em.persist(empleado);
        tx.commit();
        System.out.println(em.find(Empleado.class, empleado.getId()));



    }
}
