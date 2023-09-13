package com.anafthdev.dicodingsubmission.foundation.util

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
object TransitionUtil {
	
	fun Activity.makeSceneTransitionAnimation(lv: List<View>, ln: List<String>): Bundle {
		return ActivityOptionsCompat.makeSceneTransitionAnimation(
			this,
			*ArrayList<Pair<View, String>>().apply {
				if (lv.size != ln.size) throw IllegalArgumentException("Size not equals (lv: ${lv.size}, ln: ${ln.size})")
				lv.forEachIndexed { index, v -> add(Pair(v, ln[index])) }
			}.toTypedArray()
		).toBundle()!!
	}
	
	fun Activity.setSharedElementEnterTransition(@TransitionRes resId: Int) {
		window.sharedElementEnterTransition = TransitionInflater.from(this).inflateTransition(resId)
	}

	fun applySceneTransitionAnimation(lv: List<View>, ln: List<String>) {
		if (lv.size != ln.size) throw IllegalArgumentException("Size not equals (lv: ${lv.size}, ln: ${ln.size})")
		lv.forEachIndexed { index, v -> v.transitionName = ln[index] }
	}
}