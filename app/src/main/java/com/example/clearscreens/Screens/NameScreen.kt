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


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NameScreen(
    navController: NavController
){
    var firstname = remember {
        mutableStateOf("")
    }
    var lastname = remember {
        mutableStateOf("")
    }
    var username = remember {
        mutableStateOf("")
    }


    Column(modifier = Modifier
        .fillMaxSize()
        .background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center)
    {
        OutlinedTextField(
            value = firstname.value,
            onValueChange = {firstname.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = { Text("FIRST NAME:")
            })
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = lastname.value,
            onValueChange = {lastname.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {Text("LAST NAME:")
            })
        Spacer(modifier = Modifier.height(30.dp))
        OutlinedTextField(
            value = username.value,
            onValueChange = {username.value = it},
            shape = RoundedCornerShape(10.dp),
            textStyle = TextStyle(color = Color.Black),
            label = {
                Text("USERNAME:")
            })
    }
    Row(modifier = Modifier.fillMaxSize(),
        verticalAlignment = Alignment.Top,
        horizontalArrangement = Arrangement.SpaceBetween) {
        Button(onClick = { navController.popBackStack() }) {
            Text("Back")
        }
        Button(onClick = { navController.navigate("SchoolScreen") }) {
            Text("Next")
        }
    }
}