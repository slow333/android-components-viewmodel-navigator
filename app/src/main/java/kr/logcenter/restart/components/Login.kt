package kr.logcenter.restart.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Login(navController: NavController) {
   ScaffoldTwice(navController = navController) {
      Text("LOgin Screen")
   }
}