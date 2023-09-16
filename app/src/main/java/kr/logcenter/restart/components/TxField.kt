package kr.logcenter.restart.components

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TxField() {

   var inputText by remember { mutableStateOf("") }
   Column {
      TextField(value = inputText, onValueChange = { inputText = it},
//         label = { Text("")},
         singleLine = true,
         trailingIcon = {
            IconButton(onClick = { /*TODO*/ }) {
               Icon(
                  Icons.Filled.Email,
                  contentDescription = "null",
               )
            }
         },
         keyboardOptions = KeyboardOptions(
            keyboardType = KeyboardType.Email,
            imeAction = ImeAction.Search
         ),
         keyboardActions = KeyboardActions(
            onSearch = {
               Log.d("ImeAction", "Clicked")
            }
         ),
         textStyle = TextStyle(fontSize = 15.sp, lineHeight=0.sp),
         modifier = Modifier.height(54.dp),

      )
   }
}

@Preview(showBackground = true)
@Composable
fun preview() {
   TxField()
}