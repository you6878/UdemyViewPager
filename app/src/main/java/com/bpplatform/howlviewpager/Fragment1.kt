package com.bpplatform.howlviewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by myeongsic on 2018. 1. 24..
 */
class Fragment1 : Fragment(){

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        var view = inflater!!.inflate(R.layout.fragment_1,container,false)

        return view
    }
}