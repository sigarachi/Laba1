package com.example.laba1

class Sort {
    var sortedList: MutableList<Int> = mutableListOf()

    fun sortList(list: MutableList<Int>) :MutableList<Int> {
        for(element in list){
            if(list.count {it == element } == 1){
                sortedList.add(element)
            }
        }

       sortedList.sort()

        return sortedList
    }

}