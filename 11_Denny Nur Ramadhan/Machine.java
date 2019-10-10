package Kuis1;

/**
 *
 * @author Denuradhan
 */
public class Machine {
    int speed, increaseSpeed, reduceSpeed, maxspeed;
    boolean engine;
    
    public Machine(int increaseSpeed, int decreaseSpeed) {
        this.speed = 0;
        this.maxspeed = 430;
        this.engine = false;
        this.increaseSpeed = increaseSpeed;
        this.reduceSpeed = decreaseSpeed;
    }
    
    public void increaseSpeed() {
        if (speed>maxspeed) {
            System.out.println("Maximum Speed is "+getMax()+" Km/Hr");
            speed = maxspeed;
        }else{
            speed+=increaseSpeed;
        }
    }
    
    public void reduceSpeed() {
        if (speed<reduceSpeed) {
            System.out.println("Minimum Speed is 0 km/Hr");
            speed = 0;
        }else{
            speed-=reduceSpeed;
        }
    }
    
    public int getSpeed() {
        return speed;
    }
    
    public int getMaxSpeed() {
        return increaseSpeed;
    }
    
    public int getMinSpeed() {
        return reduceSpeed;
    }
    
    public boolean isEngine() {
        return engine;
    }  

    public int getMax() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }   
}
