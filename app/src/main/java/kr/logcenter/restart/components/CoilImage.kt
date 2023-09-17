package kr.logcenter.restart.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import coil.compose.AsyncImagePainter
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import coil.size.Size
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import kr.logcenter.restart.R

@Composable
fun CoilImage(maxWidth: Float = 1f) {

   var showPopup by remember { mutableStateOf(false) }

   Box(
      modifier = Modifier.fillMaxWidth(maxWidth),
      contentAlignment = Alignment.Center
   ) {
      val painter = rememberAsyncImagePainter(
         model = ImageRequest.Builder(LocalContext.current)
            .data(
               "https://images.unsplash.com/photo-1682687219573-3fd75f982217?ixlib=rb-4.0.3&ixid=" +
                       "M3wxMjA3fDF8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1675&q=80"
            )
            .size(Size.ORIGINAL) // Set the target size to load the image at.
            .crossfade(1000) // true
            .error(androidx.core.R.drawable.ic_call_answer)
            .transformations(
               CircleCropTransformation()
            )
            .build()
      )
      if (painter.state is AsyncImagePainter.State.Loading) {
         CircularProgressIndicator()
      }
      Box( contentAlignment = Alignment.Center  ) {
         val rainbowColorsBrush = remember {
            Brush.sweepGradient(
               listOf(
                  Color(0xFF9575CD),
                  Color(0xFFBA68C8),
                  Color(0xFFE57373),
                  Color(0xFFFFB74D),
                  Color(0xFFFFF176),
                  Color(0xFFAED581),
                  Color(0xFF4DD0E1),
                  Color(0xFF9575CD)
               )
            )
         }

         Image(painter = painter, contentDescription = "image",
            Modifier
               .clip(CircleShape)
               .border(
                  BorderStroke(5.dp, rainbowColorsBrush),
                  CircleShape
               )
               .clickable { showPopup = !showPopup},
            colorFilter = ColorFilter.tint(Color.DarkGray, blendMode = BlendMode.Darken),
         )
         Text(
            text = "Coil Image click to max size",
            fontSize = MaterialTheme.typography.titleMedium.fontSize,
            color = Color(0xffdddddd),
            textAlign = TextAlign.Center
         )
      }
      if(showPopup) {
         LoadImage(
            onConfirmation = { showPopup = false },
            painter = painter,
            imageDescription = "full image",
         )
      }
   }
}

@Composable
fun LoadImage(
   onConfirmation: () -> Unit,
   painter: Painter,
   imageDescription: String,
) {
   Dialog(onDismissRequest = { onConfirmation() }) {
      Card(
         modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, end = 0.dp, start = 0.dp, bottom = 10.dp),
         shape = RoundedCornerShape(16.dp),
      ) {
         Image(
            painter = painter,
            contentDescription = imageDescription,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
               .fillMaxWidth()
               .padding(top = 10.dp)
         )
         OutlinedButton(
            onClick = { onConfirmation() },
            modifier = Modifier.fillMaxWidth(),
         ) {
            Text("Close image")
         }
      }
   }
}