package com.example.jetpackcompose.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpackcompose.R
import com.example.jetpackcompose.model.sampleProducts


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProductDetailScreen(productId: Int, navController: NavController) {
    val product = sampleProducts.find { it.id == productId } ?: return

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(product.name) },
                navigationIcon = {
                    IconButton(onClick = { navController.popBackStack() }) {
                        Icon(Icons.Default.ArrowBack, contentDescription = "Back")
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(containerColor = Color(0xFFDAB6FC)) // Màu tím nhạt
            )
        },
        bottomBar = { BottomNavigationBar() } // Thêm thanh điều hướng dưới
    )
    { paddingValues ->
        Column (
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(product.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
            Spacer(modifier = Modifier.height(16.dp))
            Image(
                painter = painterResource(id = product.image),
                contentDescription = product.name,
                modifier = Modifier.fillMaxWidth().height(200.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(product.description, fontSize = 16.sp, color = Color.Gray)
            Row {
                Column(modifier = Modifier.weight(1f)) {
                    Text("CPU", fontWeight = FontWeight.Bold)
                    Text("Graphics", fontWeight = FontWeight.Bold)
                    Text("Screen", fontWeight = FontWeight.Bold)
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text(product.CPU)  // Đảm bảo `Product` có thuộc tính `cpu`
                    Text(product.Graphicscard)  // Đảm bảo `Product` có thuộc tính `graphicsCard`
                    Text(product.Screensize)  // Đảm bảo `Product` có thuộc tính `screenSize`
                }
            }
            Row {
                Column(modifier = Modifier.weight(1f)) {
                    Text("Hàng chính hãng")
                    Text("Giao hàng miễn phí trong 90 phút")
                    Text("Chính sách đổi trả")
                }
                Column(modifier = Modifier.weight(1f)) {
                    Text("Bảo hành 12 tháng")  // Đảm bảo `Product` có thuộc tính `cpu`
                    Text("Hỗ trợ cài đặt miễn phí")  // Đảm bảo `Product` có thuộc tính `graphicsCard`
                    Text("Chính sách trả góp")  // Đảm bảo `Product` có thuộc tính `screenSize`
                }
            }
            //Phần bình luận
            Text("Reviews", fontSize = 18.sp, fontWeight = FontWeight.Bold)
            Column (modifier = Modifier.padding(8.dp)) {
                Box(
                    modifier = Modifier.border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(5.dp)
                ){
                    Row(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.customer ),
                            contentDescription = "user",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp) // Điều chỉnh kích thước hình ảnh
                                .align(Alignment.CenterVertically)
                        )
                        Column {
                            Row {
                                repeat(4) {
                                    Image(
                                        painter = painterResource(id = R.drawable.vote), // Thay bằng icon trong drawable
                                        contentDescription = "My Icon",
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                            Text("Màn sáng đẹp đúng như shop đăng bán shop nhiệt tình dễ thương đóng gói quá trời cẩn thận")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(5.dp)
                ){
                    Row(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.customer ),
                            contentDescription = "user",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp) // Điều chỉnh kích thước hình ảnh
                                .align(Alignment.CenterVertically)
                        )
                        Column {
                            Row {
                                repeat(5) {
                                    Image(
                                        painter = painterResource(id = R.drawable.vote), // Thay bằng icon trong drawable
                                        contentDescription = "My Icon",
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                            Text("Shop giao hàng nhanh, đóng gói cẩn thận tỉ mỉ\n" +
                                    "Nhận được hàng bóc ra mà rất yên tâm\n" +
                                    "Có nhu cầu sẽ ủng hộ shop tiếp\n" +
                                    "Cám ơn shop nhiều.")
                        }
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Box(
                    modifier = Modifier.border(1.dp, Color.Black, RoundedCornerShape(8.dp))
                        .padding(5.dp)
                ){
                    Row(modifier = Modifier.padding(8.dp)) {
                        Image(
                            painter = painterResource(id = R.drawable.customer ),
                            contentDescription = "user",
                            modifier = Modifier
                                .width(50.dp)
                                .height(50.dp) // Điều chỉnh kích thước hình ảnh
                                .align(Alignment.CenterVertically)
                        )
                        Column {
                            Row {
                                repeat(2) {
                                    Image(
                                        painter = painterResource(id = R.drawable.vote), // Thay bằng icon trong drawable
                                        contentDescription = "My Icon",
                                        modifier = Modifier.size(20.dp)
                                    )
                                }
                            }
                            Text("Shop giao hàng nhanh, đóng gói cẩn thận tỉ mỉ\n" +
                                    "Nhận được hàng bóc ra mà rất yên tâm\n" +
                                    "Có nhu cầu sẽ ủng hộ shop tiếp\n" +
                                    "Cám ơn shop nhiều.")
                        }
                    }
                }

            }
            Row(
                modifier = Modifier.padding(8.dp).height(100.dp),
                verticalAlignment = Alignment.CenterVertically ,
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            )
            //Giá và nút mua
            {
                Text("Giá: ${product.price}", fontSize = 18.sp, color = Color.Red,)
                Button(onClick = {}){
                    Text("Add To Cart")
                }
            }
            Spacer(modifier = Modifier.height(16.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("Quay lại")
            }
        }
    }
}

