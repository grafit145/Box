public class User implements Runnable {

    Toggle toggle = Toggle.toggle;
    private final int WAITTIME = 2000;

    public void setToggle() {
        try {
            Thread.sleep(WAITTIME);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Тумблер включен");
        toggle.setStatus(ToggleSwitch.ON);
    }
    @Override
    public void run(){
        for(int i = 0; i < 4; i++){
            setToggle();
        }
    }


}
