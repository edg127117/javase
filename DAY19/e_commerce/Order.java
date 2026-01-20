package E_commerce;

import java.util.Queue;

public class Order {
    private String ID;
    private Queue<String> startProcess;
    private Queue<String> endProcess;

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Queue<String> getStartProcess() {
        return startProcess;
    }

    public void setStartProcess(Queue<String> startProcess) {
        this.startProcess = startProcess;
    }

    public Queue<String> getEndProcess() {
        return endProcess;
    }

    public void setEndProcess(Queue<String> endProcess) {
        this.endProcess = endProcess;
    }
}
