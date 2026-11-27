package com.chan.myapplication.uicontroller

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.chan.myapplication.uicontroller.route.DestinasiEntry
import com.chan.myapplication.uicontroller.route.DestinasiHome
import com.chan.myapplication.view.EntrySiswaScreen
import com.chan.myapplication.view.HomeScreen

@Composable
fun DataSiswaApp(
    navController: NavHostController = rememberNavController(),
    modifier: Modifier = Modifier
) {
    HostNavigasi(navController = navController, modifier = modifier)
}

@Composable
fun HostNavigasi(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = DestinasiHome.route,
        modifier = modifier
    ) {
        composable(DestinasiHome.route) {
            HomeScreen(
                navigateToItemEntry = { navController.navigate(DestinasiEntry.route) }
            )
        }
        composable(DestinasiEntry.route) {
            EntrySiswaScreen(
                navigateBack = { navController.navigate(DestinasiHome.route) }
            )
        }
    }
}