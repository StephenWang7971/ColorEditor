package com.sec.editor.glyph

import com.sec.editor.color.ColorFlyweight

object GlyphFlyweight {

  val UPPER_A: Glyph = new Glyph("A", ColorFlyweight.BLACK);
  val UPPER_B: Glyph = new Glyph("B", ColorFlyweight.BLACK);
  val UPPER_C: Glyph = new Glyph("C", ColorFlyweight.BLACK);
  val UPPER_D: Glyph = new Glyph("D", ColorFlyweight.BLACK);
  val UPPER_E: Glyph = new Glyph("E", ColorFlyweight.BLACK);
  val UPPER_F: Glyph = new Glyph("F", ColorFlyweight.BLACK);
  val UPPER_G: Glyph = new Glyph("G", ColorFlyweight.BLACK);
  val UPPER_H: Glyph = new Glyph("H", ColorFlyweight.BLACK);
  val UPPER_I: Glyph = new Glyph("I", ColorFlyweight.BLACK);
  val UPPER_J: Glyph = new Glyph("J", ColorFlyweight.BLACK);
  val UPPER_K: Glyph = new Glyph("K", ColorFlyweight.BLACK);
  val UPPER_L: Glyph = new Glyph("L", ColorFlyweight.BLACK);
  val UPPER_M: Glyph = new Glyph("M", ColorFlyweight.BLACK);
  val UPPER_N: Glyph = new Glyph("N", ColorFlyweight.BLACK);
  val UPPER_O: Glyph = new Glyph("O", ColorFlyweight.BLACK);
  val UPPER_P: Glyph = new Glyph("P", ColorFlyweight.BLACK);
  val UPPER_Q: Glyph = new Glyph("Q", ColorFlyweight.BLACK);
  val UPPER_R: Glyph = new Glyph("R", ColorFlyweight.BLACK);
  val UPPER_S: Glyph = new Glyph("S", ColorFlyweight.BLACK);
  val UPPER_T: Glyph = new Glyph("T", ColorFlyweight.BLACK);
  val UPPER_U: Glyph = new Glyph("U", ColorFlyweight.BLACK);
  val UPPER_V: Glyph = new Glyph("V", ColorFlyweight.BLACK);
  val UPPER_W: Glyph = new Glyph("W", ColorFlyweight.BLACK);
  val UPPER_X: Glyph = new Glyph("X", ColorFlyweight.BLACK);
  val UPPER_Y: Glyph = new Glyph("Y", ColorFlyweight.BLACK);
  val UPPER_Z: Glyph = new Glyph("Z", ColorFlyweight.BLACK);

  val LOWER_A: Glyph = new Glyph("a", ColorFlyweight.BLACK);
  val LOWER_B: Glyph = new Glyph("b", ColorFlyweight.BLACK);
  val LOWER_C: Glyph = new Glyph("c", ColorFlyweight.BLACK);
  val LOWER_D: Glyph = new Glyph("d", ColorFlyweight.BLACK);
  val LOWER_E: Glyph = new Glyph("e", ColorFlyweight.BLACK);
  val LOWER_F: Glyph = new Glyph("f", ColorFlyweight.BLACK);
  val LOWER_G: Glyph = new Glyph("g", ColorFlyweight.BLACK);
  val LOWER_H: Glyph = new Glyph("h", ColorFlyweight.BLACK);
  val LOWER_I: Glyph = new Glyph("i", ColorFlyweight.BLACK);
  val LOWER_J: Glyph = new Glyph("j", ColorFlyweight.BLACK);
  val LOWER_K: Glyph = new Glyph("k", ColorFlyweight.BLACK);
  val LOWER_L: Glyph = new Glyph("l", ColorFlyweight.BLACK);
  val LOWER_M: Glyph = new Glyph("m", ColorFlyweight.BLACK);
  val LOWER_N: Glyph = new Glyph("n", ColorFlyweight.BLACK);
  val LOWER_O: Glyph = new Glyph("o", ColorFlyweight.BLACK);
  val LOWER_P: Glyph = new Glyph("p", ColorFlyweight.BLACK);
  val LOWER_Q: Glyph = new Glyph("q", ColorFlyweight.BLACK);
  val LOWER_R: Glyph = new Glyph("r", ColorFlyweight.BLACK);
  val LOWER_S: Glyph = new Glyph("s", ColorFlyweight.BLACK);
  val LOWER_T: Glyph = new Glyph("t", ColorFlyweight.BLACK);
  val LOWER_U: Glyph = new Glyph("u", ColorFlyweight.BLACK);
  val LOWER_V: Glyph = new Glyph("v", ColorFlyweight.BLACK);
  val LOWER_W: Glyph = new Glyph("w", ColorFlyweight.BLACK);
  val LOWER_X: Glyph = new Glyph("x", ColorFlyweight.BLACK);
  val LOWER_Y: Glyph = new Glyph("y", ColorFlyweight.BLACK);
  val LOWER_Z: Glyph = new Glyph("z", ColorFlyweight.BLACK);

  val SPACE: Glyph = new Glyph(" ", ColorFlyweight.BLACK);
  val COMMA: Glyph = new Glyph(",", ColorFlyweight.BLACK);
  val PERIOD: Glyph = new Glyph(".", ColorFlyweight.BLACK);

  val GLYPHS = Map[String, Glyph](
    "A" -> UPPER_A,
    "B" -> UPPER_B,
    "C" -> UPPER_C,
    "D" -> UPPER_D,
    "E" -> UPPER_E,
    "F" -> UPPER_F,
    "G" -> UPPER_G,
    "H" -> UPPER_H,
    "I" -> UPPER_I,
    "J" -> UPPER_J,
    "K" -> UPPER_K,
    "L" -> UPPER_L,
    "M" -> UPPER_M,
    "N" -> UPPER_N,
    "O" -> UPPER_O,
    "P" -> UPPER_P,
    "Q" -> UPPER_Q,
    "R" -> UPPER_R,
    "S" -> UPPER_S,
    "T" -> UPPER_T,
    "U" -> UPPER_U,
    "V" -> UPPER_V,
    "W" -> UPPER_W,
    "X" -> UPPER_X,
    "Y" -> UPPER_Y,
    "Z" -> UPPER_Z,


    "a" -> LOWER_A,
    "b" -> LOWER_B,
    "c" -> LOWER_C,
    "d" -> LOWER_D,
    "e" -> LOWER_E,
    "f" -> LOWER_F,
    "g" -> LOWER_G,
    "h" -> LOWER_H,
    "i" -> LOWER_I,
    "j" -> LOWER_J,
    "k" -> LOWER_K,
    "l" -> LOWER_L,
    "m" -> LOWER_M,
    "n" -> LOWER_N,
    "o" -> LOWER_O,
    "p" -> LOWER_P,
    "q" -> LOWER_Q,
    "r" -> LOWER_R,
    "s" -> LOWER_S,
    "t" -> LOWER_T,
    "u" -> LOWER_U,
    "v" -> LOWER_V,
    "w" -> LOWER_W,
    "x" -> LOWER_X,
    "y" -> LOWER_Y,
    "z" -> LOWER_Z,


    " " -> SPACE,
    "." -> PERIOD,
    "," -> COMMA);



  def get(text: String): Option[Glyph] = {
    return GLYPHS.get(text.toString);
  }

}
