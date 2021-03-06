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
package wjd.amb.lwjgl;

import org.newdawn.slick.openal.Audio;
import wjd.amb.resources.ISound;

/**
 *
 * @author wdyce
 * @since Nov 10, 2012
 */
class LWJGLSound implements ISound 
{
  /* ATTRIBUTES */
  private Audio lwjgl_audio;
  
  
  /* METHODS */

  // constructors
  LWJGLSound(Audio lwjgl_audio)
  {
    this.lwjgl_audio = lwjgl_audio;
  }
  
  // accessors

  // mutators
}
