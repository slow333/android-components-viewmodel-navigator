package kr.logcenter.restart.components.layoutAndScaffold

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun ColumnLayout(content: @Composable () -> Unit) {
   Column(
      modifier = Modifier
         .fillMaxSize()
         .background(MaterialTheme.colorScheme.surface)
         .padding(horizontal = 10.dp),
      verticalArrangement = Arrangement.spacedBy(26.dp, alignment = Alignment.CenterVertically),
      horizontalAlignment = Alignment.CenterHorizontally
   ) {
      content()
   }
}