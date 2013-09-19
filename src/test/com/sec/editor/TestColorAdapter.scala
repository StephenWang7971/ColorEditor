package test.com.sec.editor

import com.sec.scalaunit.assertion.ScalaUnit
import com.sec.scalaunit.annotation.{Test, TestCase}
import com.sec.editor.color.ColorAdapter

@Test
class TestColorAdapter extends ScalaUnit {
  @TestCase
  def testKeyword() {
    val text: String = ColorAdapter.decorate("dwell");
    assertThat(text).isEqualTo("<font color='#FF0000'>dwell</font>")
  }

  @TestCase
  def testKeywordWithSymbol() {
    val text: String = ColorAdapter.decorate("future.");
    assertThat(text).isEqualTo("future.")
  }

  @TestCase
  def testCommonWord() {
    val text: String = ColorAdapter.decorate("default");
    assertThat(text).isEqualTo("default")
  }
}
