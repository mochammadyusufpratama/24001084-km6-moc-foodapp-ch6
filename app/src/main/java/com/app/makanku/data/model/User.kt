package com.app.makanku.data.model

import com.google.firebase.auth.FirebaseUser

data class User(
    val id: String,
    val fullName: String,
    val email: String,
    val photoUrl: String,
)

fun FirebaseUser?.toUser() =
    this?.let {
        User(
            id = this.uid,
            fullName = this.displayName.orEmpty(),
            email = this.email.orEmpty(),
            photoUrl = this.photoUrl.toString(),
        )
    }
