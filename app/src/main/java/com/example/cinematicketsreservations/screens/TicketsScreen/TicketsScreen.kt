package com.example.cinematicketsreservations.screens.TicketsScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.screens.bookingScreen.ButtonWithIcon
import com.example.cinematicketsreservations.ui.theme.LightOnBackground
import com.example.cinematicketsreservations.ui.theme.LightOnBackground38
import com.example.cinematicketsreservations.ui.theme.LightOnBackground60
import com.example.cinematicketsreservations.ui.theme.LightOnBackground87
import com.example.cinematicketsreservations.ui.theme.primary


@Composable
fun DayChips(
    isSelected: Boolean,
    text: String,
    day: String,
    onChecked: (Boolean) -> Unit,
    selectedColor: Color = Color.DarkGray
) {
    val shape = CircleShape
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = if (isSelected) selectedColor else Color.LightGray,
                shape = shape
            )
            .background(
                color = if (isSelected) selectedColor else Color.Transparent,
                shape = shape
            )
            .clip(shape = shape)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(
                vertical = 8.dp,
                horizontal = 16.dp
            )
    ) {
        Text(
            text = text,
            style = MaterialTheme.typography.bodyLarge,
            color = LightOnBackground87,
        )
        Text(
            text = day,
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground60,
        )
    }
}

@Composable
fun BookingChoice(color: Color, description: String) {
    Row(
        modifier = Modifier.background(Color.Black)
    ) {
        Box(
            modifier = Modifier
                .size(12.dp)
                .clip(CircleShape)
                .background(color)
        )

        Spacer(modifier = Modifier.width(8.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground
        )
    }
}

@Composable
fun Price(title: String, description: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            style = MaterialTheme.typography.headlineSmall,
            color = LightOnBackground87
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground38
        )
    }
}

@Composable
fun TextChip(
    isSelected: Boolean,
    text: String,
    onChecked: (Boolean) -> Unit,
    selectedColor: Color = Color.DarkGray
) {
    val shape = CircleShape
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .border(
                width = 1.dp,
                color = if (isSelected) selectedColor else Color.LightGray,
                shape = shape
            )
            .background(
                color = if (isSelected) selectedColor else Color.Transparent,
                shape = shape
            )
            .clip(shape = shape)
            .clickable {
                onChecked(!isSelected)
            }
            .padding(
                vertical = 8.dp,
                horizontal = 16.dp
            )
    ) {
        Text(
            text = text.toString(),
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground60,
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun TicketScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(White)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(500.dp)
                .background(Color.Black)
                .padding(bottom = 64.dp).align(Alignment.TopCenter),

            ) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.TopCenter)
                    .padding(bottom = 24.dp),
                painter = painterResource(id = R.drawable.chairs),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )

            Image(
                modifier = Modifier
                    .align(Alignment.TopStart)
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.ic_exit),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
            ) {
                BookingChoice(White, "Available")
                Spacer(modifier = Modifier.width(16.dp))
                BookingChoice(White, "Taken")
                Spacer(modifier = Modifier.width(16.dp))
                BookingChoice(primary, "Selected")
            }

        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topEnd = 35.dp, topStart = 35.dp
                    )
                )
                .background(color = White)
                .padding(top = 24.dp, start = 24.dp, end = 24.dp, bottom = 8.dp)
                .height(200.dp)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            LazyRow(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.fillMaxWidth()
            ) {
                items(8) {
                    DayChips(
                        text = "14",
                        day = "Thu",
                        selectedColor = Color.Red,
                        onChecked = {},
                        isSelected = false,
                    )

                    Spacer(modifier = Modifier.width(4.dp))
                }
            }
            Spacer(modifier = Modifier.height(16.dp))

            LazyRow() {
                items(8) {
                    TextChip(
                        text = "10:00",
                        selectedColor = Color.Red,
                        onChecked = {},
                        isSelected = false
                    )
                    Spacer(modifier = Modifier.width(4.dp))
                }
            }

            Spacer(modifier = Modifier.height(32.dp))

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                Price(title = "$100.00", description = "4 tickets")
                ButtonWithIcon("Buy tickets", R.drawable.ic_booking)
            }
        }
    }
}