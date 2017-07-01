package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactElement}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam, exclude}
import sri.universal.MergeJSObjects

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait VectorIconsComponent[N <: js.Object]
    extends JSComponent[VectorIconsProps[N]] {}

class VectorIcons[N <: js.Object](val icons: VectorIconsComponent[N]) {

  type IconProps = VectorIconsProps[N]

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
}
