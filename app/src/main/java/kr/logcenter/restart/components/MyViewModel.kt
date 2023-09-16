package kr.logcenter.restart.components

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class MyViewModel: ViewModel() {
   private val _text = mutableStateOf("안녕")
   var text = _text
   fun onClick (value: String) {
      _text.value = value
   }
}