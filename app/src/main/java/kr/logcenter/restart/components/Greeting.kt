package kr.logcenter.restart.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Greeting(
   vm: MyViewModel,
   modifier: Modifier = Modifier
) {
   Column(verticalArrangement = Arrangement.Center,
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      Text(
         text = "Hello ${vm.text.value}!",
         modifier = modifier.padding(bottom = 10.dp)
      )
      Button(
         onClick = { vm.onClick("안드로이드 refactory") },
         colors = ButtonDefaults.filledTonalButtonColors(MaterialTheme.colorScheme.primary)
      ) {
         Text(text = "submit button".uppercase(),
            color = MaterialTheme.colorScheme.onPrimary)
      }
   }
}