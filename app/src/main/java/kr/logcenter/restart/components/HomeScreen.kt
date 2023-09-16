package kr.logcenter.restart.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kr.logcenter.restart.Screen

@Composable
fun HomeScreen(navController: NavController) {

   ScaffoldTwice(navController = navController) {
      Column(
         modifier = Modifier.fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
         verticalArrangement = Arrangement.spacedBy(26.dp, alignment = Alignment.CenterVertically),
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         OutlinedButton(onClick = { navController.navigate(route = Screen.Home.route){
            popUpTo(Screen.Home.route) {inclusive = true}
         } },
         ) {
            Text(text = "Home")
         }
         OutlinedButton(onClick = { navController.navigate(route = Screen.Blackpink.route){
            popUpTo(Screen.Blackpink.route) {inclusive = true}
         } },
         ) {
            Text(text = "Twice")
         }
         OutlinedButton(onClick = { navController.navigate(route = Screen.Login.route){
            popUpTo(Screen.Login.route) {inclusive = true}
         } },
         ) {
            Text(text = "Login")
         }
         OutlinedButton(
            onClick = {
               navController.navigate(route = Screen.Detail.passIdAndName(21, "twice"))
            },
         ) {
            Text(text = "Detail")
         }
      }


   }
}

@Composable
fun OutLinedButton(onClick: () -> Unit, content: () -> Unit) {

}
