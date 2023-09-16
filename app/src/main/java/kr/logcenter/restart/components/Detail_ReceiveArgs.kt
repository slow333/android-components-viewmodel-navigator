package kr.logcenter.restart.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController

@Composable
fun Detail(navController: NavController, id: String, name: String) {
   ScaffoldTwice(navController = navController) {
      Text("detain screen id is $id and name is $name")
   }
}