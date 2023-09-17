package kr.logcenter.restart.components

import android.provider.Settings.System.getString
import android.text.Html
import android.text.Html.FROM_HTML_MODE_LEGACY
import android.text.Spanned
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

      Text(text = stringResource(id = R.string.coil_apply))

      Text(text = "textfield 높이 조정")
      Text(text = "수동 조정을 하려면 별도로 많은 것을 해야함...\n 건드리지 말라는 뜻 같음")
   }
}