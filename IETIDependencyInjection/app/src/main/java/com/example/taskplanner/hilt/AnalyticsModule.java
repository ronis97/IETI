package com.example.taskplanner.hilt;

import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.GoogleAnalytics;
import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;

@Module
@InstallIn(SingletonComponent.class)
public class AnalyticsModule {
    @Provides
    public AnalyticsService provideAnalyticsService() {
        return GoogleAnalyticsService();
    }
}
