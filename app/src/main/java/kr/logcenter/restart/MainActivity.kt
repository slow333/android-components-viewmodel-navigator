package kr.logcenter.restart

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import kr.logcenter.restart.ui.theme.RestartTheme

class MainActivity : ComponentActivity() {

   private lateinit var navController: NavHostController
   override fun onCreate(savedInstanceState: Bundle?) {
      super.onCreate(savedInstanceState)
      setContent {
         RestartTheme {
            Surface(
               modifier = Modifier.fillMaxSize(),
               color = MaterialTheme.colorScheme.background
            ) {
               navController = rememberNavController()
               SetupNavGraph(navController = navController)
            }
         }
      }
   }
}
