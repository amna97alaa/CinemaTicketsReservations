package com.example.cinematicketsreservations

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.cinematicketsreservations.screens.TicketsScreen.TicketScreen
import com.example.cinematicketsreservations.screens.bookingScreen.BookingScreen
import com.example.cinematicketsreservations.screens.homeScreen.HomeScreen
import com.example.cinematicketsreservations.ui.theme.CinemaTicketsReservationsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CinemaTicketsReservationsTheme {

            }
        }
    }
}