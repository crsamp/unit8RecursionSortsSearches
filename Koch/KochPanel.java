//********************************************************************
//  KochPanel.java       Author: Lewis/Loftus/Cocking
//
//  Represents a drawing surface on which to paint a Koch Snowflake.
//********************************************************************

import java.awt.*;
import javax.swing.JPanel;

public class KochPanel extends JPanel
{
   private final int PANEL_WIDTH = 1000;
   private final int PANEL_HEIGHT = 1000;

   private final double SQ = Math.sqrt(3.0) / 6;

   private int x1 = 500, y1 = 900;
   private int LEFTX = 60, LEFTY = 300;
   private int RIGHTX = 340, RIGHTY = 300;

   private int current; //current order

   //-----------------------------------------------------------------
   //  Sets the initial fractal order to the value specified.
   //-----------------------------------------------------------------
   public KochPanel (int currentOrder)
   {
      current = currentOrder;
      setBackground (Color.black);
      setPreferredSize (new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
   }

   //-----------------------------------------------------------------
   //  Draws the fractal recursively. Base case is an order of 1 for
   //  which a simple straight line is drawn. Otherwise three
   //  intermediate points are computed, and each line segment is
   //  drawn as a fractal.
   //-----------------------------------------------------------------
   public void drawFractal (int order, int x1, int y1,
                            Graphics page, double previousAngle,double length,double scalingFactor)
   {
      int deltaX, delta,x2,y2, x3, y3, x4, y4;
      double angle;

      if (order == 1)
      {
         x2 = x1;
         y2 = (int)(y1-(length));
         page.drawLine (x1, y1, x2, y2);
         
         
         order++;
         drawFractal(order, x2, y2, page, previousAngle, length, scalingFactor);
      }
      else
      {
         angle = 30+previousAngle;
         x3 = (int)(Math.sin(Math.toRadians(angle))*(length*scalingFactor)); //delta x delta y. add to the x points
         y3 = (int)(Math.cos(Math.toRadians(angle))*(length*scalingFactor));
         page.drawLine(x1,y1,x3,y3);
         double newLength = (length*(scalingFactor));
         if (newLength <2.0)
         {
             return;
            }
         order++;
         drawFractal(order, x3,y3,page, angle, newLength,scalingFactor);
         drawFractal(order, x3,y3,page, angle-30,newLength,scalingFactor);
      }
   }

   //-----------------------------------------------------------------
   //  Performs the initial calls to the drawFractal method.
   //-----------------------------------------------------------------
   public void paintComponent (Graphics page)
   {
      super.paintComponent (page);

      page.setColor (Color.green);

      drawFractal (1, x1, y1, page, 0, 100,.8);
      
   }

   //-----------------------------------------------------------------
   //  Sets the fractal order to the value specified.
   //-----------------------------------------------------------------
   public void setOrder (int order)
   {
      current = order;
   }

   //-----------------------------------------------------------------
   //  Returns the current order.
   //-----------------------------------------------------------------
   public int getOrder ()
   {
      return current;
   }
}
