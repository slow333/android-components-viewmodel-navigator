package kr.logcenter.restart

sealed class Screen(val route: String) {
   object Home: Screen(route = "home_screen")
   object Login: Screen(route = "login_screen")
   object Blackpink: Screen(route = "blackpink_screen")
}
