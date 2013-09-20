package com.sec.editor.glyph

import com.sec.editor.color.Color

class Glyph(t : String, c: Color) {
  val text:String = t;
  val color : Color = c;

  def output() {
    print("<font color='" + color + "'>" + text + "</font>");  //with color.
  }
}
