package com.sena.introducctionjetpackcompose.view

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sena.introducctionjetpackcompose.R
import com.sena.introducctionjetpackcompose.ui.theme.PurpleGrey80
import com.sena.introducctionjetpackcompose.ui.theme.Red50

@Preview(showSystemUi = true)
@Composable
fun LoginScreen() {
    val context = LocalContext.current
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black)
    ) {
        ViewTittle()
        ViewImage()
        ViewBoxEmail()
        ViewPassword()
        Spacer(modifier = Modifier.height(60.dp))
        ViewButton(context)
    }

}

@Composable
fun ViewTittle() {
    Text(
        text = "My Login",
        color = Color.White,
        fontSize = 30.sp,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 100.dp)
    )
}

@Composable
fun ViewImage() {
    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(top = 30.dp),
        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(
            painter = painterResource(id = R.drawable.logo_login),
            contentDescription = "Logo Login"
        )
    }
}

@Composable
fun ViewBoxEmail() {
    var email by rememberSaveable { mutableStateOf("") }

    OutlinedTextField(modifier = Modifier
        .fillMaxWidth()
        .padding(horizontal = 20.dp, vertical = 15.dp),
        value = email,
        onValueChange = { email = it },
        label = { Text(text = "Email") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.White, // Borde al enfocar
            unfocusedBorderColor = PurpleGrey80, // Borde sin enfocar
            focusedTextColor = Color.White,//Color Texto al enfocar
            unfocusedTextColor = Color.White,//Color texto sin enfocar
            focusedLabelColor = Color.Green,//Color hint al enfocar
            unfocusedLabelColor = PurpleGrey80,//Color hint sin enfocar
            cursorColor = Color.White, // Color del cursor
        )
    )
}

@Composable
fun ViewPassword() {
    var password by rememberSaveable { mutableStateOf("") }
    OutlinedTextField(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp, vertical = 15.dp),
        value = password,
        onValueChange = { password = it },
        label = { Text(text = "Password") },
        colors = OutlinedTextFieldDefaults.colors(
            focusedBorderColor = Color.White, // Borde al enfocar
            unfocusedBorderColor = PurpleGrey80, // Borde sin enfocar
            focusedTextColor = Color.White,//Color Texto al enfocar
            unfocusedTextColor = Color.White,//Color texto sin enfocar
            focusedLabelColor = Color.Green,//Color hint al enfocar
            unfocusedLabelColor = PurpleGrey80,//Color hint sin enfocar
            cursorColor = Color.White, // Color del cursor
        )
    )
}

@Composable
fun ViewButton(context:Context) {
    Button(
        onClick = { Toast.makeText(context, "Hola mundo", Toast.LENGTH_LONG).show() },
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp),
        colors = ButtonDefaults.buttonColors(Red50)
    ) {
        Text(text = "Iniciar Sesión", fontSize = 16.sp)
    }
}
