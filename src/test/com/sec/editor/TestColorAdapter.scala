package test.com.sec.editor

import com.sec.scalaunit.assertion.ScalaUnit
import com.sec.scalaunit.annotation.{Test, TestCase}
import com.sec.editor.color.{ColorFlyweight, ColorAdapter}
import com.sec.editor.glyph.Glyph

@Test
class TestColorAdapter extends ScalaUnit {
  @TestCase
  def testKeyword() {
    val text: Glyph = ColorAdapter.decorate("dwell");
    assertThat(text).isEqualTo(new Glyph("dwell", ColorFlyweight.RED));
  }

  @TestCase
  def testKeywordWithSymbol() {
    val text: Glyph = ColorAdapter.decorate("future.");
    assertThat(text).isEqualTo(new Glyph("future", ColorFlyweight.BLACK));
  }

  @TestCase
  def testCommonWord() {
    val text: Glyph = ColorAdapter.decorate("default");
    assertThat(text).isEqualTo(new Glyph("default", ColorFlyweight.BLACK));
  }
}
