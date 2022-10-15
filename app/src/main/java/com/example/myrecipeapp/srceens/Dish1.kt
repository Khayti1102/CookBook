package com.example.myrecipeapp.srceens

import android.net.Uri
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalOf
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.ui.StyledPlayerView

@Composable
fun Dish1() {

    Column(
        modifier = Modifier
            .fillMaxSize()

    )
        {
            Column(
                modifier = Modifier.height(300.dp).fillMaxWidth()
            ){
                val context = LocalContext.current
                val url ="https://www.youtube.com/results?search_query=white+sauce+pasta+recipe+in+english"
                val exoPlayer=ExoPlayer.Builder(context).build()
                val mediaItem = MediaItem.fromUri(Uri.parse(url))
                exoPlayer.setMediaItem(mediaItem)

                val playerView = StyledPlayerView(context)
                playerView.player = exoPlayer

                DisposableEffect(AndroidView(factory = {playerView})){
                    onDispose {
                        exoPlayer.prepare()
                        exoPlayer.playWhenReady=true
                        onDispose {
                            exoPlayer.release()
                        }
                    }
                }

            }


            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.Yellow)
                    .padding(start = 8.dp)
                    .height(600.dp)


            ){

                Row{
                    Text(text="Cooking Time : ", fontWeight = FontWeight.SemiBold,
                        fontSize = 20.sp

                    )
                    Text(
                        text="50 min",fontSize = 20.sp
                    )
                }
                Row{
                    Text(text="Course : ", fontWeight = FontWeight.SemiBold,fontSize = 20.sp

                    )
                    Text(
                        text="Appetizer",fontSize = 20.sp
                    )
                }
                Row{
                    Text(text="Cuisine : ", fontWeight = FontWeight.SemiBold,fontSize = 20.sp

                    )
                    Text(
                        text="Italian",fontSize = 20.sp
                    )
                }
                Row{
                    Text(text="Serving : ", fontWeight = FontWeight.SemiBold,fontSize = 20.sp

                    )
                    Text(
                        text="Three",fontSize = 20.sp
                    )
                }
                Row{
                    Text(text="Calories : ", fontWeight = FontWeight.SemiBold,fontSize = 20.sp

                    )
                    Text(
                        text="399 kcl",fontSize = 20.sp
                    )
                }
                Text(text="Ingredients",fontSize=40.sp, fontWeight = FontWeight.Bold)
                Text(text="   1,5 cup of pasta of your choice", fontSize = 25.sp)
                Text(text="   1 tsp oil", fontSize = 25.sp)
                Text(text="   3- cup water", fontSize = 25.sp)
                Text(text="   1.5 tbsp oats", fontSize = 25.sp)
                Text(text="   2.5 tbsp butter", fontSize = 25.sp)
                Text(text="   1.2 cup milk", fontSize = 25.sp)
                Text(text="   Vegan butter oil", fontSize = 25.sp)
                Text(text="   Non-dairy milk", fontSize = 25.sp)
                Text(text="   Roughly crushed Chili flacks", fontSize = 25.sp)













            }

        }


}

@Composable
@Preview
fun DefaultPreview(){
    Dish1()
}