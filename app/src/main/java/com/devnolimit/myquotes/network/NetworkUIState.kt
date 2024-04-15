package com.devnolimit.myquotes.network

sealed class NetworkUIState<T> {
    class LOADING<T>: NetworkUIState<T>()
    data class SUCCESS<T>(val data: T): NetworkUIState<T>()
    data class ERROR<T>(val error: Any): NetworkUIState<T>()
}