package com.example.google_sign_up_page

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.CheckboxColors
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.google_sign_up_page.ui.theme.Google_Sign_Up_PageTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.Start, 
                modifier = Modifier
                    .background(color = Color.White)
                    .fillMaxSize()
                    .padding(all = 40.dp)){
                Image(
                    painter = painterResource(id = R.drawable.google_logo), 
                    contentDescription = "", 
                    modifier = Modifier.width(100.dp))
                Spacer(modifier = Modifier.height(30.dp))
                Text(text = "Create your Google Account", style = TextStyle(
                    color = Color.Black,
                    fontSize = 25.sp,
                ))
                Spacer(modifier = Modifier.height(30.dp))
                var name by remember{
                    mutableStateOf("")
                }
                var last by remember{
                    mutableStateOf("")
                }
                Row (horizontalArrangement = Arrangement.SpaceBetween){
                    OutlinedTextField(value = name,
                        onValueChange = {name = it},
                        label = {Text("First Name")},
                        modifier = Modifier.width(150.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFF4285F4),
                            focusedLabelColor = Color(0xFF4285F4),
                            unfocusedBorderColor = Color.LightGray,
                    ))
                    Spacer(modifier = Modifier.width(10.dp))
                    OutlinedTextField(value = last,
                        onValueChange = {last = it},
                        label = {Text("Last Name")},
                        modifier = Modifier.width(150.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFF4285F4),
                            focusedLabelColor = Color(0xFF4285F4),
                            unfocusedBorderColor = Color.LightGray
                        ))
                }
                Spacer(modifier = Modifier.height(10.dp))
                var username by remember {
                    mutableStateOf("")
                }
                OutlinedTextField(value = username,
                    onValueChange = {username = it},
                    label = {Text("Username")},
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color(0xFF4285F4),
                        focusedLabelColor = Color(0xFF4285F4),
                        unfocusedBorderColor = Color.LightGray
                    ),
                modifier = Modifier.fillMaxWidth())
                Spacer(modifier = Modifier.height(7.dp))
                Text("You can use letters,numbers & periods", style = TextStyle(
                    color=Color.Gray,
                    fontSize = 15.sp
                )
                )
                Spacer(modifier = Modifier.height(15.dp))
                Text("Use my current email address instead", style = TextStyle(
                    color=Color(0xFF4285F4),
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold
                )
                )
                Spacer(modifier = Modifier.height(20.dp))
                var password by remember{
                    mutableStateOf("")
                }
                var confirm by remember {
                    mutableStateOf("")
                }
                Row (horizontalArrangement = Arrangement.SpaceBetween){
                    OutlinedTextField(value = password,
                        onValueChange = {password = it},
                        label = {Text("Password")},
                        modifier = Modifier.width(150.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFF4285F4),
                            focusedLabelColor = Color(0xFF4285F4),
                            unfocusedBorderColor = Color.LightGray,
                        ))
                    Spacer(modifier = Modifier.width(10.dp))
                    OutlinedTextField(value = confirm,
                        onValueChange = {confirm = it},
                        label = {Text("Confirm")},
                        modifier = Modifier.width(150.dp),
                        colors = TextFieldDefaults.outlinedTextFieldColors(
                            focusedBorderColor = Color(0xFF4285F4),
                            focusedLabelColor = Color(0xFF4285F4),
                            unfocusedBorderColor = Color.LightGray
                        ))
                }
                Spacer(modifier = Modifier.height(7.dp))
                Text("Use 8 or more characters with a mix of letters, numbers & symbols", style = TextStyle(
                    color=Color.Gray,
                    fontSize = 15.sp
                )
                )
                var check by remember {
                    mutableStateOf(false)
                }
                Row(horizontalArrangement = Arrangement.Start){
                    Checkbox(
                        checked = check,
                        onCheckedChange = {check = it},
                        colors = CheckboxDefaults.colors(
                            checkedColor = Color(0xFF4285F4)
                        )
                    )
                    Text("Show password", modifier = Modifier.padding(top = 13.dp), style = TextStyle(
                        fontSize = 15.sp
                    )
                    )
                }
                Spacer(modifier = Modifier.height(70.dp))
                Row(horizontalArrangement = Arrangement.SpaceBetween){
                    Text("Sign in instead", style = TextStyle(
                        color=Color(0xFF4285F4),
                        fontSize = 18.sp,
                        fontWeight = FontWeight.SemiBold
                    ), modifier = Modifier.padding(top = 9.dp) )
                    Spacer(modifier = Modifier.width(100.dp))
                    Button(onClick = { /*TODO*/ }, colors = ButtonDefaults.buttonColors(
                            containerColor = Color(0xFF4285F4),
                        contentColor = Color.White
                    ),shape = RoundedCornerShape(5.dp)
                    ) {
                            Text("Next")
                    }
                }
            }
        }
    }
}
