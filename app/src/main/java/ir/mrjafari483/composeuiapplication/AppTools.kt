package ir.mrjafari483.composeuiapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.findNavController

@Composable
fun MyTextField(hint :String) {
    var textFieldState = remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier
            .padding(20.dp,10.dp,20.dp,20.dp)
            .fillMaxWidth(),
        value = textFieldState.value,
        colors = TextFieldDefaults.textFieldColors(
            backgroundColor = colorResource(id = R.color.white800),
            cursorColor = Color.Black,
            disabledLabelColor =  Color.Blue,
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent),
        shape =RoundedCornerShape(10.dp,10.dp,10.dp,10.dp),
        onValueChange = { newvalue ->
            textFieldState.value = newvalue
        },
        label = {
            Text(text = hint)

        })
}

@Composable
fun blueButton(text : String,margin_top : Int){
    OutlinedButton(
        onClick = { /*TODO*/ },
        modifier = androidx.compose.ui.Modifier
            .height(50.dp)
            .fillMaxWidth()
            .offset(0.dp, margin_top.dp)
            .border(width = 2.dp, color = colorResource(id = R.color.white),shape = RoundedCornerShape(8.dp)),



        colors = ButtonDefaults.textButtonColors(
            backgroundColor = colorResource(id = R.color.purple_700)
        )) {
        Text(text = text , color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_medium)))
    }
}



