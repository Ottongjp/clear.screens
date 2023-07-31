package com.example.clearscreens.Screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController


@Composable
fun school(){

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SchoolScreen(navController: NavController){
    var school = remember {
        mutableStateOf("")
    }
    var level = remember {
        mutableStateOf("")
    }
    val bestCourse = remember {
        mutableStateOf("")
    }
    val hopeful = remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        OutlinedTextField(
            value = school.value,
            onValueChange = {school.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = { Text("SCHOOL:") }
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = level.value,
            onValueChange = {level.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("LEVEL:")}
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = bestCourse.value,
            onValueChange = {bestCourse.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("BEST COURSE:")}
        )
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = hopeful.value,
            onValueChange = {hopeful.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("HOPEFUL CGPA:")}
        )
    }
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
        Button(onClick = { navController.navigate("DisplayScreen") }) {
            Text("Next")
        }
    }
}