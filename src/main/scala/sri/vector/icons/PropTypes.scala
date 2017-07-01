package sri.vector.icons

import sri.mobile.components.android.{
  ToolbarAndroidProps,
  ToolbarAndroidAction
}

import scala.scalajs.js
import scala.scalajs.js.annotation.ScalaJSDefined
import scala.scalajs.js.|

@ScalaJSDefined
trait VectorIconsProps[N <: js.Object] extends js.Object {
  val size: js.UndefOr[Double | Int] = js.undefined
  val name: js.UndefOr[N] = js.undefined
  val color: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait VectorIconsButtonProps[N <: js.Object] extends VectorIconsProps[N] {
  val iconStyle: js.UndefOr[js.Any] = js.undefined
  val backgroundColor: js.UndefOr[String] = js.undefined
  val borderRadius: js.UndefOr[Double | Int] = js.undefined
  val onPress: js.UndefOr[js.Function] = js.undefined
}

@ScalaJSDefined
trait VectorIconsToolbarAndroidProps[N <: js.Object]
    extends ToolbarAndroidProps {
  val logoName: js.UndefOr[N] = js.undefined
  val navIconName: js.UndefOr[N] = js.undefined
  val overflowIconName: js.UndefOr[N] = js.undefined
  val iconSize: js.UndefOr[Double | Int] = js.undefined
  val iconColor: js.UndefOr[String] = js.undefined
}

@ScalaJSDefined
trait VectorIconsToolbarAndroidAction[N <: js.Object]
    extends ToolbarAndroidAction {
  val iconName: js.UndefOr[N] = js.undefined
  val iconSize: js.UndefOr[Double | Int] = js.undefined
  val iconColor: js.UndefOr[String] = js.undefined
}
