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
package wjd.amb;

import wjd.amb.control.EUpdateResult;
import wjd.amb.control.IInput;
import wjd.amb.lwjgl.LWJGLAmbition;
import wjd.amb.view.ICanvas;
import wjd.math.V2;

/**
 * Minimal code from running LWJGL Ambition.
 *
 * @author wdyce
 * @since Dec 10, 2012
 */
public class LWJGLMain 
{
  /* MAIN */
  public static void main(String args[])
  {
    LWJGLAmbition.launch("LWJGL Ambition", null, new AScene() 
    {
      @Override
      public EUpdateResult processKeyPress(IInput.KeyPress event)
      {
        // exit if esc is pressed
        if(event.key == IInput.EKeyCode.ESC)
          return EUpdateResult.EXIT;
        else
          return EUpdateResult.CONTINUE;
      }
      
      @Override
      public EUpdateResult update(int t_delta)
      {
        // do nothing and repeat
        return EUpdateResult.CONTINUE;
      }

      @Override
      public void render(ICanvas canvas)
      {
        canvas.clear();
        canvas.text("Hello World!", V2.ORIGIN);
      }
    }, null);
  }
}
