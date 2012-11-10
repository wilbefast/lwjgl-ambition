/*
 Copyright (C) 2012 William James Dyce

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package wjd.amb.view;

import wjd.amb.resources.Graphic;
import wjd.math.Rect;
import wjd.math.V2;

/**
 *
 * @author wjd
 * @since jan-2012
 */
public class GraphicCanvas implements IVisible
{
  /* ATTRIBUTES */

  protected Graphic graphic;
  protected Rect dest;
  protected boolean flip = false;

  /* METHODS */
  
  // constructors
  public GraphicCanvas(Graphic init_graphic, Rect init_dest)
  {
    graphic = init_graphic;
    dest = init_dest;
  }
  
  // mutators
  public void setPosition(V2 new_position)
  {
    dest.pos(new_position);
    if (flip)
      dest.x -= dest.w;
  }

  public void setFlip(boolean new_flip)
  {
    if (new_flip == flip)
      return;

    flip = new_flip;
    dest.x += dest.w;
    dest.w *= -1;
  }

  /* IMPLEMENTS -- IVISIBLE */
  
  @Override
  public void render(ICanvas canvas)
  {
    
    // Grab the appropriate subimage
    /*Rect src = getSubrect();
    try
    {
      BufferedImage subimage = graphic.getImage().getSubimage(src.x, src.y,
                                                              src.width, src.height);
      // Draw it on the screen
      g2d.drawImage(subimage, dest.x, dest.y, dest.width, dest.height, null);
    }
    catch (java.awt.image.RasterFormatException e)
    {
      System.out.println("Problem with " + getSubrect());
    }*/
  }

  
  /* SUBROUTINES */
  
  protected Rect getSubrect()
  {
    // This is overriden for animated canvases
    return graphic.getFrame();
  }
}
