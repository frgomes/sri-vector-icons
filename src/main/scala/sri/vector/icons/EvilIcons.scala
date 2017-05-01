package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactElement}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.|

object EvilIcons {

  @inline
  def apply(
      name: OptionalParam[EvilIconsName] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      color: OptionalParam[String] = OptDefault,
      size: OptionalParam[Double | Int] = OptDefault
  ): ReactElement = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    CreateElementJS[EvilIconsComponent.type](EvilIconsComponent, p)
  }
}

@js.native
@JSImport("react-native-vector-icons/EvilIcons", JSImport.Default)
object EvilIconsComponent extends JSComponent[js.Object] {}

@ScalaJSDefined
trait EvilIconsName extends js.Object

object EvilIconsList {
  @inline def ARCHIVE = "archive".asInstanceOf[EvilIconsName]
  @inline def ARROW_DOWN = "arrow-down".asInstanceOf[EvilIconsName]
  @inline def ARROW_LEFT = "arrow-left".asInstanceOf[EvilIconsName]
  @inline def ARROW_RIGHT = "arrow-right".asInstanceOf[EvilIconsName]
  @inline def ARROW_UP = "arrow-up".asInstanceOf[EvilIconsName]
  @inline def BELL = "bell".asInstanceOf[EvilIconsName]
  @inline def CALENDAR = "calendar".asInstanceOf[EvilIconsName]
  @inline def CAMERA = "camera".asInstanceOf[EvilIconsName]
  @inline def CART = "cart".asInstanceOf[EvilIconsName]
  @inline def CHART = "chart".asInstanceOf[EvilIconsName]
  @inline def CHECK = "check".asInstanceOf[EvilIconsName]
  @inline def CHEVRON_DOWN = "chevron-down".asInstanceOf[EvilIconsName]
  @inline def CHEVRON_LEFT = "chevron-left".asInstanceOf[EvilIconsName]
  @inline def CHEVRON_RIGHT = "chevron-right".asInstanceOf[EvilIconsName]
  @inline def CHEVRON_UP = "chevron-up".asInstanceOf[EvilIconsName]
  @inline def CLOCK = "clock".asInstanceOf[EvilIconsName]
  @inline def CLOSE = "close".asInstanceOf[EvilIconsName]
  @inline def CLOSE_O = "close-o".asInstanceOf[EvilIconsName]
  @inline def COMMENT = "comment".asInstanceOf[EvilIconsName]
  @inline def CREDIT_CARD = "credit-card".asInstanceOf[EvilIconsName]
  @inline def ENVELOPE = "envelope".asInstanceOf[EvilIconsName]
  @inline def EXCLAMATION = "exclamation".asInstanceOf[EvilIconsName]
  @inline def EXTERNAL_LINK = "external-link".asInstanceOf[EvilIconsName]
  @inline def EYE = "eye".asInstanceOf[EvilIconsName]
  @inline def GEAR = "gear".asInstanceOf[EvilIconsName]
  @inline def HEART = "heart".asInstanceOf[EvilIconsName]
  @inline def IMAGE = "image".asInstanceOf[EvilIconsName]
  @inline def LIKE = "like".asInstanceOf[EvilIconsName]
  @inline def LINK = "link".asInstanceOf[EvilIconsName]
  @inline def LOCATION = "location".asInstanceOf[EvilIconsName]
  @inline def LOCK = "lock".asInstanceOf[EvilIconsName]
  @inline def MINUS = "minus".asInstanceOf[EvilIconsName]
  @inline def NAVICON = "navicon".asInstanceOf[EvilIconsName]
  @inline def PAPERCLIP = "paperclip".asInstanceOf[EvilIconsName]
  @inline def PENCIL = "pencil".asInstanceOf[EvilIconsName]
  @inline def PLAY = "play".asInstanceOf[EvilIconsName]
  @inline def PLUS = "plus".asInstanceOf[EvilIconsName]
  @inline def POINTER = "pointer".asInstanceOf[EvilIconsName]
  @inline def QUESTION = "question".asInstanceOf[EvilIconsName]
  @inline def REDO = "redo".asInstanceOf[EvilIconsName]
  @inline def REFRESH = "refresh".asInstanceOf[EvilIconsName]
  @inline def RETWEET = "retweet".asInstanceOf[EvilIconsName]
  @inline def SC_FACEBOOK = "sc-facebook".asInstanceOf[EvilIconsName]
  @inline def SC_GITHUB = "sc-github".asInstanceOf[EvilIconsName]
  @inline def SC_GOOGLE_PLUS = "sc-google-plus".asInstanceOf[EvilIconsName]
  @inline def SC_INSTAGRAM = "sc-instagram".asInstanceOf[EvilIconsName]
  @inline def SC_LINKEDIN = "sc-linkedin".asInstanceOf[EvilIconsName]
  @inline def SC_ODNOKLASSNIKI = "sc-odnoklassniki".asInstanceOf[EvilIconsName]
  @inline def SC_PINTEREST = "sc-pinterest".asInstanceOf[EvilIconsName]
  @inline def SC_SKYPE = "sc-skype".asInstanceOf[EvilIconsName]
  @inline def SC_SOUNDCLOUD = "sc-soundcloud".asInstanceOf[EvilIconsName]
  @inline def SC_TELEGRAM = "sc-telegram".asInstanceOf[EvilIconsName]
  @inline def SC_TUMBLR = "sc-tumblr".asInstanceOf[EvilIconsName]
  @inline def SC_TWITTER = "sc-twitter".asInstanceOf[EvilIconsName]
  @inline def SC_VIMEO = "sc-vimeo".asInstanceOf[EvilIconsName]
  @inline def SC_VK = "sc-vk".asInstanceOf[EvilIconsName]
  @inline def SC_YOUTUBE = "sc-youtube".asInstanceOf[EvilIconsName]
  @inline def SEARCH = "search".asInstanceOf[EvilIconsName]
  @inline def SHARE_APPLE = "share-apple".asInstanceOf[EvilIconsName]
  @inline def SHARE_GOOGLE = "share-google".asInstanceOf[EvilIconsName]
  @inline def SPINNER = "spinner".asInstanceOf[EvilIconsName]
  @inline def SPINNER_2 = "spinner-2".asInstanceOf[EvilIconsName]
  @inline def SPINNER_3 = "spinner-3".asInstanceOf[EvilIconsName]
  @inline def STAR = "star".asInstanceOf[EvilIconsName]
  @inline def TAG = "tag".asInstanceOf[EvilIconsName]
  @inline def TRASH = "trash".asInstanceOf[EvilIconsName]
  @inline def TROPHY = "trophy".asInstanceOf[EvilIconsName]
  @inline def UNDO = "undo".asInstanceOf[EvilIconsName]
  @inline def UNLOCK = "unlock".asInstanceOf[EvilIconsName]
  @inline def USER = "user".asInstanceOf[EvilIconsName]
}
