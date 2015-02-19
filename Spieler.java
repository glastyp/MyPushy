import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spieler here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Spieler extends Actor
{
    GreenfootSound schlag = new GreenfootSound("Schlag.wav");
    Mauer mauer;
    Kiste kiste;
    /**
     * Act - do whatever the Spieler wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.

        if(Greenfoot.isKeyDown("up"))
        {
            int x=0;
            int y=-1;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(0);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
            else
            {
                schlag.play();
            }
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            int x=-1;
            int y=0;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(270);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
            else
            {
                schlag.play();
            }
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            int x=+1;
            int y=0;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(90);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
            else
            {
                schlag.play();
            }
        }
        else if(Greenfoot.isKeyDown("down"))
        {
            int x=0;
            int y=+1;
            mauer = (Mauer) getOneObjectAtOffset (x,y, Mauer.class);
            setRotation(180);
            if(mauer==null)
            {
                kiste = (Kiste) getOneObjectAtOffset (x,y, Kiste.class);
                if(kiste==null)
                {
                    setLocation(getX()+x,getY()+y);
                }
                else
                {
                    if(kiste.nahe(x,y)==true)
                    {
                        setLocation(getX()+x,getY()+y);
                    }
                }
            }
            else
            {
                schlag.play();
            }
        }    
    }
}
