public class Sleeper extends Thread{
    
    private int sleepFor;
    private boolean doneSleeping;
    private final int DELTA = 1;

    public Sleeper(int num){
        this.sleepFor = num;
        this.doneSleeping = false;
    }

    @Override
    public void run(){
        
        try{
            Thread.sleep(sleepFor * this.DELTA);
        }
        catch(InterruptedException e){
            //ignore
        }
        this.doneSleeping = true;
        

    }


    public int getNum(){

        if(!this.doneSleeping){
            return -1;
        }

        //System.out.println("my value: " + this.sleepFor);

        return this.sleepFor;

    }
}
