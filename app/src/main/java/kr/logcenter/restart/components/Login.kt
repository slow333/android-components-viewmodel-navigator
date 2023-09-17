package kr.logcenter.restart.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import kr.logcenter.restart.components.layoutAndScaffold.ScaffoldTwice

@Composable
fun Login(navController: NavController) {
   ScaffoldTwice(navController = navController) {
      Text("LOgin Screen")
   }
}