package com.ainhoa.crud

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("com.ainhoa.crud")
		.start()
}

