package kr.logcenter.restart.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import kr.logcenter.restart.components.layoutAndScaffold.ColumnLayout
import kr.logcenter.restart.components.layoutAndScaffold.ScaffoldTwice

@Composable
fun DetailReceiveArgs(navController: NavController, id: String, name: String) {
   ScaffoldTwice(navController = navController) {
      ColumnLayout {
         Text("detain screen id is $id and name is $name")
      }
   }
}