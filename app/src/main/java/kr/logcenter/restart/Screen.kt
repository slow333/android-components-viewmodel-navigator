package kr.logcenter.restart

const val DETAIL_ARG_KEY = "id"
const val DETAIL_ARG_NAME = "name"

sealed class Screen(val route: String) {
   object Home : Screen(route = "home_screen")
   object CoilImage : Screen(route = "coil_image")
   object Blackpink : Screen(route = "blackpink_screen")
   object GoogleBtn : Screen(route = "google_button")
   object NoteForApp : Screen(route = "note_for_app")
   object DetailReceiveArgs : Screen(route = "detail_screen?id={$DETAIL_ARG_KEY}&name={$DETAIL_ARG_NAME}") {
//   object Detail : Screen(route = "detail_screen/{$DETAIL_ARG_KEY}/${DETAIL_ARG_NAME}") {
/*      fun passId(id: Int): String {
         return this.route.replace(
            oldValue = "{$DETAIL_ARG_KEY}",
            newValue = "$id"
         )
      }*/

      fun passIdAndName(id: Int = 0, name: String = "kal"): String {
         return "detail_screen?id=$id&name=$name"
      }
   }
}
