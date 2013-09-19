package com.sec.editor.color

object ColorAdapter {

  def decorate(text: String): String = {
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
    }

    if (color != null) {
      return "<font color='" + color + "'>" + text + "</font>";
    } else {
      return text;
    }
  }
}
