package kr.logcenter.restart.components

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.FabPosition
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SmallFloatingActionButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import kr.logcenter.restart.Screen

@SuppressLint("RememberReturnType", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTwice(navController: NavController, content: @Composable () -> Unit, ) {
   var name by remember { mutableStateOf("") }

   Scaffold(
      containerColor  = MaterialTheme.colorScheme.secondary,

      topBar = {
         CenterAlignedTopAppBar(
            title = {
               Row(verticalAlignment = Alignment.CenterVertically,
                  modifier = Modifier.padding(start = 20.dp)) {
                  Text("TW/BP",
                     fontSize = MaterialTheme.typography.titleSmall.fontSize,
                  modifier = Modifier.padding(end = 4.dp))
                  TxField()
               }
            },
            navigationIcon = {
               DropDownMenu(navController = navController)
            },
//            colors = TopAppBarDefaults.centerAlignedTopAppBarColors(MaterialTheme.colorScheme.onPrimaryContainer)
         )
      },
      floatingActionButtonPosition = FabPosition.Center,
      floatingActionButton = {
         SmallFloatingActionButton(
            onClick = { /* fab click handler */ },
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            shape = CircleShape,
            modifier = Modifier.border(3.dp, shape = CircleShape, color = MaterialTheme.colorScheme.onSurface)
         ) {
            Icon(Icons.Filled.Add, "Small floating action button.") }
      }) { padding ->
      Box(modifier = Modifier.padding(padding)) {
         content()
      }
   }
}

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
      }
   }
}