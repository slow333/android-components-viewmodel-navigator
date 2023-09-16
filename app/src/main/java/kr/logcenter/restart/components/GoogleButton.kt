package kr.logcenter.restart.components

import android.graphics.drawable.shapes.Shape
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.Easing
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kr.logcenter.restart.R
import kr.logcenter.restart.ui.theme.replyShapes

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun GoogleButton(
   text: String = "구글에 가입하기",
   loadingText: String = "구글에 가입하는 중...",
   google_icon : Painter = painterResource(id = R.drawable.google__g__logo_svg),
   space: Dp = 4.dp,
   shape: CornerBasedShape = replyShapes.large,
   borderColor: Color = MaterialTheme.colorScheme.onSecondary,
   surfaceColor: Color = MaterialTheme.colorScheme.secondaryContainer,
   circularIndicatorColor: Color = MaterialTheme.colorScheme.primary,
   onClick : () -> Unit
) {

   var clicked by remember { mutableStateOf(false) }

   Surface(
      onClick = { clicked = !clicked},
      color = surfaceColor,
      border = BorderStroke(2.dp, color = borderColor),
      shape = shape
   ) {
      Row(modifier = Modifier
         .padding(horizontal = 9.dp, vertical = 3.dp)
         .animateContentSize(
            animationSpec = tween(
               durationMillis = 400,
               easing = FastOutLinearInEasing
            )
         ),
         horizontalArrangement = Arrangement.Center,
         verticalAlignment = Alignment.CenterVertically) {
         Icon(
            google_icon,
            contentDescription = "g icon",
            modifier = Modifier.size(24.dp),
            tint = Color.Unspecified
         )
         Spacer(modifier = Modifier.padding(horizontal = space))
         Text(text = if(clicked) loadingText else text)

         if(clicked) {
            Spacer(modifier = Modifier.padding(horizontal = space))
            CircularProgressIndicator(
               modifier = Modifier.size(24.dp),
               color = circularIndicatorColor
            )
         }
         onClick()
      }
   }
}