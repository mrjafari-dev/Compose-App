package ir.mrjafari483.composeuiapplication

import android.os.Bundle
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.ColorRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.ComposeView
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.fontResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import org.intellij.lang.annotations.JdkConstants
import java.lang.reflect.Modifier

class WellcomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return ComposeView(requireContext()).apply {
            setContent {
                SetNavColor.setcolor(requireActivity(), R.color.purple_200)
                Column(modifier =
                androidx.compose.ui.Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(color = colorResource(id = R.color.purple_700)),

                ) {
                    Column(
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .fillMaxHeight(0.4f),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){

                        Image(modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .fillMaxHeight() ,
                                painter = painterResource(id = R.drawable.jetpack), contentDescription = "")
                    }
                    Column(
                        modifier = androidx.compose.ui.Modifier.padding(30.dp, 20.dp, 0.dp, 0.dp) ,
                        horizontalAlignment = Alignment.Start
                    ){
                        Text(text = "Welcome" ,fontSize = 35.sp ,color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_bold)))
                        Text(modifier = androidx.compose.ui.Modifier
                            .padding(5.dp, 20.dp, 0.dp, 0.dp)
                            ,text = "Manage your Expenses" ,fontSize = 17.sp ,color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_light)))
                        Text(modifier = androidx.compose.ui.Modifier
                            .padding(5.dp, 10.dp, 0.dp, 0.dp)
                            ,text = "Seamlessly & Intuitively" ,fontSize = 20.sp ,color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_medium)))

                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .padding(30.dp, 0.dp, 30.dp, 0.dp)
                    ) {

                        OutlinedButton(
                             onClick = {
                                 findNavController().navigate(R.id.action_wellcomeFragment_to_sinIn)
                             },
                             modifier = androidx.compose.ui.Modifier
                                 .height(50.dp)
                                 .fillMaxWidth()
                                 .offset(0.dp, 70.dp)
                                 .background(color = colorResource(id = R.color.purple_700)),
                             shape = RoundedCornerShape(8.dp),


                             ) {
                            Text(text = "Already have an account? ",fontFamily = FontFamily(Font(R.font.roboto_medium)) /*, color = colorResource(id = R.color.purple_700)*/)
                        }
                        OutlinedButton(
                            onClick = { /*TODO*/ },
                            modifier = androidx.compose.ui.Modifier
                                .height(50.dp)
                                .fillMaxWidth()
                                .offset(0.dp, 90.dp)
                                .border(width = 2.dp, color = colorResource(id = R.color.white),shape = RoundedCornerShape(8.dp)),



                            colors = ButtonDefaults.textButtonColors(
                                backgroundColor = colorResource(id = R.color.purple_700)
                            )) {
                            Text(text = "Create an account" , color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_medium)))
                        }

                    }

                    Row(
                        horizontalArrangement = Arrangement.Center,
                        modifier = androidx.compose.ui.Modifier
                            .fillMaxWidth()
                            .offset(0.dp,130.dp)
                    ){
                        Text(text = "Already have an account?SinIn" , color = colorResource(id = R.color.white400),fontFamily = FontFamily(Font(R.font.roboto_light)))
                        Text(text = "SinIn" , color = colorResource(id = R.color.white),fontFamily = FontFamily(Font(R.font.roboto_medium)))

                    }


                }
            }
        }
    }
}

