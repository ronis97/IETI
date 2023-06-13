package com.example.taskplanner.Storage;

import android.content.SharedPreferences


public class ImplementedStorage {

        private String TOKEN_KEY = "Token_key";
        private SharedPreferences sharedPreferences = null;

        public void SharedPreferencesStorage(SharedPreferences sharedPreferences) {
            this.sharedPreferences = sharedPreferences;
        }

        public void saveToken(String token) {
            sharedPreferences.edit().putString(TOKEN_KEY, token).apply();
        }

        public String getToken()  {
            return sharedPreferences.getString(TOKEN_KEY, "");
        }
}
