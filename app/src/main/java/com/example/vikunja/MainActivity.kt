package com.example.vikunja

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import java.net.HttpURLConnection
import java.net.URI
import java.net.URL
import javax.net.ssl.HttpsURLConnection

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var loginBtn : Button
    private lateinit var apiURLInput : EditText
    private lateinit var usernameInput : EditText
    private lateinit var passwordInput : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loginBtn = findViewById(R.id.login)
        apiURLInput = findViewById(R.id.apiURL)
        usernameInput = findViewById(R.id.username)
        passwordInput = findViewById(R.id.password)

        loginBtn.setOnClickListener(this)
    }

    /*
    private fun goodAPI(url: URL): Thread {
        return Thread {
            val connection = url.openConnection()
        }
    }
*/
    override fun onClick(v: View?) {
        checkAPI().start()
    }

    private fun logIn(totp: Boolean): Thread {
        return Thread {
            val username = usernameInput.text.toString()
            val password = passwordInput.text.toString()
        }
    }

    private fun checkAPI(): Thread {
        val apiURL = apiURLInput.text.toString()

        return Thread {
            val url = URL("$apiURL/info")
            val connection = url.openConnection() as HttpsURLConnection
            //connection.requestMethod = "GET"

            if (connection.responseCode == 200) {
                logIn(false)
            } else {
                // Display message for bad API url
            }
        }
    }
}