package sk.tuke.kpi.oop.game;

import sk.tuke.kpi.gamelib.framework.AbstractActor;
import sk.tuke.kpi.gamelib.graphics.Animation;

public class Reactor extends AbstractActor {
    private int temperature;
    private boolean state;
    private int damage;
    private Animation normalAnimation;
    public Reactor() {
        this.temperature = 0;
        this.state = false;
        this.damage = 0;
        this.normalAnimation = new Animation("sprites/reactor_on.png", 80,80, 0.1F, Animation.PlayMode.LOOP_PINGPONG);
        setAnimation(this.normalAnimation);
    }
    public int getTemperature()
        { return this.temperature;}
    public int getDamage()
    { return this.damage;}

    public void increaseTemperature(int increment)
    { this.temperature += increment;
        if(this.temperature >= 6000)
        {
            //zmena obr pri zmene teploty, vztvorili sme premennu animation, ktora ma typ Animation a len trocha inak nastavili, :) F je to float
            Animation animation = new Animation("sprites/reactor_broken.png", 80,80, 0.1F, Animation.PlayMode.LOOP_PINGPONG);
            setAnimation(animation); if(this.temperature < 4000 )
        {
            //zmena obr pri zmene teploty, vztvorili sme premennu animation, ktora ma typ Animation a len trocha inak nastavili, :) F je to float
            Animation animation = new Animation("sprites/reactor_on.png", 80,80, 0.1F, Animation.PlayMode.LOOP_PINGPONG);
            setAnimation(animation);

        }

        }
        else if(this.temperature >= 4000 && this.temperature < 6000 )
        {
            //zmena obr pri zmene teploty, vztvorili sme premennu animation, ktora ma typ Animation a len trocha inak nastavili, :) F je to float
            Animation animation = new Animation("sprites/reactor_hot.png", 80,80, 0.1F, Animation.PlayMode.LOOP_PINGPONG);
            setAnimation(animation);
        }


        }


    }


