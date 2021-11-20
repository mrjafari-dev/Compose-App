package ir.mrjafari483.composeuiapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp

@Composable
fun MyTextField(hint :String) {
    var textFieldState = remember {
        mutableStateOf("")
    }
    TextField(
        modifier = Modifier.fillMaxWidth(),
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



