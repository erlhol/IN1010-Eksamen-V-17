import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.ArrayList;
import java.util.concurrent.locks.Condition;
public class AnalyseBuffer {
    
    private Lock laas = new ReentrantLock();
    private Condition ikkeTomt = laas.newCondition();
    private ArrayList<Pasient> pasienter = new ArrayList<>();

    public void settInn(Pasient p) {
        laas.lock();
        try {
            pasienter.add(0,p);
            ikkeTomt.signal();
        }
        finally{
            laas.unlock();
        }
    }

    public Pasient hentUt() {
        laas.lock();
        try {
            while (pasienter.isEmpty()) {
                ikkeTomt.await();
            }
            return pasienter.remove(pasienter.size()-1);

        }
        catch(InterruptedException e) {
            System.out.println("Ble avbrutt!");
        }
        finally {
            laas.unlock();
        }
        return null;
    }
}
