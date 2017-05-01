package sri.vector.icons

import sri.core.{CreateElementJS, JSComponent, ReactElement}
import sri.macros.{FunctionObjectMacro, OptDefault, OptionalParam}

import scala.scalajs.js
import scala.scalajs.js.annotation.{JSImport, ScalaJSDefined}
import scala.scalajs.js.|

object Ionicons {

  @inline
  def apply(
      name: OptionalParam[IoniconsName] = OptDefault,
      style: OptionalParam[js.Any] = OptDefault,
      color: OptionalParam[String] = OptDefault,
      size: OptionalParam[Double | Int] = OptDefault
  ): ReactElement = {
    import sri.universal.DangerousUnionToJSAnyImplicit._
    val p = FunctionObjectMacro()
    CreateElementJS[IoniconsComponent.type](IoniconsComponent, p)
  }
}

@js.native
@JSImport("react-native-vector-icons/Ionicons", JSImport.Default)
object IoniconsComponent extends JSComponent[js.Object] {}

@ScalaJSDefined
trait IoniconsName extends js.Object

object IoniconsList {
  @inline def IOS_ADD = "ios-add".asInstanceOf[IoniconsName]
  @inline def IOS_ADD_CIRCLE = "ios-add-circle".asInstanceOf[IoniconsName]
  @inline def IOS_ADD_CIRCLE_OUTLINE =
    "ios-add-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ADD_OUTLINE = "ios-add-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ALARM = "ios-alarm".asInstanceOf[IoniconsName]
  @inline def IOS_ALARM_OUTLINE =
    "ios-alarm-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ALBUMS = "ios-albums".asInstanceOf[IoniconsName]
  @inline def IOS_ALBUMS_OUTLINE =
    "ios-albums-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ALERT = "ios-alert".asInstanceOf[IoniconsName]
  @inline def IOS_ALERT_OUTLINE =
    "ios-alert-outline".asInstanceOf[IoniconsName]
  @inline def IOS_AMERICAN_FOOTBALL =
    "ios-american-football".asInstanceOf[IoniconsName]
  @inline def IOS_AMERICAN_FOOTBALL_OUTLINE =
    "ios-american-football-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ANALYTICS = "ios-analytics".asInstanceOf[IoniconsName]
  @inline def IOS_ANALYTICS_OUTLINE =
    "ios-analytics-outline".asInstanceOf[IoniconsName]
  @inline def IOS_APERTURE = "ios-aperture".asInstanceOf[IoniconsName]
  @inline def IOS_APERTURE_OUTLINE =
    "ios-aperture-outline".asInstanceOf[IoniconsName]
  @inline def IOS_APPS = "ios-apps".asInstanceOf[IoniconsName]
  @inline def IOS_APPS_OUTLINE = "ios-apps-outline".asInstanceOf[IoniconsName]
  @inline def IOS_APPSTORE = "ios-appstore".asInstanceOf[IoniconsName]
  @inline def IOS_APPSTORE_OUTLINE =
    "ios-appstore-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARCHIVE = "ios-archive".asInstanceOf[IoniconsName]
  @inline def IOS_ARCHIVE_OUTLINE =
    "ios-archive-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_BACK = "ios-arrow-back".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_BACK_OUTLINE =
    "ios-arrow-back-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DOWN = "ios-arrow-down".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DOWN_OUTLINE =
    "ios-arrow-down-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPDOWN =
    "ios-arrow-dropdown".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPDOWN_CIRCLE =
    "ios-arrow-dropdown-circle".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPDOWN_CIRCLE_OUTLINE =
    "ios-arrow-dropdown-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPDOWN_OUTLINE =
    "ios-arrow-dropdown-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPLEFT =
    "ios-arrow-dropleft".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPLEFT_CIRCLE =
    "ios-arrow-dropleft-circle".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPLEFT_CIRCLE_OUTLINE =
    "ios-arrow-dropleft-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPLEFT_OUTLINE =
    "ios-arrow-dropleft-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPRIGHT =
    "ios-arrow-dropright".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPRIGHT_CIRCLE =
    "ios-arrow-dropright-circle".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPRIGHT_CIRCLE_OUTLINE =
    "ios-arrow-dropright-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPRIGHT_OUTLINE =
    "ios-arrow-dropright-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPUP = "ios-arrow-dropup".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPUP_CIRCLE =
    "ios-arrow-dropup-circle".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPUP_CIRCLE_OUTLINE =
    "ios-arrow-dropup-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_DROPUP_OUTLINE =
    "ios-arrow-dropup-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_FORWARD =
    "ios-arrow-forward".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_FORWARD_OUTLINE =
    "ios-arrow-forward-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_BACK =
    "ios-arrow-round-back".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_BACK_OUTLINE =
    "ios-arrow-round-back-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_DOWN =
    "ios-arrow-round-down".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_DOWN_OUTLINE =
    "ios-arrow-round-down-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_FORWARD =
    "ios-arrow-round-forward".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_FORWARD_OUTLINE =
    "ios-arrow-round-forward-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_UP =
    "ios-arrow-round-up".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_ROUND_UP_OUTLINE =
    "ios-arrow-round-up-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_UP = "ios-arrow-up".asInstanceOf[IoniconsName]
  @inline def IOS_ARROW_UP_OUTLINE =
    "ios-arrow-up-outline".asInstanceOf[IoniconsName]
  @inline def IOS_AT = "ios-at".asInstanceOf[IoniconsName]
  @inline def IOS_AT_OUTLINE = "ios-at-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ATTACH = "ios-attach".asInstanceOf[IoniconsName]
  @inline def IOS_ATTACH_OUTLINE =
    "ios-attach-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BACKSPACE = "ios-backspace".asInstanceOf[IoniconsName]
  @inline def IOS_BACKSPACE_OUTLINE =
    "ios-backspace-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BARCODE = "ios-barcode".asInstanceOf[IoniconsName]
  @inline def IOS_BARCODE_OUTLINE =
    "ios-barcode-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BASEBALL = "ios-baseball".asInstanceOf[IoniconsName]
  @inline def IOS_BASEBALL_OUTLINE =
    "ios-baseball-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BASKET = "ios-basket".asInstanceOf[IoniconsName]
  @inline def IOS_BASKET_OUTLINE =
    "ios-basket-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BASKETBALL = "ios-basketball".asInstanceOf[IoniconsName]
  @inline def IOS_BASKETBALL_OUTLINE =
    "ios-basketball-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_CHARGING =
    "ios-battery-charging".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_CHARGING_OUTLINE =
    "ios-battery-charging-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_DEAD = "ios-battery-dead".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_DEAD_OUTLINE =
    "ios-battery-dead-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_FULL = "ios-battery-full".asInstanceOf[IoniconsName]
  @inline def IOS_BATTERY_FULL_OUTLINE =
    "ios-battery-full-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BEAKER = "ios-beaker".asInstanceOf[IoniconsName]
  @inline def IOS_BEAKER_OUTLINE =
    "ios-beaker-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BEER = "ios-beer".asInstanceOf[IoniconsName]
  @inline def IOS_BEER_OUTLINE = "ios-beer-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BICYCLE = "ios-bicycle".asInstanceOf[IoniconsName]
  @inline def IOS_BICYCLE_OUTLINE =
    "ios-bicycle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BLUETOOTH = "ios-bluetooth".asInstanceOf[IoniconsName]
  @inline def IOS_BLUETOOTH_OUTLINE =
    "ios-bluetooth-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BOAT = "ios-boat".asInstanceOf[IoniconsName]
  @inline def IOS_BOAT_OUTLINE = "ios-boat-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BODY = "ios-body".asInstanceOf[IoniconsName]
  @inline def IOS_BODY_OUTLINE = "ios-body-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BONFIRE = "ios-bonfire".asInstanceOf[IoniconsName]
  @inline def IOS_BONFIRE_OUTLINE =
    "ios-bonfire-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BOOK = "ios-book".asInstanceOf[IoniconsName]
  @inline def IOS_BOOK_OUTLINE = "ios-book-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BOOKMARK = "ios-bookmark".asInstanceOf[IoniconsName]
  @inline def IOS_BOOKMARK_OUTLINE =
    "ios-bookmark-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BOOKMARKS = "ios-bookmarks".asInstanceOf[IoniconsName]
  @inline def IOS_BOOKMARKS_OUTLINE =
    "ios-bookmarks-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BOWTIE = "ios-bowtie".asInstanceOf[IoniconsName]
  @inline def IOS_BOWTIE_OUTLINE =
    "ios-bowtie-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BRIEFCASE = "ios-briefcase".asInstanceOf[IoniconsName]
  @inline def IOS_BRIEFCASE_OUTLINE =
    "ios-briefcase-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BROWSERS = "ios-browsers".asInstanceOf[IoniconsName]
  @inline def IOS_BROWSERS_OUTLINE =
    "ios-browsers-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BRUSH = "ios-brush".asInstanceOf[IoniconsName]
  @inline def IOS_BRUSH_OUTLINE =
    "ios-brush-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BUG = "ios-bug".asInstanceOf[IoniconsName]
  @inline def IOS_BUG_OUTLINE = "ios-bug-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BUILD = "ios-build".asInstanceOf[IoniconsName]
  @inline def IOS_BUILD_OUTLINE =
    "ios-build-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BULB = "ios-bulb".asInstanceOf[IoniconsName]
  @inline def IOS_BULB_OUTLINE = "ios-bulb-outline".asInstanceOf[IoniconsName]
  @inline def IOS_BUS = "ios-bus".asInstanceOf[IoniconsName]
  @inline def IOS_BUS_OUTLINE = "ios-bus-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CAFE = "ios-cafe".asInstanceOf[IoniconsName]
  @inline def IOS_CAFE_OUTLINE = "ios-cafe-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CALCULATOR = "ios-calculator".asInstanceOf[IoniconsName]
  @inline def IOS_CALCULATOR_OUTLINE =
    "ios-calculator-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CALENDAR = "ios-calendar".asInstanceOf[IoniconsName]
  @inline def IOS_CALENDAR_OUTLINE =
    "ios-calendar-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CALL = "ios-call".asInstanceOf[IoniconsName]
  @inline def IOS_CALL_OUTLINE = "ios-call-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CAMERA = "ios-camera".asInstanceOf[IoniconsName]
  @inline def IOS_CAMERA_OUTLINE =
    "ios-camera-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CAR = "ios-car".asInstanceOf[IoniconsName]
  @inline def IOS_CAR_OUTLINE = "ios-car-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CARD = "ios-card".asInstanceOf[IoniconsName]
  @inline def IOS_CARD_OUTLINE = "ios-card-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CART = "ios-cart".asInstanceOf[IoniconsName]
  @inline def IOS_CART_OUTLINE = "ios-cart-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CASH = "ios-cash".asInstanceOf[IoniconsName]
  @inline def IOS_CASH_OUTLINE = "ios-cash-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CHATBOXES = "ios-chatboxes".asInstanceOf[IoniconsName]
  @inline def IOS_CHATBOXES_OUTLINE =
    "ios-chatboxes-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CHATBUBBLES = "ios-chatbubbles".asInstanceOf[IoniconsName]
  @inline def IOS_CHATBUBBLES_OUTLINE =
    "ios-chatbubbles-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKBOX = "ios-checkbox".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKBOX_OUTLINE =
    "ios-checkbox-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKMARK = "ios-checkmark".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKMARK_CIRCLE =
    "ios-checkmark-circle".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKMARK_CIRCLE_OUTLINE =
    "ios-checkmark-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CHECKMARK_OUTLINE =
    "ios-checkmark-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLIPBOARD = "ios-clipboard".asInstanceOf[IoniconsName]
  @inline def IOS_CLIPBOARD_OUTLINE =
    "ios-clipboard-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOCK = "ios-clock".asInstanceOf[IoniconsName]
  @inline def IOS_CLOCK_OUTLINE =
    "ios-clock-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSE = "ios-close".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSE_CIRCLE = "ios-close-circle".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSE_CIRCLE_OUTLINE =
    "ios-close-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSE_OUTLINE =
    "ios-close-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSED_CAPTIONING =
    "ios-closed-captioning".asInstanceOf[IoniconsName]
  @inline def IOS_CLOSED_CAPTIONING_OUTLINE =
    "ios-closed-captioning-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD = "ios-cloud".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_CIRCLE = "ios-cloud-circle".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_CIRCLE_OUTLINE =
    "ios-cloud-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_DONE = "ios-cloud-done".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_DONE_OUTLINE =
    "ios-cloud-done-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_DOWNLOAD =
    "ios-cloud-download".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_DOWNLOAD_OUTLINE =
    "ios-cloud-download-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_OUTLINE =
    "ios-cloud-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_UPLOAD = "ios-cloud-upload".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUD_UPLOAD_OUTLINE =
    "ios-cloud-upload-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUDY = "ios-cloudy".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUDY_NIGHT = "ios-cloudy-night".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUDY_NIGHT_OUTLINE =
    "ios-cloudy-night-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CLOUDY_OUTLINE =
    "ios-cloudy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CODE = "ios-code".asInstanceOf[IoniconsName]
  @inline def IOS_CODE_DOWNLOAD =
    "ios-code-download".asInstanceOf[IoniconsName]
  @inline def IOS_CODE_DOWNLOAD_OUTLINE =
    "ios-code-download-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CODE_OUTLINE = "ios-code-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CODE_WORKING = "ios-code-working".asInstanceOf[IoniconsName]
  @inline def IOS_CODE_WORKING_OUTLINE =
    "ios-code-working-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COG = "ios-cog".asInstanceOf[IoniconsName]
  @inline def IOS_COG_OUTLINE = "ios-cog-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_FILL = "ios-color-fill".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_FILL_OUTLINE =
    "ios-color-fill-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_FILTER = "ios-color-filter".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_FILTER_OUTLINE =
    "ios-color-filter-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_PALETTE =
    "ios-color-palette".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_PALETTE_OUTLINE =
    "ios-color-palette-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_WAND = "ios-color-wand".asInstanceOf[IoniconsName]
  @inline def IOS_COLOR_WAND_OUTLINE =
    "ios-color-wand-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COMPASS = "ios-compass".asInstanceOf[IoniconsName]
  @inline def IOS_COMPASS_OUTLINE =
    "ios-compass-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CONSTRUCT = "ios-construct".asInstanceOf[IoniconsName]
  @inline def IOS_CONSTRUCT_OUTLINE =
    "ios-construct-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CONTACT = "ios-contact".asInstanceOf[IoniconsName]
  @inline def IOS_CONTACT_OUTLINE =
    "ios-contact-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CONTACTS = "ios-contacts".asInstanceOf[IoniconsName]
  @inline def IOS_CONTACTS_OUTLINE =
    "ios-contacts-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CONTRACT = "ios-contract".asInstanceOf[IoniconsName]
  @inline def IOS_CONTRACT_OUTLINE =
    "ios-contract-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CONTRAST = "ios-contrast".asInstanceOf[IoniconsName]
  @inline def IOS_CONTRAST_OUTLINE =
    "ios-contrast-outline".asInstanceOf[IoniconsName]
  @inline def IOS_COPY = "ios-copy".asInstanceOf[IoniconsName]
  @inline def IOS_COPY_OUTLINE = "ios-copy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CREATE = "ios-create".asInstanceOf[IoniconsName]
  @inline def IOS_CREATE_OUTLINE =
    "ios-create-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CROP = "ios-crop".asInstanceOf[IoniconsName]
  @inline def IOS_CROP_OUTLINE = "ios-crop-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CUBE = "ios-cube".asInstanceOf[IoniconsName]
  @inline def IOS_CUBE_OUTLINE = "ios-cube-outline".asInstanceOf[IoniconsName]
  @inline def IOS_CUT = "ios-cut".asInstanceOf[IoniconsName]
  @inline def IOS_CUT_OUTLINE = "ios-cut-outline".asInstanceOf[IoniconsName]
  @inline def IOS_DESKTOP = "ios-desktop".asInstanceOf[IoniconsName]
  @inline def IOS_DESKTOP_OUTLINE =
    "ios-desktop-outline".asInstanceOf[IoniconsName]
  @inline def IOS_DISC = "ios-disc".asInstanceOf[IoniconsName]
  @inline def IOS_DISC_OUTLINE = "ios-disc-outline".asInstanceOf[IoniconsName]
  @inline def IOS_DOCUMENT = "ios-document".asInstanceOf[IoniconsName]
  @inline def IOS_DOCUMENT_OUTLINE =
    "ios-document-outline".asInstanceOf[IoniconsName]
  @inline def IOS_DONE_ALL = "ios-done-all".asInstanceOf[IoniconsName]
  @inline def IOS_DONE_ALL_OUTLINE =
    "ios-done-all-outline".asInstanceOf[IoniconsName]
  @inline def IOS_DOWNLOAD = "ios-download".asInstanceOf[IoniconsName]
  @inline def IOS_DOWNLOAD_OUTLINE =
    "ios-download-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EASEL = "ios-easel".asInstanceOf[IoniconsName]
  @inline def IOS_EASEL_OUTLINE =
    "ios-easel-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EGG = "ios-egg".asInstanceOf[IoniconsName]
  @inline def IOS_EGG_OUTLINE = "ios-egg-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EXIT = "ios-exit".asInstanceOf[IoniconsName]
  @inline def IOS_EXIT_OUTLINE = "ios-exit-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EXPAND = "ios-expand".asInstanceOf[IoniconsName]
  @inline def IOS_EXPAND_OUTLINE =
    "ios-expand-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EYE = "ios-eye".asInstanceOf[IoniconsName]
  @inline def IOS_EYE_OFF = "ios-eye-off".asInstanceOf[IoniconsName]
  @inline def IOS_EYE_OFF_OUTLINE =
    "ios-eye-off-outline".asInstanceOf[IoniconsName]
  @inline def IOS_EYE_OUTLINE = "ios-eye-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FASTFORWARD = "ios-fastforward".asInstanceOf[IoniconsName]
  @inline def IOS_FASTFORWARD_OUTLINE =
    "ios-fastforward-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FEMALE = "ios-female".asInstanceOf[IoniconsName]
  @inline def IOS_FEMALE_OUTLINE =
    "ios-female-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FILING = "ios-filing".asInstanceOf[IoniconsName]
  @inline def IOS_FILING_OUTLINE =
    "ios-filing-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FILM = "ios-film".asInstanceOf[IoniconsName]
  @inline def IOS_FILM_OUTLINE = "ios-film-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FINGER_PRINT = "ios-finger-print".asInstanceOf[IoniconsName]
  @inline def IOS_FINGER_PRINT_OUTLINE =
    "ios-finger-print-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FLAG = "ios-flag".asInstanceOf[IoniconsName]
  @inline def IOS_FLAG_OUTLINE = "ios-flag-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FLAME = "ios-flame".asInstanceOf[IoniconsName]
  @inline def IOS_FLAME_OUTLINE =
    "ios-flame-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FLASH = "ios-flash".asInstanceOf[IoniconsName]
  @inline def IOS_FLASH_OUTLINE =
    "ios-flash-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FLASK = "ios-flask".asInstanceOf[IoniconsName]
  @inline def IOS_FLASK_OUTLINE =
    "ios-flask-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FLOWER = "ios-flower".asInstanceOf[IoniconsName]
  @inline def IOS_FLOWER_OUTLINE =
    "ios-flower-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FOLDER = "ios-folder".asInstanceOf[IoniconsName]
  @inline def IOS_FOLDER_OPEN = "ios-folder-open".asInstanceOf[IoniconsName]
  @inline def IOS_FOLDER_OPEN_OUTLINE =
    "ios-folder-open-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FOLDER_OUTLINE =
    "ios-folder-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FOOTBALL = "ios-football".asInstanceOf[IoniconsName]
  @inline def IOS_FOOTBALL_OUTLINE =
    "ios-football-outline".asInstanceOf[IoniconsName]
  @inline def IOS_FUNNEL = "ios-funnel".asInstanceOf[IoniconsName]
  @inline def IOS_FUNNEL_OUTLINE =
    "ios-funnel-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GAME_CONTROLLER_A =
    "ios-game-controller-a".asInstanceOf[IoniconsName]
  @inline def IOS_GAME_CONTROLLER_A_OUTLINE =
    "ios-game-controller-a-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GAME_CONTROLLER_B =
    "ios-game-controller-b".asInstanceOf[IoniconsName]
  @inline def IOS_GAME_CONTROLLER_B_OUTLINE =
    "ios-game-controller-b-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_BRANCH = "ios-git-branch".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_BRANCH_OUTLINE =
    "ios-git-branch-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_COMMIT = "ios-git-commit".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_COMMIT_OUTLINE =
    "ios-git-commit-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_COMPARE = "ios-git-compare".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_COMPARE_OUTLINE =
    "ios-git-compare-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_MERGE = "ios-git-merge".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_MERGE_OUTLINE =
    "ios-git-merge-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_NETWORK = "ios-git-network".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_NETWORK_OUTLINE =
    "ios-git-network-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_PULL_REQUEST =
    "ios-git-pull-request".asInstanceOf[IoniconsName]
  @inline def IOS_GIT_PULL_REQUEST_OUTLINE =
    "ios-git-pull-request-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GLASSES = "ios-glasses".asInstanceOf[IoniconsName]
  @inline def IOS_GLASSES_OUTLINE =
    "ios-glasses-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GLOBE = "ios-globe".asInstanceOf[IoniconsName]
  @inline def IOS_GLOBE_OUTLINE =
    "ios-globe-outline".asInstanceOf[IoniconsName]
  @inline def IOS_GRID = "ios-grid".asInstanceOf[IoniconsName]
  @inline def IOS_GRID_OUTLINE = "ios-grid-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HAMMER = "ios-hammer".asInstanceOf[IoniconsName]
  @inline def IOS_HAMMER_OUTLINE =
    "ios-hammer-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HAND = "ios-hand".asInstanceOf[IoniconsName]
  @inline def IOS_HAND_OUTLINE = "ios-hand-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HAPPY = "ios-happy".asInstanceOf[IoniconsName]
  @inline def IOS_HAPPY_OUTLINE =
    "ios-happy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HEADSET = "ios-headset".asInstanceOf[IoniconsName]
  @inline def IOS_HEADSET_OUTLINE =
    "ios-headset-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HEART = "ios-heart".asInstanceOf[IoniconsName]
  @inline def IOS_HEART_OUTLINE =
    "ios-heart-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HELP = "ios-help".asInstanceOf[IoniconsName]
  @inline def IOS_HELP_BUOY = "ios-help-buoy".asInstanceOf[IoniconsName]
  @inline def IOS_HELP_BUOY_OUTLINE =
    "ios-help-buoy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HELP_CIRCLE = "ios-help-circle".asInstanceOf[IoniconsName]
  @inline def IOS_HELP_CIRCLE_OUTLINE =
    "ios-help-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HELP_OUTLINE = "ios-help-outline".asInstanceOf[IoniconsName]
  @inline def IOS_HOME = "ios-home".asInstanceOf[IoniconsName]
  @inline def IOS_HOME_OUTLINE = "ios-home-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ICE_CREAM = "ios-ice-cream".asInstanceOf[IoniconsName]
  @inline def IOS_ICE_CREAM_OUTLINE =
    "ios-ice-cream-outline".asInstanceOf[IoniconsName]
  @inline def IOS_IMAGE = "ios-image".asInstanceOf[IoniconsName]
  @inline def IOS_IMAGE_OUTLINE =
    "ios-image-outline".asInstanceOf[IoniconsName]
  @inline def IOS_IMAGES = "ios-images".asInstanceOf[IoniconsName]
  @inline def IOS_IMAGES_OUTLINE =
    "ios-images-outline".asInstanceOf[IoniconsName]
  @inline def IOS_INFINITE = "ios-infinite".asInstanceOf[IoniconsName]
  @inline def IOS_INFINITE_OUTLINE =
    "ios-infinite-outline".asInstanceOf[IoniconsName]
  @inline def IOS_INFORMATION = "ios-information".asInstanceOf[IoniconsName]
  @inline def IOS_INFORMATION_CIRCLE =
    "ios-information-circle".asInstanceOf[IoniconsName]
  @inline def IOS_INFORMATION_CIRCLE_OUTLINE =
    "ios-information-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_INFORMATION_OUTLINE =
    "ios-information-outline".asInstanceOf[IoniconsName]
  @inline def IOS_IONIC = "ios-ionic".asInstanceOf[IoniconsName]
  @inline def IOS_IONIC_OUTLINE =
    "ios-ionic-outline".asInstanceOf[IoniconsName]
  @inline def IOS_IONITRON = "ios-ionitron".asInstanceOf[IoniconsName]
  @inline def IOS_IONITRON_OUTLINE =
    "ios-ionitron-outline".asInstanceOf[IoniconsName]
  @inline def IOS_JET = "ios-jet".asInstanceOf[IoniconsName]
  @inline def IOS_JET_OUTLINE = "ios-jet-outline".asInstanceOf[IoniconsName]
  @inline def IOS_KEY = "ios-key".asInstanceOf[IoniconsName]
  @inline def IOS_KEY_OUTLINE = "ios-key-outline".asInstanceOf[IoniconsName]
  @inline def IOS_KEYPAD = "ios-keypad".asInstanceOf[IoniconsName]
  @inline def IOS_KEYPAD_OUTLINE =
    "ios-keypad-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LAPTOP = "ios-laptop".asInstanceOf[IoniconsName]
  @inline def IOS_LAPTOP_OUTLINE =
    "ios-laptop-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LEAF = "ios-leaf".asInstanceOf[IoniconsName]
  @inline def IOS_LEAF_OUTLINE = "ios-leaf-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LINK = "ios-link".asInstanceOf[IoniconsName]
  @inline def IOS_LINK_OUTLINE = "ios-link-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LIST = "ios-list".asInstanceOf[IoniconsName]
  @inline def IOS_LIST_BOX = "ios-list-box".asInstanceOf[IoniconsName]
  @inline def IOS_LIST_BOX_OUTLINE =
    "ios-list-box-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LIST_OUTLINE = "ios-list-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LOCATE = "ios-locate".asInstanceOf[IoniconsName]
  @inline def IOS_LOCATE_OUTLINE =
    "ios-locate-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LOCK = "ios-lock".asInstanceOf[IoniconsName]
  @inline def IOS_LOCK_OUTLINE = "ios-lock-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LOG_IN = "ios-log-in".asInstanceOf[IoniconsName]
  @inline def IOS_LOG_IN_OUTLINE =
    "ios-log-in-outline".asInstanceOf[IoniconsName]
  @inline def IOS_LOG_OUT = "ios-log-out".asInstanceOf[IoniconsName]
  @inline def IOS_LOG_OUT_OUTLINE =
    "ios-log-out-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MAGNET = "ios-magnet".asInstanceOf[IoniconsName]
  @inline def IOS_MAGNET_OUTLINE =
    "ios-magnet-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MAIL = "ios-mail".asInstanceOf[IoniconsName]
  @inline def IOS_MAIL_OPEN = "ios-mail-open".asInstanceOf[IoniconsName]
  @inline def IOS_MAIL_OPEN_OUTLINE =
    "ios-mail-open-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MAIL_OUTLINE = "ios-mail-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MALE = "ios-male".asInstanceOf[IoniconsName]
  @inline def IOS_MALE_OUTLINE = "ios-male-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MAN = "ios-man".asInstanceOf[IoniconsName]
  @inline def IOS_MAN_OUTLINE = "ios-man-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MAP = "ios-map".asInstanceOf[IoniconsName]
  @inline def IOS_MAP_OUTLINE = "ios-map-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MEDAL = "ios-medal".asInstanceOf[IoniconsName]
  @inline def IOS_MEDAL_OUTLINE =
    "ios-medal-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MEDICAL = "ios-medical".asInstanceOf[IoniconsName]
  @inline def IOS_MEDICAL_OUTLINE =
    "ios-medical-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MEDKIT = "ios-medkit".asInstanceOf[IoniconsName]
  @inline def IOS_MEDKIT_OUTLINE =
    "ios-medkit-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MEGAPHONE = "ios-megaphone".asInstanceOf[IoniconsName]
  @inline def IOS_MEGAPHONE_OUTLINE =
    "ios-megaphone-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MENU = "ios-menu".asInstanceOf[IoniconsName]
  @inline def IOS_MENU_OUTLINE = "ios-menu-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MIC = "ios-mic".asInstanceOf[IoniconsName]
  @inline def IOS_MIC_OFF = "ios-mic-off".asInstanceOf[IoniconsName]
  @inline def IOS_MIC_OFF_OUTLINE =
    "ios-mic-off-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MIC_OUTLINE = "ios-mic-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MICROPHONE = "ios-microphone".asInstanceOf[IoniconsName]
  @inline def IOS_MICROPHONE_OUTLINE =
    "ios-microphone-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MOON = "ios-moon".asInstanceOf[IoniconsName]
  @inline def IOS_MOON_OUTLINE = "ios-moon-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MORE = "ios-more".asInstanceOf[IoniconsName]
  @inline def IOS_MORE_OUTLINE = "ios-more-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MOVE = "ios-move".asInstanceOf[IoniconsName]
  @inline def IOS_MOVE_OUTLINE = "ios-move-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MUSICAL_NOTE = "ios-musical-note".asInstanceOf[IoniconsName]
  @inline def IOS_MUSICAL_NOTE_OUTLINE =
    "ios-musical-note-outline".asInstanceOf[IoniconsName]
  @inline def IOS_MUSICAL_NOTES =
    "ios-musical-notes".asInstanceOf[IoniconsName]
  @inline def IOS_MUSICAL_NOTES_OUTLINE =
    "ios-musical-notes-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NAVIGATE = "ios-navigate".asInstanceOf[IoniconsName]
  @inline def IOS_NAVIGATE_OUTLINE =
    "ios-navigate-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NO_SMOKING = "ios-no-smoking".asInstanceOf[IoniconsName]
  @inline def IOS_NO_SMOKING_OUTLINE =
    "ios-no-smoking-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NOTIFICATIONS =
    "ios-notifications".asInstanceOf[IoniconsName]
  @inline def IOS_NOTIFICATIONS_OFF =
    "ios-notifications-off".asInstanceOf[IoniconsName]
  @inline def IOS_NOTIFICATIONS_OFF_OUTLINE =
    "ios-notifications-off-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NOTIFICATIONS_OUTLINE =
    "ios-notifications-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NUCLEAR = "ios-nuclear".asInstanceOf[IoniconsName]
  @inline def IOS_NUCLEAR_OUTLINE =
    "ios-nuclear-outline".asInstanceOf[IoniconsName]
  @inline def IOS_NUTRITION = "ios-nutrition".asInstanceOf[IoniconsName]
  @inline def IOS_NUTRITION_OUTLINE =
    "ios-nutrition-outline".asInstanceOf[IoniconsName]
  @inline def IOS_OPEN = "ios-open".asInstanceOf[IoniconsName]
  @inline def IOS_OPEN_OUTLINE = "ios-open-outline".asInstanceOf[IoniconsName]
  @inline def IOS_OPTIONS = "ios-options".asInstanceOf[IoniconsName]
  @inline def IOS_OPTIONS_OUTLINE =
    "ios-options-outline".asInstanceOf[IoniconsName]
  @inline def IOS_OUTLET = "ios-outlet".asInstanceOf[IoniconsName]
  @inline def IOS_OUTLET_OUTLINE =
    "ios-outlet-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PAPER = "ios-paper".asInstanceOf[IoniconsName]
  @inline def IOS_PAPER_OUTLINE =
    "ios-paper-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PAPER_PLANE = "ios-paper-plane".asInstanceOf[IoniconsName]
  @inline def IOS_PAPER_PLANE_OUTLINE =
    "ios-paper-plane-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PARTLY_SUNNY = "ios-partly-sunny".asInstanceOf[IoniconsName]
  @inline def IOS_PARTLY_SUNNY_OUTLINE =
    "ios-partly-sunny-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PAUSE = "ios-pause".asInstanceOf[IoniconsName]
  @inline def IOS_PAUSE_OUTLINE =
    "ios-pause-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PAW = "ios-paw".asInstanceOf[IoniconsName]
  @inline def IOS_PAW_OUTLINE = "ios-paw-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PEOPLE = "ios-people".asInstanceOf[IoniconsName]
  @inline def IOS_PEOPLE_OUTLINE =
    "ios-people-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PERSON = "ios-person".asInstanceOf[IoniconsName]
  @inline def IOS_PERSON_ADD = "ios-person-add".asInstanceOf[IoniconsName]
  @inline def IOS_PERSON_ADD_OUTLINE =
    "ios-person-add-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PERSON_OUTLINE =
    "ios-person-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PHONE_LANDSCAPE =
    "ios-phone-landscape".asInstanceOf[IoniconsName]
  @inline def IOS_PHONE_LANDSCAPE_OUTLINE =
    "ios-phone-landscape-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PHONE_PORTRAIT =
    "ios-phone-portrait".asInstanceOf[IoniconsName]
  @inline def IOS_PHONE_PORTRAIT_OUTLINE =
    "ios-phone-portrait-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PHOTOS = "ios-photos".asInstanceOf[IoniconsName]
  @inline def IOS_PHOTOS_OUTLINE =
    "ios-photos-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PIE = "ios-pie".asInstanceOf[IoniconsName]
  @inline def IOS_PIE_OUTLINE = "ios-pie-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PIN = "ios-pin".asInstanceOf[IoniconsName]
  @inline def IOS_PIN_OUTLINE = "ios-pin-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PINT = "ios-pint".asInstanceOf[IoniconsName]
  @inline def IOS_PINT_OUTLINE = "ios-pint-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PIZZA = "ios-pizza".asInstanceOf[IoniconsName]
  @inline def IOS_PIZZA_OUTLINE =
    "ios-pizza-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PLANE = "ios-plane".asInstanceOf[IoniconsName]
  @inline def IOS_PLANE_OUTLINE =
    "ios-plane-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PLANET = "ios-planet".asInstanceOf[IoniconsName]
  @inline def IOS_PLANET_OUTLINE =
    "ios-planet-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PLAY = "ios-play".asInstanceOf[IoniconsName]
  @inline def IOS_PLAY_OUTLINE = "ios-play-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PODIUM = "ios-podium".asInstanceOf[IoniconsName]
  @inline def IOS_PODIUM_OUTLINE =
    "ios-podium-outline".asInstanceOf[IoniconsName]
  @inline def IOS_POWER = "ios-power".asInstanceOf[IoniconsName]
  @inline def IOS_POWER_OUTLINE =
    "ios-power-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PRICETAG = "ios-pricetag".asInstanceOf[IoniconsName]
  @inline def IOS_PRICETAG_OUTLINE =
    "ios-pricetag-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PRICETAGS = "ios-pricetags".asInstanceOf[IoniconsName]
  @inline def IOS_PRICETAGS_OUTLINE =
    "ios-pricetags-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PRINT = "ios-print".asInstanceOf[IoniconsName]
  @inline def IOS_PRINT_OUTLINE =
    "ios-print-outline".asInstanceOf[IoniconsName]
  @inline def IOS_PULSE = "ios-pulse".asInstanceOf[IoniconsName]
  @inline def IOS_PULSE_OUTLINE =
    "ios-pulse-outline".asInstanceOf[IoniconsName]
  @inline def IOS_QR_SCANNER = "ios-qr-scanner".asInstanceOf[IoniconsName]
  @inline def IOS_QR_SCANNER_OUTLINE =
    "ios-qr-scanner-outline".asInstanceOf[IoniconsName]
  @inline def IOS_QUOTE = "ios-quote".asInstanceOf[IoniconsName]
  @inline def IOS_QUOTE_OUTLINE =
    "ios-quote-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO = "ios-radio".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO_BUTTON_OFF =
    "ios-radio-button-off".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO_BUTTON_OFF_OUTLINE =
    "ios-radio-button-off-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO_BUTTON_ON =
    "ios-radio-button-on".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO_BUTTON_ON_OUTLINE =
    "ios-radio-button-on-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RADIO_OUTLINE =
    "ios-radio-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RAINY = "ios-rainy".asInstanceOf[IoniconsName]
  @inline def IOS_RAINY_OUTLINE =
    "ios-rainy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RECORDING = "ios-recording".asInstanceOf[IoniconsName]
  @inline def IOS_RECORDING_OUTLINE =
    "ios-recording-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REDO = "ios-redo".asInstanceOf[IoniconsName]
  @inline def IOS_REDO_OUTLINE = "ios-redo-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REFRESH = "ios-refresh".asInstanceOf[IoniconsName]
  @inline def IOS_REFRESH_CIRCLE =
    "ios-refresh-circle".asInstanceOf[IoniconsName]
  @inline def IOS_REFRESH_CIRCLE_OUTLINE =
    "ios-refresh-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REFRESH_OUTLINE =
    "ios-refresh-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REMOVE = "ios-remove".asInstanceOf[IoniconsName]
  @inline def IOS_REMOVE_CIRCLE =
    "ios-remove-circle".asInstanceOf[IoniconsName]
  @inline def IOS_REMOVE_CIRCLE_OUTLINE =
    "ios-remove-circle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REMOVE_OUTLINE =
    "ios-remove-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REORDER = "ios-reorder".asInstanceOf[IoniconsName]
  @inline def IOS_REORDER_OUTLINE =
    "ios-reorder-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REPEAT = "ios-repeat".asInstanceOf[IoniconsName]
  @inline def IOS_REPEAT_OUTLINE =
    "ios-repeat-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RESIZE = "ios-resize".asInstanceOf[IoniconsName]
  @inline def IOS_RESIZE_OUTLINE =
    "ios-resize-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RESTAURANT = "ios-restaurant".asInstanceOf[IoniconsName]
  @inline def IOS_RESTAURANT_OUTLINE =
    "ios-restaurant-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RETURN_LEFT = "ios-return-left".asInstanceOf[IoniconsName]
  @inline def IOS_RETURN_LEFT_OUTLINE =
    "ios-return-left-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RETURN_RIGHT = "ios-return-right".asInstanceOf[IoniconsName]
  @inline def IOS_RETURN_RIGHT_OUTLINE =
    "ios-return-right-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REVERSE_CAMERA =
    "ios-reverse-camera".asInstanceOf[IoniconsName]
  @inline def IOS_REVERSE_CAMERA_OUTLINE =
    "ios-reverse-camera-outline".asInstanceOf[IoniconsName]
  @inline def IOS_REWIND = "ios-rewind".asInstanceOf[IoniconsName]
  @inline def IOS_REWIND_OUTLINE =
    "ios-rewind-outline".asInstanceOf[IoniconsName]
  @inline def IOS_RIBBON = "ios-ribbon".asInstanceOf[IoniconsName]
  @inline def IOS_RIBBON_OUTLINE =
    "ios-ribbon-outline".asInstanceOf[IoniconsName]
  @inline def IOS_ROSE = "ios-rose".asInstanceOf[IoniconsName]
  @inline def IOS_ROSE_OUTLINE = "ios-rose-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SAD = "ios-sad".asInstanceOf[IoniconsName]
  @inline def IOS_SAD_OUTLINE = "ios-sad-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SCHOOL = "ios-school".asInstanceOf[IoniconsName]
  @inline def IOS_SCHOOL_OUTLINE =
    "ios-school-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SEARCH = "ios-search".asInstanceOf[IoniconsName]
  @inline def IOS_SEARCH_OUTLINE =
    "ios-search-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SEND = "ios-send".asInstanceOf[IoniconsName]
  @inline def IOS_SEND_OUTLINE = "ios-send-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SETTINGS = "ios-settings".asInstanceOf[IoniconsName]
  @inline def IOS_SETTINGS_OUTLINE =
    "ios-settings-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SHARE = "ios-share".asInstanceOf[IoniconsName]
  @inline def IOS_SHARE_ALT = "ios-share-alt".asInstanceOf[IoniconsName]
  @inline def IOS_SHARE_ALT_OUTLINE =
    "ios-share-alt-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SHARE_OUTLINE =
    "ios-share-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SHIRT = "ios-shirt".asInstanceOf[IoniconsName]
  @inline def IOS_SHIRT_OUTLINE =
    "ios-shirt-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SHUFFLE = "ios-shuffle".asInstanceOf[IoniconsName]
  @inline def IOS_SHUFFLE_OUTLINE =
    "ios-shuffle-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SKIP_BACKWARD =
    "ios-skip-backward".asInstanceOf[IoniconsName]
  @inline def IOS_SKIP_BACKWARD_OUTLINE =
    "ios-skip-backward-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SKIP_FORWARD = "ios-skip-forward".asInstanceOf[IoniconsName]
  @inline def IOS_SKIP_FORWARD_OUTLINE =
    "ios-skip-forward-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SNOW = "ios-snow".asInstanceOf[IoniconsName]
  @inline def IOS_SNOW_OUTLINE = "ios-snow-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SPEEDOMETER = "ios-speedometer".asInstanceOf[IoniconsName]
  @inline def IOS_SPEEDOMETER_OUTLINE =
    "ios-speedometer-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SQUARE = "ios-square".asInstanceOf[IoniconsName]
  @inline def IOS_SQUARE_OUTLINE =
    "ios-square-outline".asInstanceOf[IoniconsName]
  @inline def IOS_STAR = "ios-star".asInstanceOf[IoniconsName]
  @inline def IOS_STAR_HALF = "ios-star-half".asInstanceOf[IoniconsName]
  @inline def IOS_STAR_HALF_OUTLINE =
    "ios-star-half-outline".asInstanceOf[IoniconsName]
  @inline def IOS_STAR_OUTLINE = "ios-star-outline".asInstanceOf[IoniconsName]
  @inline def IOS_STATS = "ios-stats".asInstanceOf[IoniconsName]
  @inline def IOS_STATS_OUTLINE =
    "ios-stats-outline".asInstanceOf[IoniconsName]
  @inline def IOS_STOPWATCH = "ios-stopwatch".asInstanceOf[IoniconsName]
  @inline def IOS_STOPWATCH_OUTLINE =
    "ios-stopwatch-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SUBWAY = "ios-subway".asInstanceOf[IoniconsName]
  @inline def IOS_SUBWAY_OUTLINE =
    "ios-subway-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SUNNY = "ios-sunny".asInstanceOf[IoniconsName]
  @inline def IOS_SUNNY_OUTLINE =
    "ios-sunny-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SWAP = "ios-swap".asInstanceOf[IoniconsName]
  @inline def IOS_SWAP_OUTLINE = "ios-swap-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SWITCH = "ios-switch".asInstanceOf[IoniconsName]
  @inline def IOS_SWITCH_OUTLINE =
    "ios-switch-outline".asInstanceOf[IoniconsName]
  @inline def IOS_SYNC = "ios-sync".asInstanceOf[IoniconsName]
  @inline def IOS_SYNC_OUTLINE = "ios-sync-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TABLET_LANDSCAPE =
    "ios-tablet-landscape".asInstanceOf[IoniconsName]
  @inline def IOS_TABLET_LANDSCAPE_OUTLINE =
    "ios-tablet-landscape-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TABLET_PORTRAIT =
    "ios-tablet-portrait".asInstanceOf[IoniconsName]
  @inline def IOS_TABLET_PORTRAIT_OUTLINE =
    "ios-tablet-portrait-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TENNISBALL = "ios-tennisball".asInstanceOf[IoniconsName]
  @inline def IOS_TENNISBALL_OUTLINE =
    "ios-tennisball-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TEXT = "ios-text".asInstanceOf[IoniconsName]
  @inline def IOS_TEXT_OUTLINE = "ios-text-outline".asInstanceOf[IoniconsName]
  @inline def IOS_THERMOMETER = "ios-thermometer".asInstanceOf[IoniconsName]
  @inline def IOS_THERMOMETER_OUTLINE =
    "ios-thermometer-outline".asInstanceOf[IoniconsName]
  @inline def IOS_THUMBS_DOWN = "ios-thumbs-down".asInstanceOf[IoniconsName]
  @inline def IOS_THUMBS_DOWN_OUTLINE =
    "ios-thumbs-down-outline".asInstanceOf[IoniconsName]
  @inline def IOS_THUMBS_UP = "ios-thumbs-up".asInstanceOf[IoniconsName]
  @inline def IOS_THUMBS_UP_OUTLINE =
    "ios-thumbs-up-outline".asInstanceOf[IoniconsName]
  @inline def IOS_THUNDERSTORM = "ios-thunderstorm".asInstanceOf[IoniconsName]
  @inline def IOS_THUNDERSTORM_OUTLINE =
    "ios-thunderstorm-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TIME = "ios-time".asInstanceOf[IoniconsName]
  @inline def IOS_TIME_OUTLINE = "ios-time-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TIMER = "ios-timer".asInstanceOf[IoniconsName]
  @inline def IOS_TIMER_OUTLINE =
    "ios-timer-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TRAIN = "ios-train".asInstanceOf[IoniconsName]
  @inline def IOS_TRAIN_OUTLINE =
    "ios-train-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TRANSGENDER = "ios-transgender".asInstanceOf[IoniconsName]
  @inline def IOS_TRANSGENDER_OUTLINE =
    "ios-transgender-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TRASH = "ios-trash".asInstanceOf[IoniconsName]
  @inline def IOS_TRASH_OUTLINE =
    "ios-trash-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TRENDING_DOWN =
    "ios-trending-down".asInstanceOf[IoniconsName]
  @inline def IOS_TRENDING_DOWN_OUTLINE =
    "ios-trending-down-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TRENDING_UP = "ios-trending-up".asInstanceOf[IoniconsName]
  @inline def IOS_TRENDING_UP_OUTLINE =
    "ios-trending-up-outline".asInstanceOf[IoniconsName]
  @inline def IOS_TROPHY = "ios-trophy".asInstanceOf[IoniconsName]
  @inline def IOS_TROPHY_OUTLINE =
    "ios-trophy-outline".asInstanceOf[IoniconsName]
  @inline def IOS_UMBRELLA = "ios-umbrella".asInstanceOf[IoniconsName]
  @inline def IOS_UMBRELLA_OUTLINE =
    "ios-umbrella-outline".asInstanceOf[IoniconsName]
  @inline def IOS_UNDO = "ios-undo".asInstanceOf[IoniconsName]
  @inline def IOS_UNDO_OUTLINE = "ios-undo-outline".asInstanceOf[IoniconsName]
  @inline def IOS_UNLOCK = "ios-unlock".asInstanceOf[IoniconsName]
  @inline def IOS_UNLOCK_OUTLINE =
    "ios-unlock-outline".asInstanceOf[IoniconsName]
  @inline def IOS_VIDEOCAM = "ios-videocam".asInstanceOf[IoniconsName]
  @inline def IOS_VIDEOCAM_OUTLINE =
    "ios-videocam-outline".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_DOWN = "ios-volume-down".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_DOWN_OUTLINE =
    "ios-volume-down-outline".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_MUTE = "ios-volume-mute".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_MUTE_OUTLINE =
    "ios-volume-mute-outline".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_OFF = "ios-volume-off".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_OFF_OUTLINE =
    "ios-volume-off-outline".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_UP = "ios-volume-up".asInstanceOf[IoniconsName]
  @inline def IOS_VOLUME_UP_OUTLINE =
    "ios-volume-up-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WALK = "ios-walk".asInstanceOf[IoniconsName]
  @inline def IOS_WALK_OUTLINE = "ios-walk-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WARNING = "ios-warning".asInstanceOf[IoniconsName]
  @inline def IOS_WARNING_OUTLINE =
    "ios-warning-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WATCH = "ios-watch".asInstanceOf[IoniconsName]
  @inline def IOS_WATCH_OUTLINE =
    "ios-watch-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WATER = "ios-water".asInstanceOf[IoniconsName]
  @inline def IOS_WATER_OUTLINE =
    "ios-water-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WIFI = "ios-wifi".asInstanceOf[IoniconsName]
  @inline def IOS_WIFI_OUTLINE = "ios-wifi-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WINE = "ios-wine".asInstanceOf[IoniconsName]
  @inline def IOS_WINE_OUTLINE = "ios-wine-outline".asInstanceOf[IoniconsName]
  @inline def IOS_WOMAN = "ios-woman".asInstanceOf[IoniconsName]
  @inline def IOS_WOMAN_OUTLINE =
    "ios-woman-outline".asInstanceOf[IoniconsName]
  @inline def LOGO_ANDROID = "logo-android".asInstanceOf[IoniconsName]
  @inline def LOGO_ANGULAR = "logo-angular".asInstanceOf[IoniconsName]
  @inline def LOGO_APPLE = "logo-apple".asInstanceOf[IoniconsName]
  @inline def LOGO_BITCOIN = "logo-bitcoin".asInstanceOf[IoniconsName]
  @inline def LOGO_BUFFER = "logo-buffer".asInstanceOf[IoniconsName]
  @inline def LOGO_CHROME = "logo-chrome".asInstanceOf[IoniconsName]
  @inline def LOGO_CODEPEN = "logo-codepen".asInstanceOf[IoniconsName]
  @inline def LOGO_CSS3 = "logo-css3".asInstanceOf[IoniconsName]
  @inline def LOGO_DESIGNERNEWS =
    "logo-designernews".asInstanceOf[IoniconsName]
  @inline def LOGO_DRIBBBLE = "logo-dribbble".asInstanceOf[IoniconsName]
  @inline def LOGO_DROPBOX = "logo-dropbox".asInstanceOf[IoniconsName]
  @inline def LOGO_EURO = "logo-euro".asInstanceOf[IoniconsName]
  @inline def LOGO_FACEBOOK = "logo-facebook".asInstanceOf[IoniconsName]
  @inline def LOGO_FOURSQUARE = "logo-foursquare".asInstanceOf[IoniconsName]
  @inline def LOGO_FREEBSD_DEVIL =
    "logo-freebsd-devil".asInstanceOf[IoniconsName]
  @inline def LOGO_GITHUB = "logo-github".asInstanceOf[IoniconsName]
  @inline def LOGO_GOOGLE = "logo-google".asInstanceOf[IoniconsName]
  @inline def LOGO_GOOGLEPLUS = "logo-googleplus".asInstanceOf[IoniconsName]
  @inline def LOGO_HACKERNEWS = "logo-hackernews".asInstanceOf[IoniconsName]
  @inline def LOGO_HTML5 = "logo-html5".asInstanceOf[IoniconsName]
  @inline def LOGO_INSTAGRAM = "logo-instagram".asInstanceOf[IoniconsName]
  @inline def LOGO_JAVASCRIPT = "logo-javascript".asInstanceOf[IoniconsName]
  @inline def LOGO_LINKEDIN = "logo-linkedin".asInstanceOf[IoniconsName]
  @inline def LOGO_MARKDOWN = "logo-markdown".asInstanceOf[IoniconsName]
  @inline def LOGO_NODEJS = "logo-nodejs".asInstanceOf[IoniconsName]
  @inline def LOGO_OCTOCAT = "logo-octocat".asInstanceOf[IoniconsName]
  @inline def LOGO_PINTEREST = "logo-pinterest".asInstanceOf[IoniconsName]
  @inline def LOGO_PLAYSTATION = "logo-playstation".asInstanceOf[IoniconsName]
  @inline def LOGO_PYTHON = "logo-python".asInstanceOf[IoniconsName]
  @inline def LOGO_REDDIT = "logo-reddit".asInstanceOf[IoniconsName]
  @inline def LOGO_RSS = "logo-rss".asInstanceOf[IoniconsName]
  @inline def LOGO_SASS = "logo-sass".asInstanceOf[IoniconsName]
  @inline def LOGO_SKYPE = "logo-skype".asInstanceOf[IoniconsName]
  @inline def LOGO_SNAPCHAT = "logo-snapchat".asInstanceOf[IoniconsName]
  @inline def LOGO_STEAM = "logo-steam".asInstanceOf[IoniconsName]
  @inline def LOGO_TUMBLR = "logo-tumblr".asInstanceOf[IoniconsName]
  @inline def LOGO_TUX = "logo-tux".asInstanceOf[IoniconsName]
  @inline def LOGO_TWITCH = "logo-twitch".asInstanceOf[IoniconsName]
  @inline def LOGO_TWITTER = "logo-twitter".asInstanceOf[IoniconsName]
  @inline def LOGO_USD = "logo-usd".asInstanceOf[IoniconsName]
  @inline def LOGO_VIMEO = "logo-vimeo".asInstanceOf[IoniconsName]
  @inline def LOGO_WHATSAPP = "logo-whatsapp".asInstanceOf[IoniconsName]
  @inline def LOGO_WINDOWS = "logo-windows".asInstanceOf[IoniconsName]
  @inline def LOGO_WORDPRESS = "logo-wordpress".asInstanceOf[IoniconsName]
  @inline def LOGO_XBOX = "logo-xbox".asInstanceOf[IoniconsName]
  @inline def LOGO_YAHOO = "logo-yahoo".asInstanceOf[IoniconsName]
  @inline def LOGO_YEN = "logo-yen".asInstanceOf[IoniconsName]
  @inline def LOGO_YOUTUBE = "logo-youtube".asInstanceOf[IoniconsName]
  @inline def MD_ADD = "md-add".asInstanceOf[IoniconsName]
  @inline def MD_ADD_CIRCLE = "md-add-circle".asInstanceOf[IoniconsName]
  @inline def MD_ALARM = "md-alarm".asInstanceOf[IoniconsName]
  @inline def MD_ALBUMS = "md-albums".asInstanceOf[IoniconsName]
  @inline def MD_ALERT = "md-alert".asInstanceOf[IoniconsName]
  @inline def MD_AMERICAN_FOOTBALL =
    "md-american-football".asInstanceOf[IoniconsName]
  @inline def MD_ANALYTICS = "md-analytics".asInstanceOf[IoniconsName]
  @inline def MD_APERTURE = "md-aperture".asInstanceOf[IoniconsName]
  @inline def MD_APPS = "md-apps".asInstanceOf[IoniconsName]
  @inline def MD_APPSTORE = "md-appstore".asInstanceOf[IoniconsName]
  @inline def MD_ARCHIVE = "md-archive".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_BACK = "md-arrow-back".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DOWN = "md-arrow-down".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPDOWN =
    "md-arrow-dropdown".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPDOWN_CIRCLE =
    "md-arrow-dropdown-circle".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPLEFT =
    "md-arrow-dropleft".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPLEFT_CIRCLE =
    "md-arrow-dropleft-circle".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPRIGHT =
    "md-arrow-dropright".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPRIGHT_CIRCLE =
    "md-arrow-dropright-circle".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPUP = "md-arrow-dropup".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_DROPUP_CIRCLE =
    "md-arrow-dropup-circle".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_FORWARD = "md-arrow-forward".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_ROUND_BACK =
    "md-arrow-round-back".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_ROUND_DOWN =
    "md-arrow-round-down".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_ROUND_FORWARD =
    "md-arrow-round-forward".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_ROUND_UP =
    "md-arrow-round-up".asInstanceOf[IoniconsName]
  @inline def MD_ARROW_UP = "md-arrow-up".asInstanceOf[IoniconsName]
  @inline def MD_AT = "md-at".asInstanceOf[IoniconsName]
  @inline def MD_ATTACH = "md-attach".asInstanceOf[IoniconsName]
  @inline def MD_BACKSPACE = "md-backspace".asInstanceOf[IoniconsName]
  @inline def MD_BARCODE = "md-barcode".asInstanceOf[IoniconsName]
  @inline def MD_BASEBALL = "md-baseball".asInstanceOf[IoniconsName]
  @inline def MD_BASKET = "md-basket".asInstanceOf[IoniconsName]
  @inline def MD_BASKETBALL = "md-basketball".asInstanceOf[IoniconsName]
  @inline def MD_BATTERY_CHARGING =
    "md-battery-charging".asInstanceOf[IoniconsName]
  @inline def MD_BATTERY_DEAD = "md-battery-dead".asInstanceOf[IoniconsName]
  @inline def MD_BATTERY_FULL = "md-battery-full".asInstanceOf[IoniconsName]
  @inline def MD_BEAKER = "md-beaker".asInstanceOf[IoniconsName]
  @inline def MD_BEER = "md-beer".asInstanceOf[IoniconsName]
  @inline def MD_BICYCLE = "md-bicycle".asInstanceOf[IoniconsName]
  @inline def MD_BLUETOOTH = "md-bluetooth".asInstanceOf[IoniconsName]
  @inline def MD_BOAT = "md-boat".asInstanceOf[IoniconsName]
  @inline def MD_BODY = "md-body".asInstanceOf[IoniconsName]
  @inline def MD_BONFIRE = "md-bonfire".asInstanceOf[IoniconsName]
  @inline def MD_BOOK = "md-book".asInstanceOf[IoniconsName]
  @inline def MD_BOOKMARK = "md-bookmark".asInstanceOf[IoniconsName]
  @inline def MD_BOOKMARKS = "md-bookmarks".asInstanceOf[IoniconsName]
  @inline def MD_BOWTIE = "md-bowtie".asInstanceOf[IoniconsName]
  @inline def MD_BRIEFCASE = "md-briefcase".asInstanceOf[IoniconsName]
  @inline def MD_BROWSERS = "md-browsers".asInstanceOf[IoniconsName]
  @inline def MD_BRUSH = "md-brush".asInstanceOf[IoniconsName]
  @inline def MD_BUG = "md-bug".asInstanceOf[IoniconsName]
  @inline def MD_BUILD = "md-build".asInstanceOf[IoniconsName]
  @inline def MD_BULB = "md-bulb".asInstanceOf[IoniconsName]
  @inline def MD_BUS = "md-bus".asInstanceOf[IoniconsName]
  @inline def MD_CAFE = "md-cafe".asInstanceOf[IoniconsName]
  @inline def MD_CALCULATOR = "md-calculator".asInstanceOf[IoniconsName]
  @inline def MD_CALENDAR = "md-calendar".asInstanceOf[IoniconsName]
  @inline def MD_CALL = "md-call".asInstanceOf[IoniconsName]
  @inline def MD_CAMERA = "md-camera".asInstanceOf[IoniconsName]
  @inline def MD_CAR = "md-car".asInstanceOf[IoniconsName]
  @inline def MD_CARD = "md-card".asInstanceOf[IoniconsName]
  @inline def MD_CART = "md-cart".asInstanceOf[IoniconsName]
  @inline def MD_CASH = "md-cash".asInstanceOf[IoniconsName]
  @inline def MD_CHATBOXES = "md-chatboxes".asInstanceOf[IoniconsName]
  @inline def MD_CHATBUBBLES = "md-chatbubbles".asInstanceOf[IoniconsName]
  @inline def MD_CHECKBOX = "md-checkbox".asInstanceOf[IoniconsName]
  @inline def MD_CHECKBOX_OUTLINE =
    "md-checkbox-outline".asInstanceOf[IoniconsName]
  @inline def MD_CHECKMARK = "md-checkmark".asInstanceOf[IoniconsName]
  @inline def MD_CHECKMARK_CIRCLE =
    "md-checkmark-circle".asInstanceOf[IoniconsName]
  @inline def MD_CHECKMARK_CIRCLE_OUTLINE =
    "md-checkmark-circle-outline".asInstanceOf[IoniconsName]
  @inline def MD_CLIPBOARD = "md-clipboard".asInstanceOf[IoniconsName]
  @inline def MD_CLOCK = "md-clock".asInstanceOf[IoniconsName]
  @inline def MD_CLOSE = "md-close".asInstanceOf[IoniconsName]
  @inline def MD_CLOSE_CIRCLE = "md-close-circle".asInstanceOf[IoniconsName]
  @inline def MD_CLOSED_CAPTIONING =
    "md-closed-captioning".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD = "md-cloud".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD_CIRCLE = "md-cloud-circle".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD_DONE = "md-cloud-done".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD_DOWNLOAD =
    "md-cloud-download".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD_OUTLINE = "md-cloud-outline".asInstanceOf[IoniconsName]
  @inline def MD_CLOUD_UPLOAD = "md-cloud-upload".asInstanceOf[IoniconsName]
  @inline def MD_CLOUDY = "md-cloudy".asInstanceOf[IoniconsName]
  @inline def MD_CLOUDY_NIGHT = "md-cloudy-night".asInstanceOf[IoniconsName]
  @inline def MD_CODE = "md-code".asInstanceOf[IoniconsName]
  @inline def MD_CODE_DOWNLOAD = "md-code-download".asInstanceOf[IoniconsName]
  @inline def MD_CODE_WORKING = "md-code-working".asInstanceOf[IoniconsName]
  @inline def MD_COG = "md-cog".asInstanceOf[IoniconsName]
  @inline def MD_COLOR_FILL = "md-color-fill".asInstanceOf[IoniconsName]
  @inline def MD_COLOR_FILTER = "md-color-filter".asInstanceOf[IoniconsName]
  @inline def MD_COLOR_PALETTE = "md-color-palette".asInstanceOf[IoniconsName]
  @inline def MD_COLOR_WAND = "md-color-wand".asInstanceOf[IoniconsName]
  @inline def MD_COMPASS = "md-compass".asInstanceOf[IoniconsName]
  @inline def MD_CONSTRUCT = "md-construct".asInstanceOf[IoniconsName]
  @inline def MD_CONTACT = "md-contact".asInstanceOf[IoniconsName]
  @inline def MD_CONTACTS = "md-contacts".asInstanceOf[IoniconsName]
  @inline def MD_CONTRACT = "md-contract".asInstanceOf[IoniconsName]
  @inline def MD_CONTRAST = "md-contrast".asInstanceOf[IoniconsName]
  @inline def MD_COPY = "md-copy".asInstanceOf[IoniconsName]
  @inline def MD_CREATE = "md-create".asInstanceOf[IoniconsName]
  @inline def MD_CROP = "md-crop".asInstanceOf[IoniconsName]
  @inline def MD_CUBE = "md-cube".asInstanceOf[IoniconsName]
  @inline def MD_CUT = "md-cut".asInstanceOf[IoniconsName]
  @inline def MD_DESKTOP = "md-desktop".asInstanceOf[IoniconsName]
  @inline def MD_DISC = "md-disc".asInstanceOf[IoniconsName]
  @inline def MD_DOCUMENT = "md-document".asInstanceOf[IoniconsName]
  @inline def MD_DONE_ALL = "md-done-all".asInstanceOf[IoniconsName]
  @inline def MD_DOWNLOAD = "md-download".asInstanceOf[IoniconsName]
  @inline def MD_EASEL = "md-easel".asInstanceOf[IoniconsName]
  @inline def MD_EGG = "md-egg".asInstanceOf[IoniconsName]
  @inline def MD_EXIT = "md-exit".asInstanceOf[IoniconsName]
  @inline def MD_EXPAND = "md-expand".asInstanceOf[IoniconsName]
  @inline def MD_EYE = "md-eye".asInstanceOf[IoniconsName]
  @inline def MD_EYE_OFF = "md-eye-off".asInstanceOf[IoniconsName]
  @inline def MD_FASTFORWARD = "md-fastforward".asInstanceOf[IoniconsName]
  @inline def MD_FEMALE = "md-female".asInstanceOf[IoniconsName]
  @inline def MD_FILING = "md-filing".asInstanceOf[IoniconsName]
  @inline def MD_FILM = "md-film".asInstanceOf[IoniconsName]
  @inline def MD_FINGER_PRINT = "md-finger-print".asInstanceOf[IoniconsName]
  @inline def MD_FLAG = "md-flag".asInstanceOf[IoniconsName]
  @inline def MD_FLAME = "md-flame".asInstanceOf[IoniconsName]
  @inline def MD_FLASH = "md-flash".asInstanceOf[IoniconsName]
  @inline def MD_FLASK = "md-flask".asInstanceOf[IoniconsName]
  @inline def MD_FLOWER = "md-flower".asInstanceOf[IoniconsName]
  @inline def MD_FOLDER = "md-folder".asInstanceOf[IoniconsName]
  @inline def MD_FOLDER_OPEN = "md-folder-open".asInstanceOf[IoniconsName]
  @inline def MD_FOOTBALL = "md-football".asInstanceOf[IoniconsName]
  @inline def MD_FUNNEL = "md-funnel".asInstanceOf[IoniconsName]
  @inline def MD_GAME_CONTROLLER_A =
    "md-game-controller-a".asInstanceOf[IoniconsName]
  @inline def MD_GAME_CONTROLLER_B =
    "md-game-controller-b".asInstanceOf[IoniconsName]
  @inline def MD_GIT_BRANCH = "md-git-branch".asInstanceOf[IoniconsName]
  @inline def MD_GIT_COMMIT = "md-git-commit".asInstanceOf[IoniconsName]
  @inline def MD_GIT_COMPARE = "md-git-compare".asInstanceOf[IoniconsName]
  @inline def MD_GIT_MERGE = "md-git-merge".asInstanceOf[IoniconsName]
  @inline def MD_GIT_NETWORK = "md-git-network".asInstanceOf[IoniconsName]
  @inline def MD_GIT_PULL_REQUEST =
    "md-git-pull-request".asInstanceOf[IoniconsName]
  @inline def MD_GLASSES = "md-glasses".asInstanceOf[IoniconsName]
  @inline def MD_GLOBE = "md-globe".asInstanceOf[IoniconsName]
  @inline def MD_GRID = "md-grid".asInstanceOf[IoniconsName]
  @inline def MD_HAMMER = "md-hammer".asInstanceOf[IoniconsName]
  @inline def MD_HAND = "md-hand".asInstanceOf[IoniconsName]
  @inline def MD_HAPPY = "md-happy".asInstanceOf[IoniconsName]
  @inline def MD_HEADSET = "md-headset".asInstanceOf[IoniconsName]
  @inline def MD_HEART = "md-heart".asInstanceOf[IoniconsName]
  @inline def MD_HEART_OUTLINE = "md-heart-outline".asInstanceOf[IoniconsName]
  @inline def MD_HELP = "md-help".asInstanceOf[IoniconsName]
  @inline def MD_HELP_BUOY = "md-help-buoy".asInstanceOf[IoniconsName]
  @inline def MD_HELP_CIRCLE = "md-help-circle".asInstanceOf[IoniconsName]
  @inline def MD_HOME = "md-home".asInstanceOf[IoniconsName]
  @inline def MD_ICE_CREAM = "md-ice-cream".asInstanceOf[IoniconsName]
  @inline def MD_IMAGE = "md-image".asInstanceOf[IoniconsName]
  @inline def MD_IMAGES = "md-images".asInstanceOf[IoniconsName]
  @inline def MD_INFINITE = "md-infinite".asInstanceOf[IoniconsName]
  @inline def MD_INFORMATION = "md-information".asInstanceOf[IoniconsName]
  @inline def MD_INFORMATION_CIRCLE =
    "md-information-circle".asInstanceOf[IoniconsName]
  @inline def MD_IONIC = "md-ionic".asInstanceOf[IoniconsName]
  @inline def MD_IONITRON = "md-ionitron".asInstanceOf[IoniconsName]
  @inline def MD_JET = "md-jet".asInstanceOf[IoniconsName]
  @inline def MD_KEY = "md-key".asInstanceOf[IoniconsName]
  @inline def MD_KEYPAD = "md-keypad".asInstanceOf[IoniconsName]
  @inline def MD_LAPTOP = "md-laptop".asInstanceOf[IoniconsName]
  @inline def MD_LEAF = "md-leaf".asInstanceOf[IoniconsName]
  @inline def MD_LINK = "md-link".asInstanceOf[IoniconsName]
  @inline def MD_LIST = "md-list".asInstanceOf[IoniconsName]
  @inline def MD_LIST_BOX = "md-list-box".asInstanceOf[IoniconsName]
  @inline def MD_LOCATE = "md-locate".asInstanceOf[IoniconsName]
  @inline def MD_LOCK = "md-lock".asInstanceOf[IoniconsName]
  @inline def MD_LOG_IN = "md-log-in".asInstanceOf[IoniconsName]
  @inline def MD_LOG_OUT = "md-log-out".asInstanceOf[IoniconsName]
  @inline def MD_MAGNET = "md-magnet".asInstanceOf[IoniconsName]
  @inline def MD_MAIL = "md-mail".asInstanceOf[IoniconsName]
  @inline def MD_MAIL_OPEN = "md-mail-open".asInstanceOf[IoniconsName]
  @inline def MD_MALE = "md-male".asInstanceOf[IoniconsName]
  @inline def MD_MAN = "md-man".asInstanceOf[IoniconsName]
  @inline def MD_MAP = "md-map".asInstanceOf[IoniconsName]
  @inline def MD_MEDAL = "md-medal".asInstanceOf[IoniconsName]
  @inline def MD_MEDICAL = "md-medical".asInstanceOf[IoniconsName]
  @inline def MD_MEDKIT = "md-medkit".asInstanceOf[IoniconsName]
  @inline def MD_MEGAPHONE = "md-megaphone".asInstanceOf[IoniconsName]
  @inline def MD_MENU = "md-menu".asInstanceOf[IoniconsName]
  @inline def MD_MIC = "md-mic".asInstanceOf[IoniconsName]
  @inline def MD_MIC_OFF = "md-mic-off".asInstanceOf[IoniconsName]
  @inline def MD_MICROPHONE = "md-microphone".asInstanceOf[IoniconsName]
  @inline def MD_MOON = "md-moon".asInstanceOf[IoniconsName]
  @inline def MD_MORE = "md-more".asInstanceOf[IoniconsName]
  @inline def MD_MOVE = "md-move".asInstanceOf[IoniconsName]
  @inline def MD_MUSICAL_NOTE = "md-musical-note".asInstanceOf[IoniconsName]
  @inline def MD_MUSICAL_NOTES = "md-musical-notes".asInstanceOf[IoniconsName]
  @inline def MD_NAVIGATE = "md-navigate".asInstanceOf[IoniconsName]
  @inline def MD_NO_SMOKING = "md-no-smoking".asInstanceOf[IoniconsName]
  @inline def MD_NOTIFICATIONS = "md-notifications".asInstanceOf[IoniconsName]
  @inline def MD_NOTIFICATIONS_OFF =
    "md-notifications-off".asInstanceOf[IoniconsName]
  @inline def MD_NOTIFICATIONS_OUTLINE =
    "md-notifications-outline".asInstanceOf[IoniconsName]
  @inline def MD_NUCLEAR = "md-nuclear".asInstanceOf[IoniconsName]
  @inline def MD_NUTRITION = "md-nutrition".asInstanceOf[IoniconsName]
  @inline def MD_OPEN = "md-open".asInstanceOf[IoniconsName]
  @inline def MD_OPTIONS = "md-options".asInstanceOf[IoniconsName]
  @inline def MD_OUTLET = "md-outlet".asInstanceOf[IoniconsName]
  @inline def MD_PAPER = "md-paper".asInstanceOf[IoniconsName]
  @inline def MD_PAPER_PLANE = "md-paper-plane".asInstanceOf[IoniconsName]
  @inline def MD_PARTLY_SUNNY = "md-partly-sunny".asInstanceOf[IoniconsName]
  @inline def MD_PAUSE = "md-pause".asInstanceOf[IoniconsName]
  @inline def MD_PAW = "md-paw".asInstanceOf[IoniconsName]
  @inline def MD_PEOPLE = "md-people".asInstanceOf[IoniconsName]
  @inline def MD_PERSON = "md-person".asInstanceOf[IoniconsName]
  @inline def MD_PERSON_ADD = "md-person-add".asInstanceOf[IoniconsName]
  @inline def MD_PHONE_LANDSCAPE =
    "md-phone-landscape".asInstanceOf[IoniconsName]
  @inline def MD_PHONE_PORTRAIT =
    "md-phone-portrait".asInstanceOf[IoniconsName]
  @inline def MD_PHOTOS = "md-photos".asInstanceOf[IoniconsName]
  @inline def MD_PIE = "md-pie".asInstanceOf[IoniconsName]
  @inline def MD_PIN = "md-pin".asInstanceOf[IoniconsName]
  @inline def MD_PINT = "md-pint".asInstanceOf[IoniconsName]
  @inline def MD_PIZZA = "md-pizza".asInstanceOf[IoniconsName]
  @inline def MD_PLANE = "md-plane".asInstanceOf[IoniconsName]
  @inline def MD_PLANET = "md-planet".asInstanceOf[IoniconsName]
  @inline def MD_PLAY = "md-play".asInstanceOf[IoniconsName]
  @inline def MD_PODIUM = "md-podium".asInstanceOf[IoniconsName]
  @inline def MD_POWER = "md-power".asInstanceOf[IoniconsName]
  @inline def MD_PRICETAG = "md-pricetag".asInstanceOf[IoniconsName]
  @inline def MD_PRICETAGS = "md-pricetags".asInstanceOf[IoniconsName]
  @inline def MD_PRINT = "md-print".asInstanceOf[IoniconsName]
  @inline def MD_PULSE = "md-pulse".asInstanceOf[IoniconsName]
  @inline def MD_QR_SCANNER = "md-qr-scanner".asInstanceOf[IoniconsName]
  @inline def MD_QUOTE = "md-quote".asInstanceOf[IoniconsName]
  @inline def MD_RADIO = "md-radio".asInstanceOf[IoniconsName]
  @inline def MD_RADIO_BUTTON_OFF =
    "md-radio-button-off".asInstanceOf[IoniconsName]
  @inline def MD_RADIO_BUTTON_ON =
    "md-radio-button-on".asInstanceOf[IoniconsName]
  @inline def MD_RAINY = "md-rainy".asInstanceOf[IoniconsName]
  @inline def MD_RECORDING = "md-recording".asInstanceOf[IoniconsName]
  @inline def MD_REDO = "md-redo".asInstanceOf[IoniconsName]
  @inline def MD_REFRESH = "md-refresh".asInstanceOf[IoniconsName]
  @inline def MD_REFRESH_CIRCLE =
    "md-refresh-circle".asInstanceOf[IoniconsName]
  @inline def MD_REMOVE = "md-remove".asInstanceOf[IoniconsName]
  @inline def MD_REMOVE_CIRCLE = "md-remove-circle".asInstanceOf[IoniconsName]
  @inline def MD_REORDER = "md-reorder".asInstanceOf[IoniconsName]
  @inline def MD_REPEAT = "md-repeat".asInstanceOf[IoniconsName]
  @inline def MD_RESIZE = "md-resize".asInstanceOf[IoniconsName]
  @inline def MD_RESTAURANT = "md-restaurant".asInstanceOf[IoniconsName]
  @inline def MD_RETURN_LEFT = "md-return-left".asInstanceOf[IoniconsName]
  @inline def MD_RETURN_RIGHT = "md-return-right".asInstanceOf[IoniconsName]
  @inline def MD_REVERSE_CAMERA =
    "md-reverse-camera".asInstanceOf[IoniconsName]
  @inline def MD_REWIND = "md-rewind".asInstanceOf[IoniconsName]
  @inline def MD_RIBBON = "md-ribbon".asInstanceOf[IoniconsName]
  @inline def MD_ROSE = "md-rose".asInstanceOf[IoniconsName]
  @inline def MD_SAD = "md-sad".asInstanceOf[IoniconsName]
  @inline def MD_SCHOOL = "md-school".asInstanceOf[IoniconsName]
  @inline def MD_SEARCH = "md-search".asInstanceOf[IoniconsName]
  @inline def MD_SEND = "md-send".asInstanceOf[IoniconsName]
  @inline def MD_SETTINGS = "md-settings".asInstanceOf[IoniconsName]
  @inline def MD_SHARE = "md-share".asInstanceOf[IoniconsName]
  @inline def MD_SHARE_ALT = "md-share-alt".asInstanceOf[IoniconsName]
  @inline def MD_SHIRT = "md-shirt".asInstanceOf[IoniconsName]
  @inline def MD_SHUFFLE = "md-shuffle".asInstanceOf[IoniconsName]
  @inline def MD_SKIP_BACKWARD = "md-skip-backward".asInstanceOf[IoniconsName]
  @inline def MD_SKIP_FORWARD = "md-skip-forward".asInstanceOf[IoniconsName]
  @inline def MD_SNOW = "md-snow".asInstanceOf[IoniconsName]
  @inline def MD_SPEEDOMETER = "md-speedometer".asInstanceOf[IoniconsName]
  @inline def MD_SQUARE = "md-square".asInstanceOf[IoniconsName]
  @inline def MD_SQUARE_OUTLINE =
    "md-square-outline".asInstanceOf[IoniconsName]
  @inline def MD_STAR = "md-star".asInstanceOf[IoniconsName]
  @inline def MD_STAR_HALF = "md-star-half".asInstanceOf[IoniconsName]
  @inline def MD_STAR_OUTLINE = "md-star-outline".asInstanceOf[IoniconsName]
  @inline def MD_STATS = "md-stats".asInstanceOf[IoniconsName]
  @inline def MD_STOPWATCH = "md-stopwatch".asInstanceOf[IoniconsName]
  @inline def MD_SUBWAY = "md-subway".asInstanceOf[IoniconsName]
  @inline def MD_SUNNY = "md-sunny".asInstanceOf[IoniconsName]
  @inline def MD_SWAP = "md-swap".asInstanceOf[IoniconsName]
  @inline def MD_SWITCH = "md-switch".asInstanceOf[IoniconsName]
  @inline def MD_SYNC = "md-sync".asInstanceOf[IoniconsName]
  @inline def MD_TABLET_LANDSCAPE =
    "md-tablet-landscape".asInstanceOf[IoniconsName]
  @inline def MD_TABLET_PORTRAIT =
    "md-tablet-portrait".asInstanceOf[IoniconsName]
  @inline def MD_TENNISBALL = "md-tennisball".asInstanceOf[IoniconsName]
  @inline def MD_TEXT = "md-text".asInstanceOf[IoniconsName]
  @inline def MD_THERMOMETER = "md-thermometer".asInstanceOf[IoniconsName]
  @inline def MD_THUMBS_DOWN = "md-thumbs-down".asInstanceOf[IoniconsName]
  @inline def MD_THUMBS_UP = "md-thumbs-up".asInstanceOf[IoniconsName]
  @inline def MD_THUNDERSTORM = "md-thunderstorm".asInstanceOf[IoniconsName]
  @inline def MD_TIME = "md-time".asInstanceOf[IoniconsName]
  @inline def MD_TIMER = "md-timer".asInstanceOf[IoniconsName]
  @inline def MD_TRAIN = "md-train".asInstanceOf[IoniconsName]
  @inline def MD_TRANSGENDER = "md-transgender".asInstanceOf[IoniconsName]
  @inline def MD_TRASH = "md-trash".asInstanceOf[IoniconsName]
  @inline def MD_TRENDING_DOWN = "md-trending-down".asInstanceOf[IoniconsName]
  @inline def MD_TRENDING_UP = "md-trending-up".asInstanceOf[IoniconsName]
  @inline def MD_TROPHY = "md-trophy".asInstanceOf[IoniconsName]
  @inline def MD_UMBRELLA = "md-umbrella".asInstanceOf[IoniconsName]
  @inline def MD_UNDO = "md-undo".asInstanceOf[IoniconsName]
  @inline def MD_UNLOCK = "md-unlock".asInstanceOf[IoniconsName]
  @inline def MD_VIDEOCAM = "md-videocam".asInstanceOf[IoniconsName]
  @inline def MD_VOLUME_DOWN = "md-volume-down".asInstanceOf[IoniconsName]
  @inline def MD_VOLUME_MUTE = "md-volume-mute".asInstanceOf[IoniconsName]
  @inline def MD_VOLUME_OFF = "md-volume-off".asInstanceOf[IoniconsName]
  @inline def MD_VOLUME_UP = "md-volume-up".asInstanceOf[IoniconsName]
  @inline def MD_WALK = "md-walk".asInstanceOf[IoniconsName]
  @inline def MD_WARNING = "md-warning".asInstanceOf[IoniconsName]
  @inline def MD_WATCH = "md-watch".asInstanceOf[IoniconsName]
  @inline def MD_WATER = "md-water".asInstanceOf[IoniconsName]
  @inline def MD_WIFI = "md-wifi".asInstanceOf[IoniconsName]
  @inline def MD_WINE = "md-wine".asInstanceOf[IoniconsName]
  @inline def MD_WOMAN = "md-woman".asInstanceOf[IoniconsName]
}
