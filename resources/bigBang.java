import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.util.*;

public class bigBang 
{

    public bigBang()
    {
        SolarSystem sol = new SolarSystem(750,750);

        sol.drawSolarObject(0,0,150,"YELLOW");
        sol.drawSolarObject(200,180,20,"YELLOW");    
    }

    public static void main(String[]args)
    {
        bigBang ltbl = new bigBang ();
        
        
        // sol.finishedDrawing();
    }
    

}