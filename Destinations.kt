package com.example.navhomework006bottomnavigation

import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations{
    val Route:String
    val icon:ImageVector
    val title:String
}
object login:Destinations{
    override val Route: String = "login"
    override val icon: ImageVector = Icons.Filled.Home
    override val title: String = "login"
}
object welcom:Destinations{
    override val Route: String = "welcom"
    override val icon: ImageVector = Icons.Filled.Settings
    override val title: String = "welcom"
}


