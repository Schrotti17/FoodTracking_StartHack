package com.example.foodtracker.data

import com.example.foodtracker.R
import com.example.foodtracker.model.TrackedDay

val trackedDayData = listOf(
    TrackedDay("Friday", listOf(R.drawable.meal, R.drawable.red_bull, R.drawable.banana)),
    TrackedDay("Thursday", listOf(R.drawable.red_bull, R.drawable.hot_dog, R.drawable.hot_dog)),
    TrackedDay("Wednesday", listOf(R.drawable.banana, R.drawable.red_bull, R.drawable.hot_dog)),
    TrackedDay("Tuesday", listOf(R.drawable.meal, R.drawable.hot_dog, R.drawable.red_bull)),
    TrackedDay("Monday", listOf(R.drawable.red_bull, R.drawable.red_bull, R.drawable.meal))
)