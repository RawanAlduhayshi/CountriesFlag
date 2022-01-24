package com.rawanalduhyshi.countriesflag

import com.rawanalduhyshi.countriesflag.model.DataItem
import com.squareup.moshi.Json

data class Response(

	@Json(name="msg")
	val msg: String? = null,

	@Json(name="data")
	val data: List<DataItem?>? = null,

	@Json(name="error")
	val error: Boolean? = null
)

