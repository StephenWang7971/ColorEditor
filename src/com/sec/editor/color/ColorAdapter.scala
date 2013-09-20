package com.sec.editor.color

import com.sec.editor.glyph.Glyph

object ColorAdapter {

  //TODO find color from a map.
  def decorate(text: String): Glyph = {
    var color: Color = null;
    if (text.equals("dwell")) {
      color = ColorFlyweight.RED;
    } else if (text.equals("past")) {
      color = ColorFlyweight.ORANGE;
    } else if (text.equals("dream")) {
      color = ColorFlyweight.YELLOW;
    } else if (text.equals("future")) {
      color = ColorFlyweight.GREEN;
    } else if (text.equals("concentrate")) {
      color = ColorFlyweight.CYAN;
    } else if (text.equals("mind")) {
      color = ColorFlyweight.BLUE;
    } else if (text.equals("moment")) {
      color = ColorFlyweight.VIOLET;
    } else {
      color = ColorFlyweight.BLACK;
    }

    return new Glyph(text, color);
  }
}
