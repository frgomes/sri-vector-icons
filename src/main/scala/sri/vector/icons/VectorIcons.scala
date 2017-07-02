package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactElement, ReactNode}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam, exclude}
import sri.universal.MergeJSObjects
import sri.mobile.components.android.ToolbarAndroidActionShow

import scala.scalajs.js
import scala.scalajs.js.JSConverters.genTravConvertible2JSRichGenTrav
import scala.scalajs.js.|

@js.native
trait VectorIconsComponent[N <: js.Object]
    extends JSComponent[VectorIconsProps[N]] {

  val Button: JSComponent[VectorIconsButtonProps[N]] =
    js.native
  val ToolbarAndroid: JSComponent[VectorIconsToolbarAndroidProps[N]] =
    js.native
}

class VectorIcons[N <: js.Object](val icons: VectorIconsComponent[N]) {

  type IconProps = VectorIconsProps[N]
  type ButtonProps = VectorIconsButtonProps[N]
  type ToolbarAndroidProps = VectorIconsToolbarAndroidProps[N]
  type ToolbarAndroidAction = VectorIconsToolbarAndroidAction[N]

  @inline
  def apply(name: OptionalParam[N] = OptDefault,
            style: OptionalParam[js.Any] = OptDefault,
            color: OptionalParam[String] = OptDefault,
            size: OptionalParam[Double | Int] = OptDefault,
            @exclude extraProps: OptionalParam[IconProps] = OptDefault,
            @exclude key: String | Int = null,
            @exclude ref: js.Function1[icons.type, Unit] = null)
    : ReactElement { type Instance = icons.type } = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[icons.type](
      icons,
      props.asInstanceOf[IconProps],
      key,
      ref
    )
  }

  @inline
  def Button(style: OptionalParam[js.Any] = OptDefault,
             name: OptionalParam[N] = OptDefault,
             color: OptionalParam[String] = OptDefault,
             backgroundColor: OptionalParam[String] = OptDefault,
             size: OptionalParam[Double | Int] = OptDefault,
             @exclude extraProps: OptionalParam[ButtonProps] = OptDefault,
             @exclude key: String | Int = null,
             @exclude ref: js.Function1[icons.Button.type, Unit] = null)(
      children: ReactNode*)
    : ReactElement { type Instance = icons.Button.type } = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[icons.Button.type](
      icons.Button,
      props.asInstanceOf[ButtonProps],
      key,
      ref,
      children = children.toJSArray
    )
  }

  @inline
  def ToolbarAndroid(
      style: OptionalParam[js.Any] = OptDefault,
      actions: OptionalParam[js.Array[ToolbarAndroidAction]] = OptDefault,
      title: OptionalParam[String] = OptDefault,
      titleColor: OptionalParam[String] = OptDefault,
      subtitle: OptionalParam[String] = OptDefault,
      subtitleColor: OptionalParam[String] = OptDefault,
      logoName: OptionalParam[N] = OptDefault,
      navIconName: OptionalParam[N] = OptDefault,
      onActionSelected: OptionalParam[Int => _] = OptDefault,
      overflowIconName: OptionalParam[N] = OptDefault,
      iconSize: OptionalParam[Double | Int] = OptDefault,
      iconColor: OptionalParam[String] = OptDefault,
      onIconClicked: OptionalParam[js.Function] = OptDefault,
      @exclude extraProps: OptionalParam[ToolbarAndroidProps] = OptDefault,
      @exclude key: String | Int = null,
      @exclude ref: js.Function1[icons.ToolbarAndroid.type, Unit] = null)
    : ReactElement { type Instance = icons.ToolbarAndroid.type } = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val props = FunctionObjectMacro()
    extraProps.foreach(v => { MergeJSObjects(props, v) })
    CreateElementJS[icons.ToolbarAndroid.type](
      icons.ToolbarAndroid,
      props.asInstanceOf[ToolbarAndroidProps],
      key,
      ref)
  }

  @inline
  def ToolbarAndroidAction(title: String,
                           iconName: OptionalParam[N] = OptDefault,
                           show: OptionalParam[ToolbarAndroidActionShow] =
                             OptDefault,
                           showWithText: OptionalParam[Boolean] = OptDefault)
    : ToolbarAndroidAction = {
    val p = FunctionObjectMacro()
    p.asInstanceOf[ToolbarAndroidAction]
  }
}
