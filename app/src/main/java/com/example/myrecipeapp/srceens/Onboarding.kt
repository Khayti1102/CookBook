package com.example.myrecipeapp.srceens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myrecipeapp.R
import com.example.myrecipeapp.ui.theme.White

@Composable
fun Onboarding(
    onNext:()->Unit
) {
    val image = painterResource(R.drawable.kyle_head_pw8k_w_kni0_unsplash)
    Box {
        Image(
                painter = image,
                contentDescription = "OnBoardingBackground",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop

        )
        Column {
            Modifier.padding(top = 30.dp, bottom = 25.dp)
            Text(
                text = "Cooking Experience",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = androidx.compose.ui.graphics.Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(CenterHorizontally)
                    .padding(top = 30.dp)

            )
            Text(
                text = "Like a Chef!",
                fontSize = 32.sp,
                fontWeight = FontWeight.ExtraBold,
                color = androidx.compose.ui.graphics.Color.White,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(CenterHorizontally)

            )
            Column {
                Text(
                    text = "Let's make a delicious dish with ",
                    color = androidx.compose.ui.graphics.Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .padding(top = 400.dp)
                        .fillMaxWidth()
                        .wrapContentWidth(CenterHorizontally)

                )
                Text(
                    text = " best recipe for the family",
                    color = androidx.compose.ui.graphics.Color.White,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Medium,
                    modifier = Modifier
                        .fillMaxWidth()
                        .wrapContentWidth(CenterHorizontally)

                )
                Column(
                    modifier=Modifier.fillMaxWidth().wrapContentWidth(CenterHorizontally)
                        .padding(top=8.dp)
                    ,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    IconButton(
                        onClick = onNext,



                        modifier = Modifier
                            .clip(CircleShape)
                            .background(MaterialTheme.colors.primary)
                            .height(40.dp)
                            .width(190.dp)






                    ) {
                        Row {

                            val image1= painterResource(R.drawable.virus_removebg_preview)
                            Image(painter = image1
                                , contentDescription = null
                            )
                            Text(
                                text="Get Started",
                                color= androidx.compose.ui.graphics.Color.White,
                                fontWeight = FontWeight.Bold,
                                fontSize = 25.sp,
                                modifier = Modifier.padding(start=8.dp,end=7.dp)



                            )


                        }
                    }

                }

            }

        }
    }
}


