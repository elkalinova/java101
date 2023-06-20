package sk.tuke.kpi.oop.game;

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

public class Reactor extends AbstractActor {
    private int temperature;
    private boolean state;
    private int damage;
    private Animation normalAnimation;
    public Reactor() {
        temperature = 0;
        state = false;
        damage = 0;
        normalAnimation = new Animation("sprites/reactor_on.png", 80,80, 0.1F, Animation.PlayMode.LOOP_PINGPONG);
        setAnimation(normalAnimation);
    }
    public int getTemperature()
        { return temperature;}
    public int getDamage()
    { return damage;}

    public void increaseTemperature(int increment)
    { temperature += increment;
        if (temperature=>2000 && temperature=<6000)
            int damage = temperature/40 - 50;
        if (damage < damage)
         damage = damage;


    }
}
