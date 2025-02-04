/**
 * Backpack for Android - Skyscanner's Design System
 *
 * Copyright 2018 Skyscanner Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.skyscanner.backpack.bottomsheet

import android.content.Context
import android.util.AttributeSet
import androidx.cardview.widget.CardView
import net.skyscanner.backpack.R

open class BpkBottomSheet @JvmOverloads constructor(
  context: Context,
  attrs: AttributeSet? = null,
  defStyleAttr: Int = 0,
) : CardView(context, attrs, defStyleAttr) {

  init {
    cardElevation = resources.getDimension(R.dimen.bpkElevationLg)
    setBackgroundResource(R.drawable.bpk_bottom_sheet_background)
  }
}
