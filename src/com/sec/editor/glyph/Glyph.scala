package com.sec.editor.glyph

import com.sec.editor.color.Color

class Glyph(t: String, c: Color) {
  var text: String = t;
  var color: Color = c;

  def output() {
    text.foreach((t: Char) => GlyphFlyweight.get(t.toString).get.setColor(color).show());
  }

  def setColor(c: Color): Glyph = {
    color = c;
    return this;
  }

  def show() {
    val t1: String = text + "@" + color.toString();
    println(t1);
  }
}
