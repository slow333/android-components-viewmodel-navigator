package kr.logcenter.restart.components

import android.util.Log
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import kr.logcenter.restart.Screen
import kr.logcenter.restart.components.layoutAndScaffold.ColumnLayout
import kr.logcenter.restart.components.layoutAndScaffold.ScaffoldTwice

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

   ScaffoldTwice(navController = navController) {
      ColumnLayout {
         PasswordTextField()
         // button의 기본 높이를 조정, contentPadding, minWidth, minHeight 조정
         OutlinedButton(onClick = { navController.navigate(route = Screen.Home.route) },
            contentPadding = PaddingValues(),
            modifier = Modifier
               .width(160.dp)
               .defaultMinSize(minWidth = 1.dp, minHeight = 1.dp),
         ) { Text(text = "HOME", modifier = Modifier.padding(vertical = 0.dp)) }

         OutlinedButton(onClick = { navController.navigate(route = Screen.Blackpink.route) },
         ) { Text(text = "Twice") }

         OutlinedButton(onClick = { navController.navigate(route = Screen.NoteForApp.route) },
         ) { Text(text = "Note for App") }

         OutlinedButton( onClick = {
               navController.navigate(route = Screen.DetailReceiveArgs.passIdAndName(21, "twice")) },
         ) { Text(text = "Detail") }

         CoilImage(maxWidth = 0.3f)
         GoogleButton(onClick = {
            Log.d("구글버튼", "Clicked by google 버튼")
         })
      }
   }
}