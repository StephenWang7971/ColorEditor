package com.sec.editor.color

import com.sec.editor.glyph.Glyph

object ColorAdapter {

  val KEYWORDS = Map[String, Color] (
    "dwell" -> ColorFlyweight.RED,
    "past" -> ColorFlyweight.ORANGE,
    "dream" -> ColorFlyweight.YELLOW,
    "future" -> ColorFlyweight.GREEN,
    "concentrate" -> ColorFlyweight.CYAN,
    "mind" -> ColorFlyweight.BLUE,
    "moment" -> ColorFlyweight.VIOLET
  );

  def decorate(text: String): Glyph = {
    var color: Color = null;
    //TODO NOT GOOD
    if (KEYWORDS.get(text) == None) {
      color = ColorFlyweight.BLACK;
    } else {
      color = KEYWORDS.get(text).get;
    }

    return new Glyph(text, color);
  }
}
