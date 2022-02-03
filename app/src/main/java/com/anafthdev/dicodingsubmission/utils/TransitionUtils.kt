package com.anafthdev.dicodingsubmission.utils

import android.app.Activity
import android.os.Bundle
import android.transition.TransitionInflater
import android.view.View
import androidx.annotation.TransitionRes
import androidx.core.app.ActivityOptionsCompat
import androidx.core.util.Pair

/**
 * @author kafri8889 (https://github.com/kafri8889)
 */
object TransitionUtils {
	
	fun Activity.makeSceneTransitionAnimation(lv: List<View>, ln: List<String>): Bundle {
		val transitionPairs = ArrayList<Pair<View, String>>()
		if (lv.size != ln.size) throw IndexOutOfBoundsException("Size not same (lv: ${lv.size}, ln: ${ln.size})")
		else lv.forEachIndexed { index, v -> transitionPairs.add(Pair(v, ln[index])) }
		
		return ActivityOptionsCompat.makeSceneTransitionAnimation(this, *transitionPairs.toTypedArray()).toBundle()!!
	}
	
	fun Activity.applySceneTransitionAnimation(lv: List<View>, ln: List<String>) {
		if (lv.size != ln.size) throw IndexOutOfBoundsException("Size not same (lv: ${lv.size}, ln: ${ln.size})")
		else lv.forEachIndexed { index, v -> v.transitionName = ln[index] }
		
	}
	
	fun Activity.setSharedElementEnterTransition(@TransitionRes resId: Int) {
		this.window.sharedElementEnterTransition = TransitionInflater.from(this).inflateTransition(resId)
	}
}