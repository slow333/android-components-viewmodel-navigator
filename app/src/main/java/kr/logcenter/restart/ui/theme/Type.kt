package kr.logcenter.restart.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import kr.logcenter.restart.R

// Set of Material typography styles to start with
val notosankr = FontFamily(
   Font(R.font.notosanskr_bold, FontWeight.Bold, FontStyle.Normal),
   Font(R.font.notosanskr_medium, FontWeight.Medium, FontStyle.Normal),
   Font(R.font.notosanskr_regular, FontWeight.Normal, FontStyle.Normal),
   Font(R.font.notosanskr_light, FontWeight.Light, FontStyle.Normal),
   Font(R.font.notosanskr_thin, FontWeight.Thin, FontStyle.Normal),
)

// Material 3 typography
val replyTypography = Typography(
   headlineLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 32.sp,
      lineHeight = 40.sp,
      letterSpacing = 0.sp
   ),
   headlineMedium = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 28.sp,
      lineHeight = 36.sp,
      letterSpacing = 0.sp
   ),
   headlineSmall = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 24.sp,
      lineHeight = 32.sp,
      letterSpacing = 0.sp
   ),
   titleLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 22.sp,
      lineHeight = 28.sp,
      letterSpacing = 0.sp
   ),
   titleMedium = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 16.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.15.sp
   ),
   titleSmall = TextStyle(
      fontWeight = FontWeight.Bold,
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.1.sp
   ),
   bodyLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Normal,
      fontSize = 16.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.15.sp
   ),
   bodyMedium = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Medium,
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.25.sp
   ),
   bodySmall = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Bold,
      fontSize = 12.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.4.sp
   ),
   labelLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 14.sp,
      lineHeight = 20.sp,
      letterSpacing = 0.1.sp
   ),
   labelMedium = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 12.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.5.sp
   ),
   labelSmall = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.SemiBold,
      fontSize = 11.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.5.sp
   )
)



val Typography = Typography(
   bodyLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Normal,
      fontSize = 16.sp,
      lineHeight = 24.sp,
      letterSpacing = 0.5.sp
   ),
   titleLarge = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Normal,
      fontSize = 22.sp,
      lineHeight = 28.sp,
      letterSpacing = 0.sp
   ),
   labelSmall = TextStyle(
      fontFamily = notosankr,
      fontWeight = FontWeight.Medium,
      fontSize = 11.sp,
      lineHeight = 16.sp,
      letterSpacing = 0.5.sp
   )
)