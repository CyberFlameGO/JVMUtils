package net.greemdev.utils

import okhttp3.*
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.RequestBody.Companion.toRequestBody
import java.io.IOException

object Http {

    @JvmStatic private val client: OkHttpClient = OkHttpClient()

    @JvmStatic public fun post(targetUrl: String, jsonPayload: String): String? {
        val body: RequestBody = jsonPayload.toRequestBody("application/json; charset=utf-8".toMediaType())
        val request: Request = Request.Builder()
            .url(targetUrl)
            .post(body)
            .build()

        return try {
            val response: Response = client.newCall(request).execute()
            if (response.isSuccessful) {
                response.body?.string()
            } else {
                ""
            }
        } catch (e: IOException) {
            return ""
        }
    }

}