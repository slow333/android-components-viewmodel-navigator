package kr.logcenter.restart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import kr.logcenter.restart.components.ScaffoldTwice
import kr.logcenter.restart.components.TwiceCardList
import kr.logcenter.restart.ui.theme.RestartTheme

class MainActivity : ComponentActivity() {
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         RestartTheme {
            // A surface container using the 'background' color from the theme
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colorScheme.background
            ) {
               ScaffoldTwice {
                  TwiceCardList()
               }
            }
         }
      }
   }
}




//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//   RestartTheme {
//      Greeting("Android")
//   }
//}