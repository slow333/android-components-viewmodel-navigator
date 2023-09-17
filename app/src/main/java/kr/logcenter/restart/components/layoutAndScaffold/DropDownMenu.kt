package kr.logcenter.restart.components.layoutAndScaffold

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavController
import kr.logcenter.restart.Screen

@Composable
fun DropDownMenu(navController: NavController) {
   val context = LocalContext.current
   var expanded by remember { mutableStateOf(false) }

   Box(
      modifier = Modifier
//         .fillMaxWidth()
         .wrapContentSize(Alignment.TopStart)
   ) {
      IconButton(onClick = { expanded = !expanded }) {
         Icon( imageVector = Icons.Default.Menu, contentDescription = "More" )
      }

      DropdownMenu(
         expanded = expanded,
         onDismissRequest = { expanded = false }
      ) {
         DropdownMenuItem(
            text = { Text("Home") },
            onClick = { navController.navigate(route = Screen.Home.route) }
         )
         DropdownMenuItem(
            text = { Text("Twice") },
            onClick = { navController.navigate(route = Screen.Blackpink.route) }
         )
         DropdownMenuItem(
            text = { Text("Login") },
            onClick = { navController.navigate(route = Screen.Login.route) }
         )
         DropdownMenuItem(
            text = { Text("Note for app") },
            onClick = { navController.navigate(route = Screen.NoteForApp.route) }
         )
         DropdownMenuItem(
            text = { Text("Detail") },
            onClick = { navController.navigate(route = Screen.DetailReceiveArgs.passIdAndName(25, "from scaffold")) }
         )
      }
   }
}