package kr.logcenter.restart

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.logcenter.restart.components.Detail
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
      composable(route = Screen.Detail.route,
         arguments = listOf(
            navArgument(DETAIL_ARG_KEY) { type = NavType.IntType },
            navArgument(DETAIL_ARG_NAME) { type = NavType.StringType }
         )
      ) {
//         Log.d("args", it.arguments?.getInt(DETAIL_ARG_KEY).toString() )
//         Log.d("args", it.arguments?.getString(DETAIL_ARG_NAME).toString() )
         val arg_id = it.arguments?.getInt(DETAIL_ARG_KEY).toString()
         val arg_name = it.arguments?.getString(DETAIL_ARG_NAME).toString()
         Detail(navController, arg_id, arg_name) }

   }
}