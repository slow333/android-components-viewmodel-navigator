package kr.logcenter.restart.components

import android.annotation.SuppressLint
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.CenterAlignedTopAppBar
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@SuppressLint("RememberReturnType", "UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldTwice(content: @Composable () -> Unit, ) {
   var name by remember { mutableStateOf("") }

   Scaffold(
      containerColor  = MaterialTheme.colorScheme.secondary,
      topBar = {
         CenterAlignedTopAppBar(
            title = {
               Row(verticalAlignment = Alignment.CenterVertically,
                  modifier = Modifier.padding(start = 20.dp)) {
                  Text("Twice & BlackPink",
                     fontSize = MaterialTheme.typography.titleSmall.fontSize)
                  OutlinedTextField(
                     value = name, onValueChange = { name = it},
//                     label = {Text("NAME", fontSize = 10.sp)},
                     placeholder = { Text("뭔가 적으세요", fontSize = MaterialTheme.typography.labelSmall.fontSize)},
                     modifier = Modifier.padding(start = 12.dp).height(50.dp),
                     textStyle = TextStyle(fontSize = 16.sp),
                     leadingIcon = { Icon( Icons.Filled.Search,
                        tint = Color.White, contentDescription = "no"
                     )}
                  )
               }
            },
            navigationIcon = {
               IconButton(
                  onClick = { /* "Open nav drawer" */ }
               ) { Icon(Icons.Filled.Menu, contentDescription = "Menu")  }
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

//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//      ScaffoldTwice()
//}