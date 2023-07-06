package com.example.cinematicketsreservations.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.cinematicketsreservations.R


// Set of Material typography styles to start with
val kumbhSans = FontFamily(
    Font(R.font.kumbhsans_regular, FontWeight.Normal),
    Font(R.font.kumbhsans_bold, FontWeight.Bold),
    Font(R.font.kumbhsans_medium, FontWeight.Medium),
    Font(R.font.kumbhsans_semibold, FontWeight.SemiBold),
    )

val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 28.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 28.sp,
    ),

    bodyLarge = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
    ),
    labelLarge = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 10.sp,
        lineHeight = 14.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = kumbhSans,
        fontWeight = FontWeight.Normal,
        fontSize = 8.sp,
        lineHeight = 12.sp,
    ),
)