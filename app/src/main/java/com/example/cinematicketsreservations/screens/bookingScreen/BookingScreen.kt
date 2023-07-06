package com.example.cinematicketsreservations.screens.bookingScreen

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
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cinematicketsreservations.R
import com.example.cinematicketsreservations.ui.theme.LightOnBackground38
import com.example.cinematicketsreservations.ui.theme.LightOnBackground60
import com.example.cinematicketsreservations.ui.theme.LightOnBackground87
import com.example.cinematicketsreservations.ui.theme.primary

@Composable
fun ButtonWithIcon(text:String, iconId:Int) {
    Button(onClick = {}, colors = ButtonDefaults.buttonColors(primary)) {
        Image(
            painterResource(id = iconId),
            contentDescription =text,
            modifier = Modifier.size(20.dp),)

        Text(text = text ,Modifier.padding(start = 10.dp) , style = MaterialTheme.typography.bodyLarge )
    }
}

@Composable
fun TextChipWithIcon(
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
            text = text,
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground60,
        )
    }
}

@Composable
fun Present(title: String, description: String) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = title, style = MaterialTheme.typography.bodyLarge, color = LightOnBackground87)
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = description,
            style = MaterialTheme.typography.bodySmall,
            color = LightOnBackground38
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun BookingScreen(){
    Box(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(300.dp)
            .align(Alignment.TopCenter),) {
            Image(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.Center),
                painter = painterResource(id = R.drawable.movie_image),
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
            Image(
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.ic_clock),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )

            Image(
                modifier = Modifier
                    .clip(CircleShape)
                    .background(Color.Red)
                    .align(Alignment.Center)
                    .padding(16.dp),
                painter = painterResource(id = R.drawable.ic_play),
                contentDescription = "",
                contentScale = ContentScale.FillWidth
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(
                    RoundedCornerShape(
                        topEnd = 35.dp, topStart = 35.dp
                    )
                )
                .background(color = Color.White)
                .padding(top = 24.dp, start = 24.dp, end = 24.dp, bottom = 8.dp)
                .height(400.dp)
                .align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally

        ) {


            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {
                Present("6.4/10", "IMDb")
                Spacer(modifier = Modifier.width(16.dp))
                Present("63%", "Rotten Tomatoes")
                Spacer(modifier = Modifier.width(16.dp))
                Present("4/10", "IGN")
            }

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                textAlign = TextAlign.Center,
                text = "Fantastic Beasts: The Secrets of Dumbledore",
                style = MaterialTheme.typography.titleLarge,
                color = LightOnBackground87,
            )

            Spacer(modifier = Modifier.height(8.dp))

            Row(horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()) {
                TextChipWithIcon(
                    text = "Fantasy",
                    selectedColor = Color.Red,
                    onChecked = {},
                    isSelected = false
                )

                Spacer(modifier = Modifier.padding(horizontal = 4.dp))

                TextChipWithIcon(
                    text = "Adventure",
                    selectedColor = Color.Red,
                    onChecked = {},
                    isSelected = false
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
            ) {

                Spacer(modifier = Modifier.height(16.dp))

                LazyRow(
                ) {
                    items(10) {
                        Image(
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape),
                            painter = painterResource(id = R.drawable.actor1),
                            contentDescription = "",
                        )
                        Spacer(modifier = Modifier.width(4.dp))
                    }

                }

                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.Center,
                    text = "Professor Albus Dumbledore knows the powerful, dark wizard Gellert Grindelwald is moving to seize control of the wizarding world. Unable to stop him alone, he entrusts magizoologist Newt Scamander to lead an intrepid team of wizards and witches. They soon encounter an array of old and new beasts as they clash with Grindelwald's growing legion of followers.",
                    style = MaterialTheme.typography.bodySmall,
                    color = LightOnBackground60,
                    maxLines = 3,
                )
            }

            Spacer(modifier = Modifier.height(24.dp))

            Row() {
                ButtonWithIcon("Booking", R.drawable.ic_booking)

            }
        }
    }



}