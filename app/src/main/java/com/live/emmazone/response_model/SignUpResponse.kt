package com.live.emmazone.response_model


import com.google.gson.annotations.SerializedName

data class SignUpResponse(
    @SerializedName("body")
    var body: Body,
    @SerializedName("code")
    var code: Int, // 200
    @SerializedName("message")
    var message: String, // Signup successfully
    @SerializedName("success")
    var success: Boolean // true
) {
    data class Body(
        @SerializedName("countryCode")
        var countryCode: String, // +91
        @SerializedName("created")
        var created: Int, // 1643605281
        @SerializedName("createdAt")
        var createdAt: String, // 2022-01-31T05:01:21.000Z
        @SerializedName("email")
        var email: String, // sachin1234@yopmail.com
        @SerializedName("facebookId")
        var facebookId: String,
        @SerializedName("forgotPasswordHash")
        var forgotPasswordHash: String,
        @SerializedName("gender")
        var gender: Int, // 0
        @SerializedName("googleId")
        var googleId: String,
        @SerializedName("id")
        var id: Int, // 264
        @SerializedName("image")
        var image: String, // 3d2d8d8d-2035-4c20-9ae7-66295089775b.png
        @SerializedName("isAt")
        var isAt: Int, // 1643377185
        @SerializedName("isVerified")
        var is_Verified: Int, // 0
        @SerializedName("latitude")
        var latitude: String, // 0.000000
        @SerializedName("location")
        var location: String,
        @SerializedName("longitude")
        var longitude: String, // 0.000000
        @SerializedName("nameuser")
        var nameuser: String,
        @SerializedName("notification_status")
        var notificationStatus: Int, // 1
        @SerializedName("otp")
        var otp: Int, // 1111
        @SerializedName("password")
        var password: String, // $2y$10$Z7/DIFCxUw.5u1FRKFSiuux.m.AOaY.dgou/UrLKp5s0QxRniu0IK
        @SerializedName("phone")
        var phone: String, // 7807536707
        @SerializedName("role")
        var role: Int, // 3
        @SerializedName("status")
        var status: Int, // 1
        @SerializedName("token")
        var token: String, // eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJkYXRhIjp7ImlkIjoyNjQsImVtYWlsIjoic2FjaGluMTIzNEB5b3BtYWlsLmNvbSJ9LCJpYXQiOjE2NDM2MDUyODF9.sl6wKavvLWu2az2zYvYl4p4T1jBO5FBobvhcm9cheBU
        @SerializedName("updated")
        var updated: Int, // 1643605281
        @SerializedName("updatedAt")
        var updatedAt: String, // 2022-01-31T05:01:21.000Z
        @SerializedName("username")
        var username: String, // sachin
        @SerializedName("verified")
        var verified: Int // 1
    )
}