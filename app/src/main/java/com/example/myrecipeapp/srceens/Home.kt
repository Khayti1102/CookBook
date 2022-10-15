package com.example.myrecipeapp.srceens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myrecipeapp.R


@Composable
fun Home(
    onNext:()->Unit
) {

    Column(
        Modifier
            .background(Color.White)
            .fillMaxSize()

    ) {
        Text(text="What We're Loving Now",
        fontWeight = FontWeight.Bold,
            fontSize = 20.sp,
            modifier= Modifier.padding(start = 14.dp,top=12.dp)
        )



            Button(
                onClick =  onNext ,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(250.dp),
                colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)


            ) {
                val image = painterResource(R.drawable.mohammadreza_alidoost_ah1p6_vpoia_unsplash)
                Image(
                    painter = image, contentDescription = null,
                    modifier = Modifier
                        .fillMaxHeight()
                        .fillMaxWidth(),
                    contentScale = ContentScale.Crop
                )






                }
        Column(
            Modifier
                .background(Color.White)
                .padding(start = 14.dp, end = 14.dp)
        ){
            Text(
                text = "Vegan Creamy Tomato Mac And Cheese ",
                modifier = Modifier
                    .background(Color.LightGray).fillMaxWidth().wrapContentWidth(Alignment.Start)
                    .padding(start = 10.dp, top = 5.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,

            )
        }
        Column(
            Modifier
                .background(Color.White)
                .padding(start = 16.dp, end = 14.dp, top = 14.dp)




        ){
            Text(
                text="Deserts",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start=20.dp))





            Row(

               modifier= Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            ){
                val image1=painterResource(R.drawable.pancakes)
                val image2=painterResource(R.drawable.cupcakes)
                val image3=painterResource(R.drawable.chocolate_mousse)


                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image1,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Pancakes", fontWeight = FontWeight.Medium)
                    }
                }

                  /**************************************************/

                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image2,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Cupcakes", fontWeight = FontWeight.Medium)
                    }
                }

                /****************************************************/




                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image3,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Mousse", fontWeight = FontWeight.Medium)
                    }
                }
                /******************************************************/















            }
            Text(
                text="China Mainland Dishes",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(start=20.dp,bottom=3.dp))
            Row(

                modifier= Modifier.fillMaxWidth().wrapContentWidth(Alignment.CenterHorizontally)
            ){

                val image4=painterResource(R.drawable.ramen)
                val image5=painterResource(R.drawable.dumplings)
                val image6=painterResource(R.drawable.pork_belly_perfection)




                /********************************************************/

                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image4,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Ramen", fontWeight = FontWeight.Medium)
                    }
                }


                /******************************************************/




                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image5,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Dumplings", fontWeight = FontWeight.Medium)
                    }
                }
                /******************************************************/
                Button(onClick =onNext   ,
                    colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {

                    Column{
                        Image(
                            painter = image6,
                            contentDescription=null,
                            modifier= Modifier
                                .height(90.dp)
                                .width(90.dp)
                                .fillMaxHeight()
                                .fillMaxWidth()
                                .clip(RoundedCornerShape(6.dp)),

                            contentScale=ContentScale.Crop
                        )
                        Text (text="Pork Belly", fontWeight = FontWeight.Medium)
                    }
                }
                /****************************************************/







            }


        }
        }

    }
