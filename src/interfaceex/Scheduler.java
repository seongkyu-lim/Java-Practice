package interfaceex;

public interface Scheduler {

    // interface에선는 abstract안해줘도 됨.
    public void getNextCall();
    public void sendCallToAgent();

}
