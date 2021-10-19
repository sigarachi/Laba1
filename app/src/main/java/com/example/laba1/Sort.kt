package com.example.laba1

class Sort {
    fun sortList(list: List<String>) {
        var sortedList: List<String> = emptyList()
        for(element in list){
            if(list.count {it == element } == 1){
                sortedList.toMutableList().add(element)
            }
        }

        return sortedList.toMutableList().sort()
    }

}