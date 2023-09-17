package kr.logcenter.restart.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import kr.logcenter.restart.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PasswordTextField() {
   var password by rememberSaveable {
      mutableStateOf("")
   }
   var passwordVisible by rememberSaveable { mutableStateOf(false) }
   val icon = if(passwordVisible) painterResource(id = R.drawable.baseline_visibility_off_24)
   else painterResource(id = R.drawable.baseline_visibility_24)

   OutlinedTextField(
      value = password,
      onValueChange = { password = it },
      placeholder = { Text(text = "password") },
      modifier = Modifier.fillMaxWidth(),
      trailingIcon =
      {
         IconButton(onClick = { passwordVisible = !passwordVisible }) {
            Icon( icon, contentDescription = "icon")
         }
      },
      visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
      keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
   )
}