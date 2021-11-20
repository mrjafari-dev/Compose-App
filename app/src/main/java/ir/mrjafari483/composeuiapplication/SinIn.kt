package ir.mrjafari483.composeuiapplication

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.fragment.app.Fragment

class SinIn : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                SetNavColor.setcolor(requireActivity(), Color.WHITE)
                Greeting()
            }
        }
    }
}
@Composable
fun Greeting(){
    Column(modifier = Modifier
        .fillMaxHeight()
        .fillMaxWidth()
        .background(color = colorResource(id = R.color.purple_700))) {
        topPage()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f),

            shape = RoundedCornerShape(50.dp,50.dp,0.dp,0.dp)

        ) {
            Box(
                modifier = Modifier
                    .height(40.dp)
                    .fillMaxHeight()
                    .padding(30.dp)
                    .offset(0.dp, 80.dp)
            ){
                MyTextField("Enter your username or email")

            }

        }



    }
}
@Composable
fun topPage(){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f)
    ) {
        Text(text = "sadad")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview(){
Greeting()
}