package sk.tuke.kpi.oop.game;

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

public class Light extends AbstractActor {
    private Animation onAnimation;
    private Animation offAnimation;
    private boolean isOn;



    public Light() {
        this.isOn = false;
        this.onAnimation = new Animation("sprites/light_on.png");
        this.offAnimation = new Animation("sprites/light_off.png");
        setAnimation(offAnimation);

    }
   /* public void turnOn() {
        this.state = true;

        setAnimation(onAnimation);
    }
        public void turnOff() {
            this.state = false;

            setAnimation(offAnimation);
        }
    public boolean isOn(){
        return this.state;
    }*/

    public void toggle (){
        if(this.isOn){
            this.isOn = false;
            setAnimation(offAnimation);
        }


        else
        {this.isOn = true;
        setAnimation(onAnimation);
        }
    }
}
