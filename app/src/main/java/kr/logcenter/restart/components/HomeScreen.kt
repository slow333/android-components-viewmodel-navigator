package kr.logcenter.restart.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kr.logcenter.restart.Screen

@Composable
fun HomeScreen(navController: NavController) {

   ScaffoldTwice(navController = navController) {
      Column(
         modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surface),
         verticalArrangement = Arrangement.spacedBy(26.dp, alignment = Alignment.CenterVertically),
         horizontalAlignment = Alignment.CenterHorizontally
      ) {
         // button의 기본 높이를 조정, contentPadding, minWidth, minHeight 조정
         OutlinedButton(onClick = { navController.navigate(route = Screen.Home.route) },
            contentPadding = PaddingValues(),
            modifier = Modifier.width(160.dp).defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
         ) { Text(text = "HOME", modifier = Modifier.padding(vertical = 0.dp)) }

         OutlinedButton(onClick = { navController.navigate(route = Screen.Blackpink.route) },
         ) { Text(text = "Twice") }

         OutlinedButton(onClick = { navController.navigate(route = Screen.Login.route){
            popUpTo(Screen.Login.route) {inclusive = true} } },
         ) { Text(text = "Login") }

         OutlinedButton(
            onClick = {
               navController.navigate(route = Screen.DetailReceiveArgs.passIdAndName(21, "twice"))
            },
         ) { Text(text = "Detail") }

         GoogleButton(onClick = {
            Log.d("구글버튼", "Clicked by google 버튼")
         })
      }
   }
}