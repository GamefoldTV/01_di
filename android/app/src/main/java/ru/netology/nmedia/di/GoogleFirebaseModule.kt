package ru.netology.nmedia.di


import com.google.android.gms.common.GoogleApiAvailability
import com.google.firebase.messaging.FirebaseMessaging
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class GoogleFirebaseModule {

    @Singleton
    @Provides
    fun provideFirebaseMessaging(): FirebaseMessaging =
       FirebaseMessaging.getInstance()


    @Singleton
    @Provides
    fun provideGoogleApiAvailability(): GoogleApiAvailability =
        GoogleApiAvailability.getInstance()
}