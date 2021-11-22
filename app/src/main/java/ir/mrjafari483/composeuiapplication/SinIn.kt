package ir.mrjafari483.composeuiapplication

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.*
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = colorResource(id = R.color.purple_700))
    ) {
        topPage()
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(1f),

            shape = RoundedCornerShape(50.dp, 50.dp, 0.dp, 0.dp)

        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.2f)
                ) {
                    Text(
                        modifier = Modifier.padding(20.dp, 40.dp, 0.dp),
                        text = "Welcome Back",
                        fontSize = 35.sp,
                        color = colorResource(id = R.color.dark),
                        fontFamily = FontFamily(
                            Font(R.font.roboto_bold)
                        )
                    )
                    Text(
                        modifier = Modifier.padding(30.dp, 10.dp, 0.dp),
                        text = "Hello there , sign in to continue!",
                        fontSize = 15.sp,
                        color = colorResource(id = R.color.white1200),
                        fontFamily = FontFamily(
                            Font(R.font.roboto_light)
                        )
                    )

                }

                MyTextField("Enter your username or email")



                MyTextField("Enter your Password")
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = androidx.compose.ui.Modifier
                        .fillMaxWidth()
                        .padding(30.dp, 0.dp, 30.dp, 0.dp)
                ) {
                    blueButton(text = "SIN IN", 20)
                }


            }


        }


    }
}

@Composable
fun topPage() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.2f)
    ) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            painter = painterResource(id = R.drawable.jetpack), contentDescription = ""
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Greeting()
}