package org.teachingkidsprogramming.section07events;

import java.awt.Color;
import java.awt.Cursor;

import org.junit.Assert;
import org.junit.Test;
import org.teachingextensions.logo.Tortoise;
//This deepdive is in progress!

//@Ignore
public class DeepDive07Events
{
  //  How to do deep dive:
  //  Step 1: Select the method name (xxx on line xx) Press the Run Button
  //            PC: Ctrl+F11 
  //            Mac: Command+fn+F11
  //  Step 2: Read the name of the method that failed
  //  Step 3: Fill in the blank (___) to make it pass
  //  Step 4: Consider at least one thing you just learned
  //  Step 5: Advance to the next method
  //  Do not change anything except the blank (___)
  //
  //    concepts:
  //   events
  //   event listeners - right click 
  //   'this' - instance(s) - multiple Tortoises
  @Test
  public void concatenateString() throws Exception
  {
    //create a new string from the strings "happy " + "baby"
    String[] words = {"happy ", ___};
    Assert.assertEquals("happy baby", words);
  }
  /**
   * Ignore the following, It's needed to run the homework
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   * 
   */
  public boolean _____  = false;
  public boolean ______ = true;
  public String  ___    = "You need to fill in the blank ___";
  public int     ____   = 0;
  public Color   _______;
  public String ___()
  {
    return ___;
  }
  private Cursor getCursor()
  {
    Cursor cursor = Tortoise.getBackgroundWindow().getCursor();
    return cursor;
  }
}
