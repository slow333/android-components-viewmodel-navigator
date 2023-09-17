package kr.logcenter.restart.components

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import kr.logcenter.restart.R
import kr.logcenter.restart.components.layoutAndScaffold.ColumnLayout

@Composable
fun NoteForApp() {
   val bullet = "✔️"
   ColumnLayout {
      Text("Coil in Jetpack Compose", fontSize = MaterialTheme.typography.titleMedium.fontSize)
      Text(text = "$bullet " + stringResource(id = R.string.coil_apply))
   }
}