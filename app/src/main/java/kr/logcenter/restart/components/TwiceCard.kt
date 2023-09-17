package kr.logcenter.restart.components

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavController
import kr.logcenter.restart.components.layoutAndScaffold.ColumnLayout
import kr.logcenter.restart.components.layoutAndScaffold.ScaffoldTwice
import kr.logcenter.restart.data.Twice

@Composable
fun TwiceCard (title: String, image: Int, desc: String, comment: String,
               titleFontSize: TextUnit = MaterialTheme.typography.titleMedium.fontSize,
               bodyFontSize: TextUnit = MaterialTheme.typography.bodyMedium.fontSize) {

   var showPopup = remember { mutableStateOf(false) }
   var showComment by remember {  mutableStateOf(false) }
   val rotateAnimation by animateFloatAsState(targetValue = if (showComment) 180f else 0f,
      label = "button icon animation"  )

   Card(modifier = Modifier
      .padding(4.dp)
      .fillMaxWidth()
      .height(120.dp)
      .border(
         border = BorderStroke(1.dp, MaterialTheme.colorScheme.onPrimary),
         shape = RoundedCornerShape(10.dp)
      ),
      colors = CardDefaults.cardColors(
         containerColor = MaterialTheme.colorScheme.surfaceVariant
      ),
      elevation = CardDefaults.cardElevation(
         defaultElevation = 6.dp
      ),
   ){
      Row( modifier = Modifier.fillMaxSize(),
         verticalAlignment = Alignment.CenterVertically,
         horizontalArrangement = Arrangement.SpaceBetween
      ) {
         Image(painter = painterResource(id = image), contentDescription = desc,
            modifier = Modifier
               .padding(horizontal = 6.dp, vertical = 5.dp)
               .border(
                  BorderStroke(1.dp, MaterialTheme.colorScheme.onPrimary),
                  RoundedCornerShape(6.dp)
               )
               .clip(RoundedCornerShape(6.dp))
               .clickable {
                  showPopup.value = !showPopup.value
               },
            contentScale = ContentScale.FillHeight,)
//         Spacer(modifier = Modifier.fillMaxWidth())
         Column(
            horizontalAlignment = Alignment.End,
            modifier = Modifier.padding(end = 9.dp)
         ) {
            Text(text = title.uppercase(), fontSize = titleFontSize,
               fontWeight = FontWeight(800), overflow = TextOverflow.Ellipsis )
            Text(text = desc, fontSize = bodyFontSize)
            IconButton(onClick = { showComment = !showComment},
               modifier = Modifier
                  .alpha(0.4f)
                  .weight(1f)
                  .rotate(rotateAnimation)) {
               Icon(
                  imageVector = Icons.Filled.KeyboardArrowDown,
                  contentDescription = "to fold"
               )
            }
         }
      }

      if (showPopup.value) {
         DialogWithImage(painter = painterResource(image), imageDescription = "idol",
            onConfirmation = { showPopup.value = false},
//            onDismissRequest = { showPopup.value = false},
            title = title)
      }
   }
   if(showComment) {
      Box(modifier = Modifier
         .padding(horizontal = 4.dp,)
         .fillMaxWidth()
         .clip(RoundedCornerShape(8.dp)) // 이거 안하면 삐져 나옴
         .background(MaterialTheme.colorScheme.surface)
         .border(
            1.dp, Color.White, shape = RoundedCornerShape(8.dp),
         )
      ){
         Text(text = comment, fontSize = bodyFontSize,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier.padding(9.dp))
      }
   }
}

@Composable
fun TwiceCardList(twList: List<Twice>, navController: NavController) {
   ScaffoldTwice(navController = navController) {
      LazyColumn(contentPadding = PaddingValues(horizontal = 5.dp, vertical = 5.dp)) {
         items(twList) {item ->
            TwiceCard(title = item.title, image = item.image, desc = item.description, comment = item.comment)
         }
      }
   }
}

@Composable
fun DialogWithImage(
//   onDismissRequest: () -> Unit,
   onConfirmation: () -> Unit,
   painter: Painter,
   imageDescription: String,
   title: String
) {
   Dialog(onDismissRequest = { onConfirmation() }) {
      // Draw a rectangle shape with rounded corners inside the dialog
      Card(
         modifier = Modifier
            .fillMaxWidth()
//            .height(375.dp)
            .padding(top = 60.dp, end = 0.dp, start = 0.dp, bottom = 50.dp),
         shape = RoundedCornerShape(16.dp),
      ) {
         ColumnLayout {
            Image(
               painter = painter,
               contentDescription = imageDescription,
               contentScale = ContentScale.FillWidth,
               modifier = Modifier
                  .fillMaxWidth()
                  .padding(top = 30.dp)
            )
            Text(
               text = title,
               modifier = Modifier.padding(16.dp),
            )

            OutlinedButton(
               onClick = { onConfirmation() },
               modifier = Modifier
                  .padding(bottom = 30.dp)
                  .fillMaxWidth(),
            ) {
               Text(" 🤣 😊 좋아요 (❁´◡`❁)  ", letterSpacing = 2.sp)
               Icon (
                  Icons.Default.Favorite, contentDescription = null, tint = Color(0xff00ffaa)
               )
            }
         }
      }
   }
}