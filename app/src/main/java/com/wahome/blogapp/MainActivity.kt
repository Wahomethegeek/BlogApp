package com.wahome.blogapp

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.wahome.blogapp.ui.theme.BlogAppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BlogAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    BlogAppTheme {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxSize()
               .verticalScroll(rememberScrollState())

                .background(Color(0, 100, 100))
        )
        {
               Text(
                text = "Exclusive: Bill Gates in Kenya To Hold Series Of Public Engagements",
                color = Color(233, 150, 122),
                style = MaterialTheme.typography.h4,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()

            )
            Image(
                painter = painterResource(id = R.drawable.news_banner),
                contentDescription = null,
                modifier = Modifier.clip(RoundedCornerShape(10.dp))
                    .fillMaxWidth()
                    .height(200.dp),

                    contentScale = ContentScale.Crop

            )
            Text(
                text = "American Businessman and Microsoft Company owner Bill Gates" +
                        " is in Kenya, where he will hold a series of public engagements.",
               modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "On Tuesday, Gates will tour Makueni County and is expected to meet Governor Mutula Kilonzo at his office.",
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Healthcare is at the top of the Businessman's mission in Kenya. He is set to" +
                        " visit the Makueni Mother and Child hospital which mainly deals with mother and child healthcare" +
                        " and later visit Kathonzweni Health Centre where he is expected to meet health volunteers.",
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "Gates will later meet two farmers in Kathonzweni who are championing" +
                        " for Climate Change and are farming through irrigation.",
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "On Thursday, November 17, Bill Gates is expected to give a talk on Innovating for Food" +
                        " Security and Climate Change in Africa. The event will be streamed live from the University of Nairobi.",
                modifier = Modifier.padding(8.dp)
            )
            Text(
                text = "ComposeChallenge done by Wahome",
                color= Color(233, 150, 122)
            )
        }
    }
}


