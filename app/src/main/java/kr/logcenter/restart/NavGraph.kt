package kr.logcenter.restart

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import kr.logcenter.restart.components.HomeScreen
import kr.logcenter.restart.components.Login
import kr.logcenter.restart.components.TwiceCardList
import kr.logcenter.restart.data.twiceList

@Composable
fun SetupNavGraph( navController: NavHostController
) {
   NavHost(navController = navController, startDestination = Screen.Home.route){
      composable(route = Screen.Home.route ) { HomeScreen(navController) }
      composable(route = Screen.Login.route ) { Login(navController) }
      composable(route = Screen.Blackpink.route ) { TwiceCardList(twiceList, navController) }
   }
}