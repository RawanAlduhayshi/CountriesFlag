package com.rawanalduhyshi.countriesflag.model

import com.squareup.moshi.Json

data class DataItem(

	@Json(name="flag")
	val flag: String? = null,

	@Json(name="name")
	val name: String? = null,

	@Json(name="iso2")
	val iso2: String? = null,

	@Json(name="iso3")
	val iso3: String? = null
)