package com.example.jetpackcompose.model

import com.example.jetpackcompose.R

data class Product(
    val id: Int,
    val name: String,
    val price: String,
    val description: String,
    val CPU: String,
    val Graphicscard: String,
    val Screensize: String,
    val image: Int
)

// Dữ liệu mẫu cho ứng dụng
val sampleProducts = listOf(
    Product(1, "Huawei MateBook D15 R7 5700U", "$1200",
        "Laptop Huawei MateBook D15 R7 5700U/8GB/512GB/15.6FHD/Win11","Ryzen 7",
        "AMD Radeon Graphics","15.6", R.drawable.laptop),
    Product(2,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop2),
    Product(3,  "MacBook Air 13 M3 2024 8CPU/8GPU/16GB/256GB", "26.990.000 ₫",
        "MacBook Air 13 M3 2024 8CPU/8GPU/16GB/256GB","M3",
        "none","13.6", R.drawable.laptop3),
    Product(4, "Laptop Dell Inspiron N3520 i5 1235U/16GB/512GB/15.6FHD/Win11/Office HS21", "16.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Core i5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop4),
    Product(5,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop5),
    Product(6,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop6),
    Product(7,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop6),
    Product(8,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop6),
    Product(9,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop6),
    Product(10,  "HP Gaming Victus 16-s0078AX R5 7640HS (8C5N7PA)", "17.490.000 ₫",
        "Laptop HP Gaming Victus 16-s0078AX R5-7640HS/16GB/512GB/16.1FHD/Nvidia RTX3050 6GB/Win11","Ryzen 5",
        "NVIDIA GeForce RTX 3050 6GB GDDR6 (143 AI TOPS)","16", R.drawable.laptop6)
)
