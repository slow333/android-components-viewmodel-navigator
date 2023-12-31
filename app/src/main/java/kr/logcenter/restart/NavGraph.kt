package kr.logcenter.restart

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import kr.logcenter.restart.components.CoilImage
import kr.logcenter.restart.components.DetailReceiveArgs
import kr.logcenter.restart.components.GoogleButton
import kr.logcenter.restart.components.HomeScreen
import kr.logcenter.restart.components.Login
import kr.logcenter.restart.components.NoteForApp
import kr.logcenter.restart.components.TwiceCardList
import kr.logcenter.restart.data.twiceList

@Composable
fun SetupNavGraph( navController: NavHostController
) {
   NavHost(navController = navController, startDestination = Screen.Home.route){
      composable(route = Screen.Home.route ) { HomeScreen(navController) }
      composable(route = Screen.CoilImage.route ) { CoilImage() }
      composable(route = Screen.Blackpink.route ) { TwiceCardList(twiceList, navController) }
      composable(route = Screen.GoogleBtn.route ) { GoogleButton(onClick = { null }) }
      composable(route = Screen.NoteForApp.route ) { NoteForApp() }
      composable(route = Screen.DetailReceiveArgs.route,
         arguments = listOf(
            navArgument(DETAIL_ARG_KEY) { type = NavType.IntType },
            navArgument(DETAIL_ARG_NAME) { type = NavType.StringType }
         )
      ) {
//         Log.d("args", it.arguments?.getInt(DETAIL_ARG_KEY).toString() )
//         Log.d("args", it.arguments?.getString(DETAIL_ARG_NAME).toString() )
         val arg_id = it.arguments?.getInt(DETAIL_ARG_KEY).toString()
         val arg_name = it.arguments?.getString(DETAIL_ARG_NAME).toString()
         DetailReceiveArgs(navController, arg_id, arg_name) }

   }
}